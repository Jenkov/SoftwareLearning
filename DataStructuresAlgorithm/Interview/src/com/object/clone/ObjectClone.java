package com.object.clone;
class A implements Cloneable{
	private int i = 100;
	@Override
	public  A clone() throws CloneNotSupportedException{
		return (A) super.clone();
	}
	@Override
	public int hashCode(){
		return 100;
	}
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof A))
			return false;
		A aa = (A)obj;
		return this.i == aa.i;
	}
}

public class ObjectClone implements Cloneable{
	public ObjectClone useSuper() throws CloneNotSupportedException{
		return (ObjectClone) super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		A a = new A();
		A b = (A) a.clone();
		
		System.out.println(a.equals(b));
		System.out.println(a.getClass()==b.getClass());
		System.out.println(a!=b);//a!=a.clone()
		System.out.println("*********");
		ObjectClone oc = new ObjectClone();
		ObjectClone oc2 = oc.useSuper();
		System.out.println(oc.getClass()==oc2.getClass());
	}

}
