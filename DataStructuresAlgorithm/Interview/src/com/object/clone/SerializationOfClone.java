package com.object.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employer2 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}
class Employee2 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Employer2  employer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employer2 getEmployer() {
		return employer;
	}
	public void setEmployer(Employer2 employer) {
		this.employer = employer;
	}
	/**
	 * 实现深复制的方法
	 */
	public Object deepCopy()throws IOException,ClassNotFoundException{
		//字节数组输出流，暂存到内存中
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		//序列化
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		//反序列化
		return ois.readObject();		
		
	}
	
}
public class SerializationOfClone {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Employer2 employer =  new Employer2();
		employer.setName("arthinking");
		Employee2 employee = new Employee2();
		employee.setName("Jason");
		employee.setEmployer(employer);
		//通过深复制创建employee2
		Employee2 employee2 = (Employee2) employee.deepCopy();
		employee2.getEmployer().setName("Jason");
		
		System.out.println(employee.getEmployer().getName());
		System.out.println(employee2.getEmployer().getName());
	}

}
