package introduction;

public abstract class Shape implements Comparable{
	public abstract double S();
	public int compareTo(Object o){
		if(!(o instanceof Shape)){
			throw new RuntimeException();
		}
		Shape s = (Shape)o;
		if(S()>s.S())
			return 1;
		else if(S()<s.S())
			return -1;
		else
			return 0;
	}
}
