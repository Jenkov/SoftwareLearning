package eight;

class Parent{
	
	public void play(){
		System.out.println("parent play");
	}
	public void drink(){
		System.out.println("parent drink");
	}
}
class Child extends Parent{
	public void play(){
		System.out.println("child play");
	}
}

class GrandChild extends Child{
	public void play(){
		System.out.println("grandchild play");
	}
}
public class InherentTest {
	public static void main(String[] args){
		Parent p = new Child();
		Parent p2 = new GrandChild();
	
		p.play();
		p2.play();

	}
}
