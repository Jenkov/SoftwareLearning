/*
 * P85
 * ��ϰ8
 */
package initialization;

public class ThisKeyTest {

	public void A(){
		System.out.println("�����ұ�������!");
	}
	public void B(){
		this.A();//����������A()��
		A();//��Ҳ��
	}
	public static void main(String[] args) {
		new ThisKeyTest().B();

	}

}
