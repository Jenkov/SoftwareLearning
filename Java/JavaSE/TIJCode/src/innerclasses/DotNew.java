package innerclasses;
//Creating an inner class directly using the .new syntax.

public class DotNew {
	public class Inner{
		Inner(){
			System.out.println("Inner Constructor");
		}
	}
	public Inner getInner(){
		return new Inner();
	}
	public static void main(String[] args){
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
		System.out.println("-------------------");
		//! DotNew.Inner dni2 = new DotNew.Inner();
		/*No enclosing instance of type DotNew is accessible.
		 *  Must qualify the allocation with an enclosing 
		 * instance  of type DotNew (e.g. x.new A() where x is
		 *  an instance of DotNew).*/
		DotNew.Inner dni3 = dn.getInner();//Another way to get inner class.
	}
}
