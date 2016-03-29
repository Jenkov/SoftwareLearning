package initialization;

public class ConstructorWithThis {

	private String s;//撹埀延楚
	ConstructorWithThis(String s){
		this.s = s;
		System.out.println("s = "+s);
	}
	ConstructorWithThis(){
		this("込込込込込込込込");
	}
	
	public static void main(String[] args) {
		new ConstructorWithThis();

	}

}
