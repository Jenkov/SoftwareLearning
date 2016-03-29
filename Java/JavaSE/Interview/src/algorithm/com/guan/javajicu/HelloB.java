package algorithm.com.guan.javajicu;
class HelloA{
	public HelloA(){
		System.out.println("HelloA");
	}
	{
		System.out.println("I'm A class");
	}
	static{
		System.out.println("static A");
	}
}
public class HelloB extends HelloA{
	public HelloB(){
		System.out.println("HelloB");
	}
	{
		System.out.println("I'm B class");
	}
	static{
		System.out.println("static B");
	}
	public static void main(String[] args){
		System.out.println("main begins");
		new HelloB();
		System.out.println("main ends");
	}
}
/*
 * static A
 *static B
 *main begins
 *I'm A class
 *HelloA
 *I'm B class
 *HelloB
 *main ends
 */
