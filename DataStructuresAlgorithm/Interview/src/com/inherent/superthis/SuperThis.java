package com.inherent.superthis;
class Father{
	public Father(){
		System.out.println("Father.........");
	}
	public Father(int i){
		System.out.println("Father........."+i);
	}
}
public class SuperThis extends Father{

	public SuperThis(){
		super(38);
		//this(250);
		System.out.println("Son........");
	}
	public SuperThis(int i){
		System.out.println("Son"+i);
	}
	public static void main(String[] args) {
		new SuperThis();

	}

}
