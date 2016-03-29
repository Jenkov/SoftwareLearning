package vector;
import java.util.*;

public class RemoveEven {
	
	public static void removeEvenVer1(List<Integer> lst){
		int i = 0;
		while(i<lst.size())
			if(lst.get(i)%2==0)
				lst.remove(i);
			else
				i++;
	}
	
	public static void removeEvenVer2(List<Integer> lst){
		for(Integer x:lst)
			if(x%2==0)
				lst.remove(x);
	}
	
	public static void removeEvenVer3(List<Integer> lst){
		Iterator<Integer> itr = lst.iterator();
		
		while(itr.hasNext())
			if(itr.next()%2==0)
				itr.remove();
	}
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		Collections.addAll(l, 1,2,3,4,5);
		List<Integer> l2 =  new LinkedList<Integer>();
		Collections.addAll(l2, 6,7,8,9,10);
		
		/*removeEvenVer1(l);
		removeEvenVer1(l2);*/
		/*wrong!!!!
		 * since:
		 * Exception in thread "main" java.util.ConcurrentModificationException
			at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
			at java.util.ArrayList$Itr.next(ArrayList.java:851)
			at vector.RemoveEven.removeEvenVer2(RemoveEven.java:16)
			at vector.RemoveEven.main(RemoveEven.java:28)

		 * removeEvenVer2(l);
		removeEvenVer2(l2);*/
		
		removeEvenVer3(l);
		removeEvenVer3(l2);
		System.out.println(l);
		System.out.println(l2);

	}

}
