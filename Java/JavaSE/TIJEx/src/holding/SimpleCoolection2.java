/*
 * P220Á·Ï°2
 */
package holding;

import java.util.Collection;
import java.util.TreeSet;

public class SimpleCoolection2 {

	public static void main(String[] args) {
		Collection<Integer> c = new TreeSet<Integer>();
		
		for(int i=0;i<20;i++)
			c.add(i);//autoboxing
		for(Integer i:c)
			System.out.print(i+", ");

	}

}
