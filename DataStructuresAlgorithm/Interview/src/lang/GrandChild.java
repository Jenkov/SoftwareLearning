package lang;
class Father{
	protected int x= 3;
	protected void promethod(){
		System.out.println("protected method from Father");
	}
	Father(){
		System.out.println("Father -- x: "+x );
		
	}
}
class Child extends Father{
	Child(){
		System.out.println("Child-- x: "+x);
	}
}
public class GrandChild extends Child{
	GrandChild(){
		System.out.println("GrandChild -- x: "+x);
	}
	
	public static void main(String[] args){
		new GrandChild().promethod();;
		
	}
}	


