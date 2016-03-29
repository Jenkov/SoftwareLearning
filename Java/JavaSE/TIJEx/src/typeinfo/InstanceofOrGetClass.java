package typeinfo;

class A{}
class B extends A{}
public class InstanceofOrGetClass {

	public static void main(String[] args) {
		A a = new A();
		A aa = new A();
		B bb = new B();		
		A ab = new B();
		
		System.out.println(a.getClass()==aa.getClass());
		System.out.println(a.getClass()==bb.getClass());
		System.out.println(ab.getClass()==aa.getClass());
		System.out.println(ab.getClass()==bb.getClass());
		System.out.println("-------------------------------");
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(bb instanceof A);
		System.out.println(bb instanceof B);
		System.out.println(ab instanceof A);
		System.out.println(ab instanceof B);

	}

}
