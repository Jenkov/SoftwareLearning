package c11;

import java.util.ArrayList;
import java.util.List;

public class MouseList {
	private List list = new ArrayList();
	public void add(Mouse m){
		list.add(m);
	}
	public Mouse get(int index){
		return (Mouse)list.get(index);
	}
	public int size(){
		return list.size();
	}
}
