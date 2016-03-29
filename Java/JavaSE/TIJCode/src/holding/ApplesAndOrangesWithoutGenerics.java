package holding;

import java.util.ArrayList;

class Apple{
	private static long counter;
	private final long id = counter++;//*********************关于final的使用有疑问
	
	public long id(){return id;}
}
class Orange{}
public class ApplesAndOrangesWithoutGenerics {
	public static void main(String[] args){
		ArrayList apples = new ArrayList();
		for(int i=0;i<3;i++)
			apples.add(new Apple());
			//not prevented from adding an Orange to apples:
		apples.add(new Orange());
		for(int i=0;i<apples.size();i++){
			System.out.println(((Apple)apples.get(i)).id());
			//Orange is detected only at run time
		}
		
	}
}
