//�������Ҳ���Դ��в�����������������������Ѿ�����ʼ����
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