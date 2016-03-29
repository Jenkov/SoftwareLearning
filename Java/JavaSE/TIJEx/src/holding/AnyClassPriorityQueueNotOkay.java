/*
 * P238
 * 练习29
 * 演示效果，运行时异常，向上转型出错。
 */
package holding;

import java.util.PriorityQueue;

class A{}

public class AnyClassPriorityQueueNotOkay {

	public static void main(String[] args) {
		PriorityQueue<A> aPQ = 
				new PriorityQueue<A>();
		for(int i=0;i<6;i++)
			aPQ.offer(new A());
		
		while(aPQ.peek()!=null)
			System.out.print(aPQ.remove());

	}

}
