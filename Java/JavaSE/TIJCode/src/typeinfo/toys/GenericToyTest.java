package typeinfo.toys;
//Testing class Class

public class GenericToyTest {

	public static void main(String[] args) throws Exception{
		Class<FancyToy> ftClass = FancyToy.class;
		//Produces exact type:
		FancyToy fancyToy = ftClass.newInstance();
		Class<? super FancyToy> up =ftClass.getSuperclass();
		//This won't compile:
		//! Class<Toy> up2 = ftClass.getSuperclass();
		//Type mismatch: cannot convert from Class<capture#2-of ? super FancyToy> to Class<Toy>
		//Only produces Object:
		Object obj = up.newInstance();
	}

}
