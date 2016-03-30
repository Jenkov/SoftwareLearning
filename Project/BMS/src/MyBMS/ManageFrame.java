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

/*��ɾ�Ĳ� ����*/
public class ManageFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton add_btn =null;		//��Ӱ�ť
	JButton delete_btn = null;		//ɾ����ť
	JButton find_btn =null ;//���Ұ�ť
	JButton modify_btn = null;//�޸İ�ť
	JTextField add_jtf1 = null;//���  ������ı���
	JTextField add_jtf2 = null;//���  �������ı���
	JTextField add_jtf3 = null;//���  �������ı���
	JTextField add_jtf4 = null;//���  �ĵ����ı���
	JTextField delete_jtf = null;//ɾ�� ����� �ı���
	JTextField find_jtf = null;//���ҵ� ��� �ı���
	JTextField modify_jtf = null;//�޸� ������ı���
	JTextField price_jtf = null;//Ҫ�޸ĳɵļ۸���ı���
	JLabel feedback  =null;//���з�����Ϣ��ʾ�ڸñ�ǩ��
	
	private JPanel buttonPanel = null;
	
	private Socket s= null;
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	int port  = 4321;//�˿ں�
	String host = "localhost";//������
	public ManageFrame(){
		
		try {
			s = new Socket(host,port);
			dis = new DataInputStream(s.getInputStream());            //��ȡ��������������Ϣ
			dos = new DataOutputStream(s.getOutputStream());		  //��ͻ��˷�����Ϣ
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		init();
		//this.setLayout(new FlowLayout());
		this.setTitle("�����߲�������");
		this.setSize(1200,1000);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();//ʹ���������Ч
		this.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/3,Toolkit.getDefaultToolkit().getScreenSize().height/6);
		this.setVisible(true);
		
		
		
	}
	
	
	public void init(){//���ϸ�����ĳ�ʼ������
		add_btn = new JButton("add");
		delete_btn = new JButton("delete");
		find_btn = new JButton("find");
		modify_btn = new JButton("modify");
		
		add_jtf1 = new JTextField("���",4);
		add_jtf2 = new JTextField("����",4);
		add_jtf3 = new JTextField("����",4);
		add_jtf4 = new JTextField("0.0",4);
		delete_jtf = new JTextField("ɾ�����",5);
		find_jtf = new JTextField("�������",5);
		modify_jtf = new JTextField("�޸����",5);
		price_jtf = new JTextField("�ĺ�۸�",5);
		
		
		
		buttonPanel =new JPanel(new FlowLayout());
		feedback = new JLabel("feedback info");
	//	feedback.setPreferredSize(new Dimension(10,5));
		//�����������ӵ������ȥ
		buttonPanel.add(add_btn);buttonPanel.add(add_jtf1);buttonPanel.add(add_jtf2);buttonPanel.add(add_jtf3);buttonPanel.add(add_jtf4);
		buttonPanel.add(delete_btn);buttonPanel.add(delete_jtf);
		buttonPanel.add(find_btn);buttonPanel.add(find_jtf);
		
		buttonPanel.add(modify_btn);buttonPanel.add(modify_jtf);buttonPanel.add(price_jtf);
		
		
		
		buttonPanel.add(feedback);
		
		add(buttonPanel);
		//ע����������˼���������
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
			label1 = new JLabel("�鼮��ţ�");
			try {
				label11 = new JLabel(dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
			label2 = new JLabel("�鼮���ƣ�");
			try {
				label22 = new JLabel(dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
			label3 = new JLabel("���ߣ�");
			try {
				label33 = new JLabel(dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
			label4 = new JLabel("�۸�Ԫ)��");
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
			this.setTitle("�鼮��Ϣ");
			this.setSize(456,330);
			this.setResizable(false);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		}
	}

*/

	public void actionPerformed(ActionEvent ace){
		String add1  = add_jtf1.getText();//��ȡ����鼮 �ı��
		String add2 = add_jtf2.getText();//��ȡ����鼮������
		String add3  = add_jtf3.getText();//��ȡ����鼮������
		double add4  =Double.parseDouble(add_jtf4.getText()) ;//��ȡ��ӵ��鼮����
		
		
		String delete = delete_jtf.getText();//��ȡɾ���鼮�ı��
		
		String find = find_jtf.getText();//��ȡ�����鼮�ı��
		
		String modify = modify_jtf.getText();//��ȡ�޸��鼮�ı��
		//��
		if(ace.getSource()==add_btn){
			try {
				dos.writeUTF("addBook");//д���������
				
				dos.writeUTF(add1);//д����ӵ��鼮���
				dos.writeUTF(add2);//д������鼮����
				dos.writeUTF(add3);//д������鼮������
				dos.writeDouble(add4);//д������鼮�ĵ���
				
				//������Ϣ��ȡ
				Boolean s1 = dis.readBoolean();
				if(s1){
					feedback.setText("���Ϊ"+add1+"�ɹ���ӵ���⣡");
				}else{
					feedback.setText("���Ϊ"+add1+"�Ѵ��ڣ��ٴ����ʧ�ܣ������±�š�");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}if(ace.getSource()==delete_btn){//ɾ
			try {
				dos.writeUTF("deleteBook");//д��ɾ������
				dos.writeUTF(delete);//д��ɾ���鼮�ı��
				//��ȡ������Ϣ
				String s2 = dis.readUTF();
				feedback.setText(s2);
				
			} catch (IOException e) {
				e.printStackTrace();
			}//����Ϊ�޸��鼮��Ϣ������ֻ�����ṩ���޸�ͼ�鵥�۵Ĺ���
		}if(ace.getSource()==modify_btn){
			try {
				dos.writeUTF("modifyPrice");//д���޸ĵ��۵�����
				dos.writeUTF(modify);//�����޸ĵ��鼮 ���
				double price = Double.parseDouble(price_jtf.getText());//��ȡ�ĺ�۸񣬲�ת������
				dos.writeDouble(price);//д��ĺ�۸�
			} catch (IOException e) {
				e.printStackTrace();
			}
			//���Ҳ���
		}if(ace.getSource()==find_btn){
			try {
				dos.writeUTF("findBook");//����������
				dos.writeUTF(find);//�������� �鼮�ı��
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			try{
				int s3 = dis.readInt();//��ȡ������Ϣ�����������ۣ����������Ϣ����ǩ��
				switch(s3){
				case 1:
					
					feedback.setText("��ţ�"+dis.readUTF()+"������"+dis.readUTF()+"���ߣ�"+dis.readUTF()+"�۸񣨵�λ $):"+dis.readDouble()+"");
					
					break;
				case 2:feedback.setText("û�б��Ϊ"+find+"���鼮");break;
				default: break;
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
			
		}
	

	
}
