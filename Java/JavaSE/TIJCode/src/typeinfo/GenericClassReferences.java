package typeinfo;

public class GenericClassReferences {

	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;//Same thing
		intClass = double.class;
		//! genericIntClass = double.class;
		//Type mismatch: cannot convert from Class<Double> to Class<Integer>

	}

}
