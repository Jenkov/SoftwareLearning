package reusing;
class A{}
class B extends A{}
class AFather{
	int f(){
		System.out.println("Father int f()");
		return 1;
	}
	A g(){
		return new A();
	}
	
}
public class AChild extends AFather{
	/*void f(){
		//¸Ãº¯Êý±¨´í
	}*/
	@Override
	int f(){
		System.out.println("Child void f()");
		return 11;
	}
	/*@Override
	A g(){
		return new A();
	}*/
	@Override
	B g(){
		return new B();
	}
}
