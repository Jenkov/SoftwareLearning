package typeinfo;
class Father{
	Father(){
		System.out.println("I'm Father");
	}
}
class Pet{
	Pet(){
		System.out.println("Pet....");
	}
}
public class SuperclassOrStaticfield extends Father{
	SuperclassOrStaticfield(){
		System.out.println("Hello world!!Here I come!");
	}
	public static void main(String[] args) {
		System.out.println("main begins...");
		new SuperclassOrStaticfield();
		System.out.println("mains ends...");
	}
	static Pet pet = new Pet();
}
