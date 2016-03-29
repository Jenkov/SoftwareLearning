package vector;
import java.util.*;
public class TestCollectionAnyType {

	public static <AnyType> void print(Collection<? extends AnyType> coll){
		for(AnyType item: coll)
			System.out.println(item);
	}
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>(Arrays.asList("Bob","Sam","Tom","John","Hehe"));
		
		print(c);

	}

}
