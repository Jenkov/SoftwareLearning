package trycatchfinally;

public class Test {
	public static void main(String[] args){
		System.out.println(func());
	}

	private static int func() {
		try{
			return 1;
		}catch(Exception e){
			return 2;
		}finally{
			return 3;
		}
	}
}
