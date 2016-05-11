package trycatchfinally;

public class TestTry2 {
	static String s="";
	public static void main(String args[]){
		s = test1();
		System.out.println("8  "+s);
	}
	public static String test1(){
		
		try{
			System.out.println("try.....");
			return s = "我在finally执行之前已经执行了,但在finally执行完后才返回";
		}
		finally{
			System.out.println(s);
			s="我是finally中的";	
			System.out.println("17  "+s);
		}
	}
}