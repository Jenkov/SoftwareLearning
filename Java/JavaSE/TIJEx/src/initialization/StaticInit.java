/*
 * P97
 * Á·Ï°14
 */
package initialization;

public class StaticInit {

	static String str1 = "China";
	static String str2;
	static{
		str2 = "Japan";
	}
	static void printStr(){
		System.out.println(str1+" is better than "+str2);
	}
	public static void main(String[] args) {
		printStr();

	}

}
