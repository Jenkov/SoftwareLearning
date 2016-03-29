package initialization;
class HisParent2{
	HisParent2(){
		System.out.println("HisParent comes...");
	}
}
class HisStaticField{
	HisStaticField(){
		System.out.println("His static field initialized...");
	}
}
public class FieldStaticOrParentFirst extends HisParent2{
	public FieldStaticOrParentFirst(){
		System.out.println("Here I come");
	}
	public static void main(String[] args) {
		System.out.println("main begins...");
		new FieldStaticOrParentFirst();
		System.out.println("main ends...");

	}
	private static HisStaticField hisstaticfield = new HisStaticField();
}

/*His static field initialized...
main begins...
HisParent comes...
Here I come
main ends...
*/