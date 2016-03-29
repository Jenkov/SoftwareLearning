package strings;
import java.util.regex.*;
import java.util.*;

public class SplitDemo {

	public static void main(String[] args) {
		String input = 
				"This!!unusual use!!of exclaimation!!points";
		System.out.println(Arrays.toString(
				Pattern.compile("!!").split(input)));
		//Only do the first three:
		System.out.println(Arrays.toString( 
				Pattern.compile("!!").split(input,2)));
	}

}
