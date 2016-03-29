/*
 * 那么对于静态变量和静态初始化块之间、变量和初始化块之间的先后顺序又是怎样呢？
 * 是否静态变量总是先于静态初始化块，变量总是先于初始化块就被初始化了呢？
 * 实际上这取决于它们在类中出现的先后顺序。我们以静态变量和静态初始化块为例来进行说明。
 */
package initialization;

class TestA{
	public TestA(){
		System.out.println("Test--A");
	}
}
class TestB{
	public TestB(){
		System.out.println("Test--B");
	}
}
public class TestOrder {
	//静态变量
	public static TestA a = new TestA();

	//静态初始化块
	static{
		System.out.println("静态初始化块");
	}

	//静态变量
	public static TestB b = new TestB();
	
	public static void main(String[] args){
		new TestOrder();
	}

}
/*
 * 运行上面的代码，会得到如下的结果：
 *
 *	Test--A
 *	静态初始化块
 *	Test--B
 *
 * 大家可以随意改变变量a、变量b以及静态初始化块的前后位置，就会发现输出结果随着
 *它们在类中出现的前后顺序而改变，这就说明静态变量和静态初始化块是依照他们在类中的
 *定义顺序进行初始化的。同样，变量和初始化块也遵循这个规律。 
 */
