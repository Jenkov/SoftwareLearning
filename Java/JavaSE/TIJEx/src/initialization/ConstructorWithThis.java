package initialization;

public class ConstructorWithThis {

	private String s;//��Ա����
	ConstructorWithThis(String s){
		this.s = s;
		System.out.println("s = "+s);
	}
	ConstructorWithThis(){
		this("����������������");
	}
	
	public static void main(String[] args) {
		new ConstructorWithThis();

	}

}
