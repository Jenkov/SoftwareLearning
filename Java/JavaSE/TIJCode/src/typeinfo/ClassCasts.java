package typeinfo;
class Building{}
class House extends Building{}

public class ClassCasts {

	public static void main(String[] args) {
		Building  b = new House();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House)b;//...or just do this.
		/*long l=Long.MAX_VALUE;
		int i = (int) l;
		System.out.println(i);*/
		/*int i = Integer.MAX_VALUE;
		long l = (long)i;
		System.out.println(l);*/
		
	}

}
