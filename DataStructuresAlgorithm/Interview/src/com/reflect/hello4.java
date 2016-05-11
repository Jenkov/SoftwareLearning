package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class Person2{
	
	public Person2(){
		
	}
	public Person2(String name){
		this.name =name;
	}
	public Person2(int age){
		this.age = age;
	}
	public Person2(String name,int age/*,int id*/){
		this.name =name;
		this.age = age;
		//this.id = id;
	}
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
	private String name;
	private int age;
	//private int id;
	

}
/*public class hello4 {

	public static void main(String[] args) {
		Class<?> demo = null;
		try{
			demo = Class.forName("com.reflect.Person2");
		}catch(Exception e){
			e.printStackTrace();
		}
		Person2 per1 = null;
		Person2 per2 = null;
		Person2 per3 = null;
		Person2 per4 = null;
		//取得全部的构造函数
		Constructor<?>[] cons = demo.getConstructors();
		Constructor<?>[] cons2 = new Person2().getClass().getConstructors();
		Constructor<?>[] cons3 = Person2.class.getConstructors();
		for(int i=0;i<cons.length;i++){
			System.out.println("构造方法： "+cons[i]);
		}
		System.out.println("---------------------------------");
		for(int i=0;i<cons2.length;i++){
			System.out.println("构造方法： "+cons[i]);
		}
		System.out.println("---------------------------------");
		for(int i=0;i<cons3.length;i++){
			System.out.println("构造方法： "+cons[i]);
		}
		System.out.println("*********************************");
		try{
			per1 = (Person2) cons[0].newInstance("Rollen",20);
			per2 = (Person2) cons[1].newInstance(20);
			per3 = (Person2) cons[2].newInstance("Rollen");
			per4 = (Person2) cons[3].newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(per1);
		System.out.println(per2);
		System.out.println(per3);
		System.out.println(per4);
		
	}

}
*/
class hello4{
    public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("com.reflect.Person2");
        }catch (Exception e) {
            e.printStackTrace();
        }
        Constructor<?>cons[]=demo.getConstructors();
        for (int i = 0; i < cons.length; i++) {
            Class<?> p[]=cons[i].getParameterTypes();
            System.out.print("构造方法：  ");
            int mo=cons[i].getModifiers();
            System.out.print(Modifier.toString(mo)+" ");
            System.out.print(cons[i].getName());
            System.out.print("(");
            for(int j=0;j<p.length;++j){
                System.out.print(p[j].getName()+" arg"+i);
                if(j<p.length-1){
                    System.out.print(",");
                }
            }
            System.out.println("){}");
        }
    }
}