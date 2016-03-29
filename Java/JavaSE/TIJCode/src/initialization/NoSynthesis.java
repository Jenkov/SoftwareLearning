package initialization;
class Bird2{
	Bird2(int i){}
	Bird2(double d){}
}
public class NoSynthesis {
	public static void mian(String[] args){
		 //!Bird2 b1 = new Bird2();//No default
		 Bird2 b2 = new Bird2(2);
		 Bird2 b3 = new Bird2(1.0);
	}
}
