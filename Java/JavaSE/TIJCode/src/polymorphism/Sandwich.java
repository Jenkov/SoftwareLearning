package polymorphism;
//Order of constructor calls.

class Meal{
	//private Bread bb = new Bread();
	Meal(){
		System.out.println("Meal()");
	}
}

class Bread{
	Bread(){
		System.out.println("Bread()");
	}
}
class Cheese{
	Cheese(){
		System.out.println("Cheese()");
	}
}
class Lettuce{
	Lettuce(){
		System.out.println("Lettuce()");
	}
}
class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch()");
	}
}
class ProtableLunch extends Lunch{
	ProtableLunch(){
		System.out.println("ProtableLunch()");
	}
}
public class Sandwich extends ProtableLunch{
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	public Sandwich(){
		System.out.println("Sandwich()");
	}
	public static void main(String[] args) {
		System.out.println("begin");
		new Sandwich();
		System.out.println("end");
	}

}
