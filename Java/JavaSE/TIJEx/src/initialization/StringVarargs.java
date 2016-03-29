/*
 * P105
 * Á·Ï°19
 */
package initialization;

public class StringVarargs {

	static void f(String...args){
		for(String s:args)
			System.out.print(s+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		f("hi","haha","heihei");
		f(new String[]{"a","oe","iuv"});
	}

}
