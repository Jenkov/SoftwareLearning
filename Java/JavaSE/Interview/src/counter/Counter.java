package counter;

public class Counter {

	public static void main(String[] args) {
		int counter =0 ;
		int m,n,q;
		for(int i=1;i<1000;i++){
			m = i/100;
			n = (i-100*m)/10;
			q = i%100;
			int sum = m+n+q;
			if(m!=0){
				if(sum%10==0)
					counter++;
			}else{
				if(n!=0&&sum%10==0)
					counter++;
			}
		}
		System.out.println("counter: "+counter);
		

	}

}
