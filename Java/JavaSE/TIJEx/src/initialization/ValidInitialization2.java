package initialization;

/*public class ValidInitialization2 {

	public String str1 = "China";
	public String str2;
	public ValidInitialization2(){
		str2 = "Japan";
	}
	public static void main(String[] args) {
		
		ValidInitialization2 v2 = new ValidInitialization2();
		System.out.println(v2.str1+" is better than "+v2.str2);

	}

}*/
/* China is better than Japan
 * */
public class ValidInitialization2 {

	public static String str1 = "China";
	public static String str2;
	public ValidInitialization2(){
		str2 = "Japan";
	}
	public static void main(String[] args) {

		System.out.println(ValidInitialization2.str1+" is better than "+ValidInitialization2.str2);

	}
}

/*
 * China is better than null
 * */
