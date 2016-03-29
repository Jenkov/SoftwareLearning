package innerclasses;
//Inheriting an inner class.
class WithInner{
	class Inner{}
}
public class InheritInner extends WithInner.Inner{
	//! InheritInner(){}//Won't compile
	//No enclosing instance of type WithInner is available due to some intermediate constructor invocation
	InheritInner(WithInner wi){
		wi.super();
	}
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);

	}

}
