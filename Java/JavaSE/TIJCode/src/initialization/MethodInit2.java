//这个方法也可以带有参数，但是这个参数必须是已经被初始化的
package initialization;

public class MethodInit2 {

	int i = f();
	int j = g(i);
	
	int f(){return 11;}
	int g(int n){return n*10;}
}

class MethodInit3{
	//!int j = g(i);//Illegal forward reference
	//Cannot reference a field before it is defined
	int i = f();
	int f(){return 11;}
	int g(int n){return  n*10;}
}