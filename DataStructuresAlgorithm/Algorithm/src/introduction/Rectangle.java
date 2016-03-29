package introduction;

public class Rectangle extends Shape{
	private double a,b;
	public Rectangle(double a,double b){
		this.a =a;
		this.b = b;
	}
	public double S(){
		return a*b;
	}
}
