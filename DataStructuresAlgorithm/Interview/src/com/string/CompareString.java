package com.string;

public class CompareString {

	public static void main(String[] args) {
		String a = new String("abc");
		String b = "abc";
		String c = new String("abc");
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b==c);
		
		System.out.println(b.equals(c));
		
		System.out.println("*********");
		
		System.out.println(b==a.intern());
		System.out.println(c==a.intern());
		System.out.println(c.intern()==a.intern());
		System.out.println("*************************************");
		String hello = "hello";
		String he = "he";
		String llo = "llo";
		String hello1 = "he"+"llo";
		String hello2 = "he"+llo;
		String hello3 = he+llo;
		System.out.println(hello==hello1);
		System.out.println(hello==hello2);//与变量相加，在堆内生成新的对象
		System.out.println(hello==hello3);
		System.out.println(hello2==hello3);//都在堆内
	}

}
