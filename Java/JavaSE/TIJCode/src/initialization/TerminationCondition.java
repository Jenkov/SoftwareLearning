package initialization;
//Using finalize() to detect an object that
//hasn't been properly cleaned up
class Book{
	boolean checkOut = false;
	Book(Boolean checkOut){
		checkOut = checkOut;
	}
	void checkIn(){
		checkOut = false;
	}
	protected void finalize(){
		if(checkOut)
			System.out.println("Error:checked out");
		//Normally , you'll also do this:
		//super.finalize();//Call the base-class version
	}
}
public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		//Proper cleanup
		novel.checkIn();
		//Drop the reference,forget to clean up:
		new Book(true);
		//Forget garbage collection & finalization:
		System.gc();

	}

}
