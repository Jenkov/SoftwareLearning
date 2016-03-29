package eight;
//Broken - violates symmetry违反对称性原则
public final class CaseInsensitiveString {

	private final String s;
	
	public CaseInsensitiveString(String s){
		if(s==null)
			throw new NullPointerException();
		this.s = s;
	}
	//Broken - violates symmetry
	@Override
	public boolean equals(Object o){
		if(o instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(((CaseInsensitiveString)o).s);
		if(o instanceof String)
			return s.equalsIgnoreCase((String)o);
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public static void main(String[] args) {
		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		String s = "polish";
		System.out.println(cis.equals(s));
		System.out.println(s.equals(cis));
		
	}

}
