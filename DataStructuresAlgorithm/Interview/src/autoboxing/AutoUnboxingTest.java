package autoboxing;

public class AutoUnboxingTest {
	 public static void main(String[] args) {
	        Integer a = new Integer(3);
	        Integer b = 3;                  // ��3�Զ�װ���Integer����
	        int c = 3;
	        System.out.println(a == b);     // false ��������û������ͬһ����
	        System.out.println(a == c);     // true a�Զ������int�����ٺ�c�Ƚ�
	    }
}
