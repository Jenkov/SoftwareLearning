package introduction;
class Person{}
class Employee extends Person{}
class Student extends Person{}
public class ArrayStoreExceptionDemo {
	public static void main(String[] args){
		Person[] arr = new Employee[5];
		arr[0]  =  new Student();
		/*Exception in thread "main" java.lang.ArrayStoreException: introduction.Student
		at introduction.ArrayStoreExceptionDemo.main(ArrayStoreExceptionDemo.java:8)
		 */
	}
}
