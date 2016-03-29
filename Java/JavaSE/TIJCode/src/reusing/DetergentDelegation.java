package reusing;

public class DetergentDelegation {

	private Cleanser clc = 
			new Cleanser();

	public void dilute(){
		clc.append("dilute()");
	}
	public void apply(){
		clc.append("apply()");
	}
	public void scrub(){
		clc.append("scrub()");
	}
	public String toString(){
		return clc.toString();
	}
	public static void main(String[] args) {
		DetergentDelegation x = 
				new DetergentDelegation();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}

}
