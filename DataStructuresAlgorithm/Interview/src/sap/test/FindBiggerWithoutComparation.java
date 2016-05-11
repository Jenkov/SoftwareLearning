package sap.test;

public class FindBiggerWithoutComparation {

	public int findBigger(int a,int b){
		int i = 0;
		int res = a-b;
		while(i!=32){
			i++;
			res = res>>1;
		}
		while((res&1)==1){
			return b;
		}
		return a;
	}
	public static void main(String[] args) {
		int bigger = new FindBiggerWithoutComparation().findBigger(-2, -1);
		System.out.println(bigger);
	}

}
