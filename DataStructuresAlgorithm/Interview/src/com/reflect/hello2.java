package com.reflect;

class Demo2{
	//other codes...
}
public class hello2 {

	public static void main(String[] args) {
		Class<?> demo1 = null;
		Class<?> demo2 = null;
		Class<?> demo3 = null;
		try{
			//一般尽量采用这种形式
			demo1 = Class.forName("com.reflect.Demo");
		}catch(Exception e){
			e.printStackTrace();
		}
		demo2 = new Demo().getClass();
		demo3 = Demo.class;
		
		System.out.println("类名称    "+demo1.getName());
		System.out.println("类名称    "+demo2.getName());
		System.out.println("类名称    "+demo3.getName());

	}

}
