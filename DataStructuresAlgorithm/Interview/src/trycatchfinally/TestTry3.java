package trycatchfinally;

public class TestTry3 {

    public static void main(String[] args) {
        
        test1();
    }

    public static void test1() {
        int b = 20;

        try {
            System.out.println("try block");

           // return b += 80; 
            System.out.println(b+=80);
        }
        catch (Exception e) {

            System.out.println("catch block");
        }
        finally {
            
            System.out.println("finally block");
            
            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }
            b = 10000;
           // return b;
            System.out.println(b);
        }
        
        
    }
    
}