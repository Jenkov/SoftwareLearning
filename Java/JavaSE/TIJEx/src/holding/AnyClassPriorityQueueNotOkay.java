/*
 * P238
 * ��ϰ29
 * ��ʾЧ��������ʱ�쳣������ת�ͳ���
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
