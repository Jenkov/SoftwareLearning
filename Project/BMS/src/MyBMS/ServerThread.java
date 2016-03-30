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
	// ��ָ���Ķ˿ڼ����ͻ��˵���������
	
	public ServerThread(Socket s){
			
		this.s = s;
		try {
			
			dis = new DataInputStream(s.getInputStream());            //��ȡ�ͻ��˷�������Ϣ
			dos = new DataOutputStream(s.getOutputStream());		  //�������������Ϣ
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public synchronized  void run() {
		while(true){
			try {
			
				String inInfo = dis.readUTF();    //��ȡҪ����ʲô���Ĳ���								
				
				//�����Թ���Ա����ɾ�Ĳ����
				if(inInfo.equals("addBook")){
					
					Boolean s2=BookMGT.getInstance().addBook(new Book(dis.readUTF(),dis.readUTF(),dis.readUTF(),dis.readDouble()));
					//���϶�ȡ�� ���յ�һ���飬����ӵ���̬������
					BookMGT.getInstance().doSave();//����
					dos.writeBoolean(s2);//д�뷴����Ϣ������ӳɹ����
				}if(inInfo.equals("deleteBook")){  //ɾ���鼮����
					String delete = dis.readUTF();//��ȡɾ������
					Boolean b1 =BookMGT.getInstance().deleteBookByCode(delete);
					//����ִ��ɾ������
					BookMGT.getInstance().doSave();//����
					//����ɾ���ķ���ֵ��ȷ�Ϸ�����Ϣ����д��������
					if(b1){
						dos.writeUTF("���Ϊ"+delete+"���鼮ɾ���ɹ���");
					}else{
						dos.writeUTF("���Ϊ"+delete+"���鼮ɾ��ʧ�ܣ��������ڣ�");
					}
					
				}if(inInfo.equals("modifyPrice")){//��ȡ�޸�����
					String modify = dis.readUTF();//��ȡ�޸��鼮�ı��
					
					Book book2 = BookMGT.getInstance().findBookByCodeForModify(modify);//�ҵ����飬�����ظö���
					
					double price2 =dis.readDouble();//��ȡ�޸ĺ󵥼�
					book2.setPrice(price2);//���ü۸�
					
					BookMGT.getInstance().doSave();//����
					
				}if(inInfo.equals("findBook")){//��ȡ��������
					String find = dis.readUTF();//��ȡ�����鼮�ı��
					Book book = null;
					if((book=BookMGT.getInstance().findBookByCodeForModify(find))!=null){
						dos.writeInt((int)1);//�ҵ�������ָ��һ��
						
						//�����鼮��Ϣд������
						
						
						dos.writeUTF(book.getCode());
						dos.writeUTF(book.getName());
						dos.writeUTF(book.getAuthor());
						dos.writeDouble(book.getPrice());
					}else{
						dos.writeInt((int)2);//�Ҳ���������ָ��2
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
	private static final String FILE_NAME="book.dat";//���մ洢book���ļ�
	
	
	@SuppressWarnings("unchecked")
	private BookMGT(){
		Object obj=loadObject(FILE_NAME);//�Զ�����ʽ���������̬���飬���з���ʵ��
		if(obj==null){
			Booklist=new ArrayList<Book>();
		}else{
			Booklist=(List<Book>)obj;
		}
	}
	
	//����ģʽ,ȷ������һ�����ŵĶ��󼴿�
	public static BookMGT getInstance(){
		if(bookmgt==null){
			bookmgt=new BookMGT();
		}
		return bookmgt;
	}
	/**
	 * ���ݱ�Ų鿴ͼ��
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
	public Book findBookByCodeForModify(String code){//���ظñ�ŵ�Book������Ҳ�������null���ڽ��������ж�
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
	 * ���ͼ��
	 * @param book
	 * @return
	 */
	public boolean addBook(Book book){
		
		for(Book b:Booklist){
			if(b.getCode().equals(book.getCode())){
				return false;//������ͬ��Ų�����ӣ�����false
			}
		}//û�д˱�ŵ��鼮ʱ�������
		Booklist.add(book);
		return true;
	}
	/**
	 * ɾ��ָ����ŵ�ͼ��
	 * @param code
	 * @return
	 */
	public boolean deleteBookByCode(String code){
		for(Book b:Booklist){
			if(b.getCode().equals(code)){
				if(Booklist.remove(b)){//ɾ���ɹ��ͷ���true
					return true;
				}
			}
		}//�������ͷ���false
		return false;
	}
	//����
	public void doSave(){
		saveObjectToFile(Booklist,FILE_NAME);
	}
	/**
	 * ����̬������Ϊ�����������ؽ��ļ����档
	 * @param obj
	 * @param filename
	 */
	
	public void saveObjectToFile(Object obj, String filename) {
		try {
			File f = new File(filename);
			if (!f.exists()) {// ����ļ������ڣ��򴴽����ļ�
				f.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);//д����
			oos.flush();
			fos.close();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���ļ���ȡ���󣬴˶��󾭹�����ת����Ϊһ����̬����
	 */
	@SuppressWarnings("resource")
	public Object loadObject(String filename) {
		try {
			File f = new File(filename);
			if (!f.exists()) {// ����ļ������ڣ��򴴽����ļ�
				f.createNewFile();
				return null;
			}
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			if (f.length() > 0) {// �ж��ļ��Ƿ�Ϊ��
				Object obj = ois.readObject();//��ȡ����
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

