/*
 * ��ô���ھ�̬�����;�̬��ʼ����֮�䡢�����ͳ�ʼ����֮����Ⱥ�˳�����������أ�
 * �Ƿ�̬�����������ھ�̬��ʼ���飬�����������ڳ�ʼ����ͱ���ʼ�����أ�
 * ʵ������ȡ�������������г��ֵ��Ⱥ�˳�������Ծ�̬�����;�̬��ʼ����Ϊ��������˵����
 */
package initialization;

class TestA{
	public TestA(){
		System.out.println("Test--A");
	}
}
class TestB{
	public TestB(){
		System.out.println("Test--B");
	}
}
public class TestOrder {
	//��̬����
	public static TestA a = new TestA();

	//��̬��ʼ����
	static{
		System.out.println("��̬��ʼ����");
	}

	//��̬����
	public static TestB b = new TestB();
	
	public static void main(String[] args){
		new TestOrder();
	}

}
/*
 * ��������Ĵ��룬��õ����µĽ����
 *
 *	Test--A
 *	��̬��ʼ����
 *	Test--B
 *
 * ��ҿ�������ı����a������b�Լ���̬��ʼ�����ǰ��λ�ã��ͻᷢ������������
 *���������г��ֵ�ǰ��˳����ı䣬���˵����̬�����;�̬��ʼ�������������������е�
 *����˳����г�ʼ���ġ�ͬ���������ͳ�ʼ����Ҳ��ѭ������ɡ� 
 */
