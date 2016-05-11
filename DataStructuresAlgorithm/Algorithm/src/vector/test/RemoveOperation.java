package vector.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveOperation {

	public static void removeEvensVer1(List<Integer> lst){
		int i=0;
		while(i<lst.size())
			if(lst.get(i)%2==0)
				lst.remove(i);
			else
				i++;
	}
	public static void removeEvensVer2(List<Integer> lst){
		for(Integer x:lst)
			if(x%2==0)
				lst.remove(x);
	}
	public static void removeEvensVer3(List<Integer> lst){
		Iterator<Integer> itr = lst.iterator();
		
		while(itr.hasNext())
			if(itr.next()%2==0)
				itr.remove();
	}
	public static void main(String[] args) {
		List<Integer> lst = new LinkedList<Integer>();
		lst.add(1);
		lst.add(4);
		lst.add(8);
		lst.add(3);
		lst.add(10);
		lst.add(10);
		//removeEvensVer1(lst);
		//removeEvensVer2(lst);//RuntimeException
		/*Exception in thread "main" java.util.ConcurrentModificationException
		at java.util.LinkedList$ListItr.checkForComodification(LinkedList.java:966)
		at java.util.LinkedList$ListItr.next(LinkedList.java:888)
		at vector.test.RemoveOperation.removeEvensVer2(RemoveOperation.java:18)
		at vector.test.RemoveOperation.main(RemoveOperation.java:38)
		 */
		removeEvensVer3(lst);
		
		for(Integer x:lst)
			System.out.print(x+" ");
	}

}
