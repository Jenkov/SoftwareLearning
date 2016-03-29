package initialization;

public class OverloadingVarargs {

	static void f(Character...args){
		System.out.print("first");
		for(Character c:args)
			System.out.print(" "+c);
		System.out.println();
	}
	static void f(Integer...args){
		System.out.print("second");
		for(Integer i:args)
			System.out.print(" "+i);
		System.out.println();
	}
	static void f(Long...args){
		System.out.print("third");	
	}
	public static void main(String[] args) {
		f('a','b','c');
		f(1);
		f(2,1);
		f(0);
		f(0L);
		//!f();//Won't compile -- ambiguous
		//The method f(Character[]) is ambiguous for the type OverloadingVarargs

	}

}
