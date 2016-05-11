package com.reflect;
/**
 * 通过一个对象获得完整的报名
 * @author Administrator
 *
 */
class Demo{
	//other codes...
}
public class hello {

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.getClass().getName());
	}

}
/*
 * 添加一句：所有类的对象其实都是Class的实例。
 */
