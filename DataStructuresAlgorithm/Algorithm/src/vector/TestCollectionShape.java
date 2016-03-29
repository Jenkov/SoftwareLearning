package vector;
import introduction.*;
import java.util.*;

public class TestCollectionShape {

	public static void printShape(Collection<? extends Shape> arr){
		double sum = 0;
		for(Shape s: arr){
			if(s!=null)
				sum+=s.S();
		}
		
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Collection<Shape> arr = new ArrayList<Shape>(
				Arrays.asList(new Square(1),new Square(2),new Square(3)));
		printShape(arr);
		
		/*error 1
		 * 
		 * Collection<Shape> arr2 = new Collection<Square>(
			Arrays.asList(new Square(1),new Square(2),new Square(3)));*/
		/*Cannot instantiate the type Collection<Square>
		 * Type mismatch: cannot convert from Collection<Square> to Collection<Shape>*/
		/*error 2
		 * Type mismatch: cannot convert from ArrayList<Square> to Collection<Shape>
		 */
		/*Collection<Shape> arr2 = new ArrayList<Square>(
				Arrays.asList(new Square(1),new Square(2),new Square(3)));*/
		Collection<Square> arr3 = new ArrayList<Square>(
				Arrays.asList(new Square(3),new Square(4),new Square(5)));
		/*printShape(arr3);
		 * The method printShape(Collection<Shape>) in the 
		 * type TestCollectionShape is not applicable 
		 * for the arguments (Collection<Square>)
		 * 
		 * */
		//只要添加? extends即可使用上面的函数，如下:
		printShape(arr3);
	}

}
