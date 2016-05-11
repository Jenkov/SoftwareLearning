package com.object.clone;
//浅复制
class Employer implements Cloneable{
	private String username;
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	@Override
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}
//深复制
class Employee implements Cloneable{
	private String username;
	private Employer employer;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	@Override
	public Object clone()throws CloneNotSupportedException{
		//克隆Employee对象并手动克隆Employee对象中包含的Employer对象
		Employee employee = (Employee)super.clone();
		employee.setEmployer((Employer) employee.getEmployer().clone());
		return employee;
	}
	
}
public class TwoCloneWay {
	public static void main(String[] args) throws CloneNotSupportedException{
		Employer employer = new Employer();
		employer.setUsername("arthing");
		
		Employee employee = new Employee();
		employee.setUsername("Jason");
		employee.setEmployer(employer);
		
		//employee2由employee深复制得到
		Employee employee2 = (Employee) employee.clone();
		//这样两个employee各自保存了两个employer
		employee.getEmployer().setUsername("Jason");
		System.out.println(employee.getEmployer().getUsername());
		System.out.println(employee2.getEmployer().getUsername());
	}
}
