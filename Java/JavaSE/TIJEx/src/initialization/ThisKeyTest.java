/*
 * P85
 * 练习8
 */
package initialization;

public class ThisKeyTest {

	public void A(){
		System.out.println("啊，我被调用了!");
	}
	public void B(){
		this.A();//俺是来调用A()的
		A();//俺也是
	}
	public static void main(String[] args) {
		new ThisKeyTest().B();

	}

}
