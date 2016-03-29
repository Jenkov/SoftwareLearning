package introduction;

public class Square extends Shape{
	private double a;
	public Square(double a){
		this.a = a;
	}
	public double S(){
		return a*a;
	}
}
