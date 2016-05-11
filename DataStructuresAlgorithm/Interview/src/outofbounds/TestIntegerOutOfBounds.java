package outofbounds;

public class TestIntegerOutOfBounds {

	public static void main(String[] args) {
		int a = 2147483647;
		int b = 2147483647;
		int c = -2147483648;
		if(a>b-c){
			System.out.println("不可以");	
		}else{
			System.out.println("可以");
		}
		System.out.println("*********************");
		//if(a+c)

	}

}
