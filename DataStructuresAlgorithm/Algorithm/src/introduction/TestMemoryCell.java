package introduction;

public class TestMemoryCell {

	public static void main(String[] args) {
		MemoryCell m = new MemoryCell();
		
		m.write("37");
		String val = (String)m.read();
		System.out.println("Contents are : "+val);
		System.out.println("----------------------------");
		
		m.write(new Integer(37));
		Integer wrapperVal = (Integer)m.read();
		int val1 = wrapperVal.intValue();
		System.out.println("Contents are: "+val1);

	}

}
