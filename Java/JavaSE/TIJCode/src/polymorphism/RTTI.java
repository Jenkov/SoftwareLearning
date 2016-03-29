package polymorphism;
//Downcasting & Runtime type information (RTTI).
//{ThrowsException}
class Useful{
	public void f(){
		System.out.println("base-f()");
	}
	public void g(){
		System.out.println("base-g()");
	}
}
class MoreUseful extends Useful{
	public void f(){
		System.out.println("derived-f()");
	}
	public void g(){
		System.out.println("derived-g()");
	}
	public void u(){
		System.out.println("u()");
	}
	public void v(){
		System.out.println("v()");
	}
	public void w(){
		System.out.println("w()");
	}
}
public class RTTI {

	public static void main(String[] args) {
		Useful[] x = {
				new Useful(),
				new MoreUseful()
		};
		x[0].f();
		x[1].g();
		//Compile time:method not found in Useful:
		//! x[1].u();
		((MoreUseful)x[1]).u();//Downcasting/RTTI
		//! ((MoreUseful)x[0]).u();//Exception thrown
	}

}
