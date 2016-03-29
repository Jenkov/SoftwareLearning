/*
 * P77
 * 练习1
 */
package initialization;

class StringClassInitialization{
	String str;
	public StringClassInitialization(){
		System.out.println("String引用被初始化为："+str);
	}
}

public class ValidInitializaition {

	public static void main(String[] args) {
		new StringClassInitialization();

	}

}
