package MyBMS;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel labelImage = new JLabel();
	
	private JLabel labelTitle = new JLabel("��ӭ��½SSDUTͼ�����ϵͳ");
	private JLabel labelName = new JLabel("�û���:");
	private JLabel labelPassword = new JLabel("��    ��:");
	
	private JTextField  txtName = new JTextField(10);
	private JTextField txtPassword = new JTextField(10);
	
	private JButton btnLogin = new JButton("����Ա��¼");
	private Container con = this.getContentPane();
	//���캯��
	public LoginFrame(){
		init();
		this.setTitle("SSDUTͼ�����");
		this.setSize(500,400);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/3,Toolkit.getDefaultToolkit().getScreenSize().height/6);
		this.setVisible(true);
	}
	//�������������Ҫ�����ڲ���loginFrame
	public void init(){
		labelTitle.setForeground(Color.black);
		labelTitle.setFont(new Font("SansSerif",Font.PLAIN,20));
		//Ϊ��ť����¼�
		btnLogin.addActionListener(this);
		
		txtName.grabFocus();
		JPanel panel =new JPanel(new BorderLayout());     
		panel.add(labelTitle,BorderLayout.NORTH);         
		//����Ϊ��BoxLayout���в���
		Box box1 = Box.createHorizontalBox();
		box1.add(Box.createHorizontalStrut(10));
		box1.add(labelName);
		box1.add(Box.createHorizontalStrut(5));
		box1.add(txtName);
		
		Box box2 = Box.createHorizontalBox();
		box2.add(Box.createHorizontalStrut(10));
		box2.add(labelPassword);
		box2.add(Box.createHorizontalStrut(5));
		box2.add(txtPassword);
		
		Box box3 = Box.createHorizontalBox();
		box3.add(Box.createHorizontalStrut(60));
		box3.add(Box.createHorizontalStrut(10));
		
		Box box4 = Box.createHorizontalBox();
		box4.add(Box.createHorizontalStrut(90));
		box4.add(btnLogin);
		
		JPanel panelCen = new JPanel( new GridLayout(8,1,0,0));
		panelCen.add(Box.createHorizontalStrut(35));
		panelCen.add(box1);
		panelCen.add(Box.createHorizontalStrut(20));
		panelCen.add(box2);
		panelCen.add(Box.createHorizontalStrut(30));
		panelCen.add(box3);
		panelCen.add(Box.createHorizontalStrut(10));
		panelCen.add(box4);
		
		panel.add(panelCen,BorderLayout.CENTER);
		
		JPanel p =new JPanel();
		p.add(labelImage);
		p.add(panel);
		con.add(p);	
	}
	public static void main(String [] args){
		new LoginFrame();
	}
	
	public void actionPerformed(ActionEvent ae) {//����ķ���ʵ��
		if(ae.getSource() ==btnLogin){
			if(txtName.getText().equals("")){
				JOptionPane.showMessageDialog(null,"�û������ܲ�Ϊ��");
			}
			if(txtPassword.getText().equals("")){
				JOptionPane.showMessageDialog(null, "���벻��Ϊ��,��������д");
			}
			if(!(txtName.getText().equals(""))&(!(txtPassword.getText().equals("")))){
				String name = txtName.getText().trim();  //����û���
				String password = txtPassword.getText().trim();  //�������
				if(("wuhengyu".equals(name)&&"666666".equals(password))||("why".equals(name)&&"666".equals(password)))
					new ManageFrame();
					this.setVisible(false);
				}
			}
			
		}
}