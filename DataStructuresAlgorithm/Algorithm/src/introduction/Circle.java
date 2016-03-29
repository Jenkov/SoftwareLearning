package introduction;

public class Circle extends Shape{
	private double r;
	public Circle(double r){
		this.r = r;
	}
	public double S(){
		return Math.PI*r*r;
	}
}
