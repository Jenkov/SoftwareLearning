package containers;
//Things you can do with Maps.
import java.util.concurrent.*;
import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

public class Maps {
	public static void printKeys(Map<Integer,String> map){
		printnb("Size = "+map.size()+", ");
		printnb("Key: ");
		print(map.keySet());//Produce a Set of keys
	}
	public static void test(Map<Integer,String>map){
		print(map.getClass().getSimpleName());
		map.putAll(new CountingMapData(25));
		//Map has 'Set' behavior for keys:
		map.putAll(new CountingMapData(25));
		printKeys(map);
		//Producing a Collection of the values:
		printnb("Values: ");
		print(map.values());
		print(map);
		print("map.containsKey(11): "+map.containsKey(11));
		print("map.get(11): "+map.get(11));
		print("map.containsValue(\"F0\"): "+map.containsValue("F0"));
		Integer key = map.keySet().iterator().next();
		print("First key in map: "+key);
		map.remove(key);
		printKeys(map);
		map.clear();
		print("map.isEmpty(): "+map.isEmpty());
		map.putAll(new CountingMapData(25));
		//Operations on the Set change the Map:
		map.keySet().removeAll(map.keySet());
		print("map.isEmpty(): "+map.isEmpty());
	}
	public static void main(String[] args) {
		test(new HashMap<Integer,String>());
		test(new TreeMap<Integer,String>());
		test(new LinkedHashMap<Integer,String>());
		test(new IdentityHashMap<Integer,String>());
		test(new ConcurrentHashMap<Integer,String>());
		test(new WeakHashMap<Integer,String>());
		

	}

}
