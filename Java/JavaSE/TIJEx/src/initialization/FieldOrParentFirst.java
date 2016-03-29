package initialization;
class HisParent{
	HisParent(){
		System.out.println("HisParent comes...");
	}
}
class HisField{
	HisField(){
		System.out.println("His field initialized...");
	}
}
public class FieldOrParentFirst extends HisParent{
	public FieldOrParentFirst(){
		System.out.println("Here I come");
	}
	public static void main(String[] args) {
		System.out.println("main begins...");
		new FieldOrParentFirst();
		System.out.println("main ends...");

	}
	private HisField hisfield = new HisField();
}
/*main begins...
HisParent comes...
His field initialized...
Here I come
main ends...*/

