package compute;

public class TestComputeTime {

	public static void main(String[] args) {
		long start1,end1,start2,end2,start3,end3;
		int sum1,sum2,sum3;
		start1 = System.currentTimeMillis();
		for(long i=0;i<800000000;i++)
			sum1=17+17;
		end1 = System.currentTimeMillis();
		start2 = System.currentTimeMillis();
		for(long i=0;i<800000000;i++)
			sum2=17<<1;
		end2 = System.currentTimeMillis();
		start3 = System.currentTimeMillis();
		for(long i=0;i<800000000;i++)
			sum1=(2<<4)+2;
		end3 = System.currentTimeMillis();
		
		System.out.println("17+17: "+(end1-start1)+"ºÁÃë");
		System.out.println("17<<1: "+(end2-start2)+"ºÁÃë");
		System.out.println("(2<<4)+2: "+(end3-start3)+"ºÁÃë");
	}

}
