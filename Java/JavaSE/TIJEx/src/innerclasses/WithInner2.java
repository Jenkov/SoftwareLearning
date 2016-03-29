package innerclasses;

class WithInner1{
	class Inner1{
		Inner1(int i){}
	}
}
public class WithInner2 {
	class Inner2 extends WithInner1.Inner1{
		Inner2(WithInner1 win1,int i){
			win1.super(i);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
