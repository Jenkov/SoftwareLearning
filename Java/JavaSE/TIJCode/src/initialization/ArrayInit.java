package initialization;

import java.util.Arrays;

public class ArrayInit {

	public static void main(String[] args) {
		Integer[] a = {
				new Integer(1),
				new Integer(2),
				3//Auto-boxing
		};
		Integer[] b = new Integer[]{
				new Integer(1),
				new Integer(2),
				3//Auto-boxing
		};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
