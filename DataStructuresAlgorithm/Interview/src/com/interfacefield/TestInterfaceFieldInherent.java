package com.interfacefield;

interface haha{
	public static int age = 20;
	public static String name = "china";
	void eat();
}
public class TestInterfaceFieldInherent implements haha{

	public static void main(String[] args) {
		int i = haha.age;
		int ii = new TestInterfaceFieldInherent().age;
		int iii = TestInterfaceFieldInherent.age;
		System.out.println(i);
		System.out.println(ii);
		System.out.println(iii);
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.out.println("--------------------------");
		String n = haha.name;
		String nn = new TestInterfaceFieldInherent().name;
		String nnn = TestInterfaceFieldInherent.name;
		System.out.println(n);
		System.out.println(nn);
		System.out.println(nnn);

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}
