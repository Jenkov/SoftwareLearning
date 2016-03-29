package eight;

public class ObjectEquals {

	
	public static void main(String[] args) {
		Object obj1 =  new Object();
		Object obj2 = obj1;
		Object obj3 = new Object();
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj3));
		System.out.println(obj1==obj3);
		

	}

}
