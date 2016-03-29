package initialization;
class Parent{
	//��̬����
	public static String p_StaticField = "����--��̬����";
	//����
	public static String p_Field = "����--����";
	
	//��̬��ʼ����
	static{
		System.out.println(p_StaticField);
		System.out.println("����--��̬��ʼ����");
	}
	
	//��ʼ����
	{
		System.out.println(p_Field);
		System.out.println("����--��ʼ����");
	}
	
	//������
	public Parent(){
		System.out.println("����--������");
	}
}
public class SubClass extends Parent{

	//��̬����
	public static String s_StaticField = "����--��̬����";
	//����
	public static String s_Field = "����--����";
	
	//��̬�����
	static{
		System.out.println(s_StaticField);
		System.out.println("����--��̬��ʼ����");
	}
	
	//��ʼ����
	{
		System.out.println(s_Field);
		System.out.println("����--��ʼ����");
	}
	//������
	public SubClass(){
		System.out.println("����--������");
	}
	
	public static void main(String[] args) {
		new SubClass();

	}

}
