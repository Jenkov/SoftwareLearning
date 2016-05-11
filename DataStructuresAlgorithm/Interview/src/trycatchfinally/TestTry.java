package trycatchfinally;

public class TestTry {
	static String s="";
	public static void main(String args[]){
		s = test1();
		System.out.println("8  "+s);
	}
	public static String test1(){
		
		try{
			System.out.println("try.....");
			return s = "a";
		}
		finally{
			return s="b";	
			
		}
	}
}
