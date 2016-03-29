package c11;

import java.util.ArrayList;
import java.util.List;

//Simple container example
//ThrowsException
public class CatsAndDogs {

	public static void main(String[] args) {
		List cats = new ArrayList();
		for(int i=0;i<7;i++)
			cats.add(new Cat(i));
		//Not a problem to add a dog to cats
		cats.add(new Dog(7));
		for(int i=0;i<cats.size();i++){
			((Cat)cats.get(i)).id();
			//Dog is detected only at run time
		}
	}

}
