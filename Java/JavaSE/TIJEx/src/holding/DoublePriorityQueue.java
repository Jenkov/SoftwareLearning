/*
 * P238
 * Á·Ï°28
 */
package holding;

import java.util.PriorityQueue;
import java.util.Random;

public class DoublePriorityQueue {

	public static void main(String[] args) {
		Random rand = new Random();
		PriorityQueue<Double> doublePQ = 
				new PriorityQueue<Double>();
		
		for(int i=0;i<10;i++)
			doublePQ.offer(new Double(rand.nextDouble()));
		
		while(doublePQ.peek()!=null)
			System.out.print(doublePQ.remove()+"  ");

	}

}
