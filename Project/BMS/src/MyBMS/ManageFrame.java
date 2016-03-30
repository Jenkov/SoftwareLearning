package MyBMS;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*增删改查 操作*/
public class ManageFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton add_btn =null;		//添加按钮
	JButton delete_btn = null;		//删除按钮
	JButton find_btn =null ;//查找按钮
	JButton modify_btn = null;//修改按钮
	JTextField add_jtf1 = null;//添加  的书号文本框
	JTextField add_jtf2 = null;//添加  的书名文本框
	JTextField add_jtf3 = null;//添加  的作者文本框
	JTextField add_jtf4 = null;//添加  的单价文本框
	JTextField delete_jtf = null;//删除 的书号 文本框
	JTextField find_jtf = null;//查找的 书号 文本框
	JTextField modify_jtf = null;//修改 的书号文本框
	JTextField price_jtf = null;//要修改成的价格的文本框
	JLabel feedback  =null;//所有反馈信息显示在该标签上
	
	private JPanel buttonPanel = null;
	
	private Socket s= null;
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	int port  = 4321;//端口号
	String host = "localhost";//主机名
	public ManageFrame(){
		
		try {
			s = new Socket(host,port);
			dis = new DataInputStream(s.getInputStream());            //读取服务器发来的消息
			dos = new DataOutputStream(s.getOutputStream());		  //向客户端发送消息
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		init();
		//this.setLayout(new FlowLayout());
		this.setTitle("管理者操作界面");
		this.setSize(1200,1000);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();//使窗体紧凑有效
		this.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/3,Toolkit.getDefaultToolkit().getScreenSize().height/6);
		this.setVisible(true);
		
		
		
	}
	
	
	public void init(){//以上各组件的初始化动作
		add_btn = new JButton("add");
		delete_btn = new JButton("delete");
		find_btn = new JButton("find");
		modify_btn = new JButton("modify");
		
		add_jtf1 = new JTextField("书号",4);
		add_jtf2 = new JTextField("书名",4);
		add_jtf3 = new JTextField("作者",4);
		add_jtf4 = new JTextField("0.0",4);
		delete_jtf = new JTextField("删除书号",5);
		find_jtf = new JTextField("查找书号",5);
		modify_jtf = new JTextField("修改书号",5);
		price_jtf = new JTextField("改后价格",5);
		
		
		
		buttonPanel =new JPanel(new FlowLayout());
		feedback = new JLabel("feedback info");
	//	feedback.setPreferredSize(new Dimension(10,5));
		//将各个组件添加到面板上去
		buttonPanel.add(add_btn);buttonPanel.add(add_jtf1);buttonPanel.add(add_jtf2);buttonPanel.add(add_jtf3);buttonPanel.add(add_jtf4);
		buttonPanel.add(delete_btn);buttonPanel.add(delete_jtf);
		buttonPanel.add(find_btn);buttonPanel.add(find_jtf);
		
		buttonPanel.add(modify_btn);buttonPanel.add(modify_jtf);buttonPanel.add(price_jtf);
		
		
		
		buttonPanel.add(feedback);
		
		add(buttonPanel);
		//注册监听器，此即本对象本身
		add_btn.addActionListener(this);
		delete_btn.addActionListener(this);
		find_btn.addActionListener(this);
		modify_btn.addActionListener(this);
	
	}

	/*
	public class BookFrame extends JFrame {
		JLabel label1 =null;
		JLabel label11=null;
		JLabel label2=null;
		JLabel label22=null;
		JLabel label3=null;
		JLabel label33=null;
		JLabel label4 =null;
		JLabel label44=null;
		JPanel labelPanel = null;
		public BookFrame(){
			label1 = new JLabel("书籍编号：");
			try {
				label11 = new JLabel(dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
			label2 = new JLabel("书籍名称：");
			try {
				label22 = new JLabel(dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
			label3 = new JLabel("作者：");
			try {
				label33 = new JLabel(dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
			label4 = new JLabel("价格（元)：");
			try {
				label44 = new JLabel(dis.readDouble()+"");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			labelPanel.add(label1);
			labelPanel.add(label11);
			labelPanel.add(label2);
			labelPanel.add(label22);
			labelPanel.add(label3);
			labelPanel.add(label33);
			labelPanel.add(label4);
			labelPanel.add(label44);
			this.add(labelPanel);
			this.setTitle("书籍信息");
			this.setSize(456,330);
			this.setResizable(false);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		}
	}

*/

	public void actionPerformed(ActionEvent ace){
		String add1  = add_jtf1.getText();//获取添加书籍 的编号
		String add2 = add_jtf2.getText();//获取添加书籍的书名
		String add3  = add_jtf3.getText();//获取添加书籍的作者
		double add4  =Double.parseDouble(add_jtf4.getText()) ;//获取添加的书籍单价
		
		
		String delete = delete_jtf.getText();//获取删除书籍的编号
		
		String find = find_jtf.getText();//获取查找书籍的编号
		
		String modify = modify_jtf.getText();//获取修改书籍的编号
		//增
		if(ace.getSource()==add_btn){
			try {
				dos.writeUTF("addBook");//写入添加命令
				
				dos.writeUTF(add1);//写入添加的书籍编号
				dos.writeUTF(add2);//写入添加书籍名称
				dos.writeUTF(add3);//写入添加书籍的作者
				dos.writeDouble(add4);//写入添加书籍的单价
				
				//反馈信息读取
				Boolean s1 = dis.readBoolean();
				if(s1){
					feedback.setText("编号为"+add1+"成功添加到书库！");
				}else{
					feedback.setText("编号为"+add1+"已存在，再次添加失败，请重新编号。");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}if(ace.getSource()==delete_btn){//删
			try {
				dos.writeUTF("deleteBook");//写入删除命令
				dos.writeUTF(delete);//写入删除书籍的编号
				//读取反馈信息
				String s2 = dis.readUTF();
				feedback.setText(s2);
				
			} catch (IOException e) {
				e.printStackTrace();
			}//以下为修改书籍信息，这里只向外提供了修改图书单价的功能
		}if(ace.getSource()==modify_btn){
			try {
				dos.writeUTF("modifyPrice");//写入修改单价的命令
				dos.writeUTF(modify);//发出修改的书籍 编号
				double price = Double.parseDouble(price_jtf.getText());//获取改后价格，并转化类型
				dos.writeDouble(price);//写入改后价格
			} catch (IOException e) {
				e.printStackTrace();
			}
			//查找操作
		}if(ace.getSource()==find_btn){
			try {
				dos.writeUTF("findBook");//发出找命令
				dos.writeUTF(find);//发出查找 书籍的编号
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			try{
				int s3 = dis.readInt();//读取返回信息，并分类讨论，输出反馈信息到标签上
				switch(s3){
				case 1:
					
					feedback.setText("编号："+dis.readUTF()+"书名："+dis.readUTF()+"作者："+dis.readUTF()+"价格（单位 $):"+dis.readDouble()+"");
					
					break;
				case 2:feedback.setText("没有编号为"+find+"的书籍");break;
				default: break;
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
			
		}
	

	
}
