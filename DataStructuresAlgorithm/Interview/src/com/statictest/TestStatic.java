package com.statictest;

public class TestStatic {

	private int a = 2;
	private static int b = 3;
	
	public static void main(String[] args) {
		System.out.println(new TestStatic().a);
		System.out.println(new TestStatic().b);
		System.out.println(TestStatic.b);

	}

}
