package stack;

public class InverseString {
	public static void inverse(String s){
		String[] substr = s.split(" ");
		for(int i = substr.length-1;i>=0;i--)
			System.out.print(substr[i]+" ");
	}
	public static void main(String[] args){
		inverse("i am a student");
	}
}
