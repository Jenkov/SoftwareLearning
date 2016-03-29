package eight;

public final class RightCaseInsensitiveString {

	private final String s;
	public RightCaseInsensitiveString(String s){
		if(s==null)
			throw new NullPointerException();
		this.s = s;
	}
	
	public boolean equals(Object o){
		return o instanceof RightCaseInsensitiveString &&
				((RightCaseInsensitiveString)o).s.equalsIgnoreCase(s);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public static void main(String[] args) {
		RightCaseInsensitiveString rcis  =  new RightCaseInsensitiveString("Polish");
		RightCaseInsensitiveString rcis2  =  new RightCaseInsensitiveString("POLISH");
		String s = "polish";
		System.out.println(rcis.equals(s));
		System.out.println(s.equals(rcis));
		System.out.println(rcis.equals(rcis2));
	}

}
