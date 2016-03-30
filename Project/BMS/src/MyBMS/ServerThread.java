package MyBMS;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

 class ServerThread extends Thread{
	Socket s= null;
	int port = 4321;
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	// 在指定的端口监听客户端的连接请求
	
	public ServerThread(Socket s){
			
		this.s = s;
		try {
			
			dis = new DataInputStream(s.getInputStream());            //读取客户端发来的消息
			dos = new DataOutputStream(s.getOutputStream());		  //向服务器发送消息
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public synchronized  void run() {
		while(true){
			try {
			
				String inInfo = dis.readUTF();    //读取要进行什么样的操作								
				
				//下面试管理员的增删改查操作
				if(inInfo.equals("addBook")){
					
					Boolean s2=BookMGT.getInstance().addBook(new Book(dis.readUTF(),dis.readUTF(),dis.readUTF(),dis.readDouble()));
					//以上读取流 接收到一本书，并添加到动态数组内
					BookMGT.getInstance().doSave();//保存
					dos.writeBoolean(s2);//写入反馈信息，即添加成功与否
				}if(inInfo.equals("deleteBook")){  //删除书籍操作
					String delete = dis.readUTF();//读取删除命令
					Boolean b1 =BookMGT.getInstance().deleteBookByCode(delete);
					//以上执行删除操作
					BookMGT.getInstance().doSave();//保存
					//根据删除的返回值，确认反馈信息，并写入至流中
					if(b1){
						dos.writeUTF("编号为"+delete+"的书籍删除成功！");
					}else{
						dos.writeUTF("编号为"+delete+"的书籍删除失败，它不存在！");
					}
					
				}if(inInfo.equals("modifyPrice")){//读取修改命令
					String modify = dis.readUTF();//读取修改书籍的编号
					
					Book book2 = BookMGT.getInstance().findBookByCodeForModify(modify);//找到该书，并返回该对象
					
					double price2 =dis.readDouble();//读取修改后单价
					book2.setPrice(price2);//设置价格
					
					BookMGT.getInstance().doSave();//保存
					
				}if(inInfo.equals("findBook")){//读取查找命令
					String find = dis.readUTF();//读取查找书籍的编号
					Book book = null;
					if((book=BookMGT.getInstance().findBookByCodeForModify(find))!=null){
						dos.writeInt((int)1);//找到，返回指令一；
						
						//并将书籍信息写入流中
						
						
						dos.writeUTF(book.getCode());
						dos.writeUTF(book.getName());
						dos.writeUTF(book.getAuthor());
						dos.writeDouble(book.getPrice());
					}else{
						dos.writeInt((int)2);//找不到，返回指令2
					}
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
		}
	}
	
}




class BookMGT{
	private static BookMGT bookmgt=null;
	private List<Book> Booklist=null;
	private static final String FILE_NAME="book.dat";//最终存储book的文件
	
	
	@SuppressWarnings("unchecked")
	private BookMGT(){
		Object obj=loadObject(FILE_NAME);//以对象形式加载这个动态数组，下有方法实现
		if(obj==null){
			Booklist=new ArrayList<Book>();
		}else{
			Booklist=(List<Book>)obj;
		}
	}
	
	//单例模式,确保生成一个活着的对象即可
	public static BookMGT getInstance(){
		if(bookmgt==null){
			bookmgt=new BookMGT();
		}
		return bookmgt;
	}
	/**
	 * 根据编号查看图书
	 * @param code
	 * @return
	 */
	public Book findBookByCode(String code){
		Book book=new Book();
		for(Book b:Booklist){
			if(b.getCode().equals(code)){
				book=b;
			}
		}
		return book;
	}
	public Book findBookByCodeForModify(String code){//返回该编号的Book类对象，找不到返回null便于接下来的判断
		Book book = null;
		for(Book b:Booklist){
			if(b.getCode().equals(code)){
				book=b;
				return book;
			}
		}
		return null;

	}
	/**
	 * 添加图书
	 * @param book
	 * @return
	 */
	public boolean addBook(Book book){
		
		for(Book b:Booklist){
			if(b.getCode().equals(book.getCode())){
				return false;//包含相同编号不予添加，返回false
			}
		}//没有此编号的书籍时允许添加
		Booklist.add(book);
		return true;
	}
	/**
	 * 删除指定编号的图书
	 * @param code
	 * @return
	 */
	public boolean deleteBookByCode(String code){
		for(Book b:Booklist){
			if(b.getCode().equals(code)){
				if(Booklist.remove(b)){//删除成功就返回true
					return true;
				}
			}
		}//不包含就返回false
		return false;
	}
	//保存
	public void doSave(){
		saveObjectToFile(Booklist,FILE_NAME);
	}
	/**
	 * 将动态数组作为对象整个加载进文件保存。
	 * @param obj
	 * @param filename
	 */
	
	public void saveObjectToFile(Object obj, String filename) {
		try {
			File f = new File(filename);
			if (!f.exists()) {// 如果文件不存在，则创建该文件
				f.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);//写对象
			oos.flush();
			fos.close();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 从文件读取对象，此对象经过类型转换后为一个动态数组
	 */
	@SuppressWarnings("resource")
	public Object loadObject(String filename) {
		try {
			File f = new File(filename);
			if (!f.exists()) {// 如果文件不存在，则创建该文件
				f.createNewFile();
				return null;
			}
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			if (f.length() > 0) {// 判断文件是否为空
				Object obj = ois.readObject();//读取对象
				fis.close();
				ois.close();
				return obj;
			} else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

