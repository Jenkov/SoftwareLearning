package c11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PrintintContainers {
	static Collection fill(Collection c){
		c.add("dog");
		c.add("dog");
		c.add("cat");
		
		return c;
	}
	static Map fill(Map m){
		m.put("dog","Bosco");
		m.put("dog","Spot");
		m.put("cat","Rags");
		
		return m;
	}
	
	
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList()));
		System.out.println(fill(new HashSet()));
		System.out.println(fill(new HashMap()));
	}

}
