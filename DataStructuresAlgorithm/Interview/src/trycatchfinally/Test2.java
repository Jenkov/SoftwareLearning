package trycatchfinally;

public class Test2 {
	public static void main(String[] args){
		System.out.println(print());
	}
	public static int print() {
        int c = 1;
        try {
            c++;
            System.out.println(c);
            System.out.println("try");
            return c+100; //--------1
        }finally {
            c++;
            System.out.println(c);
            System.out.println("finally");
           
        }
    }
}
