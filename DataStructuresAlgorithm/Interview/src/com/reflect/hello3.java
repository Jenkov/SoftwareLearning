package com.reflect;
class Person{
	public Person(){
		
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString(){
		return "["+this.name+" "+this.age+"]";
	}
}
public class hello3 {

	public static void main(String[] args) {
		Class<?> demo = null;
		try{
			demo = Class.forName("com.reflect.Person");
		}catch(Exception e){
			e.printStackTrace();
		}
		Person per =null;
		try{
			per = (Person) demo.newInstance();
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
		per.setName("Rollen");
		per.setAge(20);
		System.out.println(per);

	}

}
/**
 * 没有无参构造的后果
 * java.lang.InstantiationException: com.reflect.Person
	at java.lang.Class.newInstance(Class.java:427)
	at com.reflect.hello3.main(hello3.java:37)
Caused by: java.lang.NoSuchMethodException: com.reflect.Person.<init>()
	at java.lang.Class.getConstructor0(Class.java:3082)
	at java.lang.Class.newInstance(Class.java:412)
	... 1 more
Exception in thread "main" java.lang.NullPointerException
	at com.reflect.hello3.main(hello3.java:43)
*/
