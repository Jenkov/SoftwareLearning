package vector;

public class VectorRotate {
	public static void vectorRotate(int i,int[] x){
		
		int k =  x.length/i;
		for(int m=0;m<i;m++){
			int tmp = x[m];
			for(int n = 1;n<=k&&(n*i+m<x.length);n++){
				if(n<=k-1)
					x[(n-1)*i+m]= x[n*i+m];
				x[n*i+m] = tmp;
			}
		}
		
	}
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6,7,8,9,10,11,12};
		int length = 3;
		vectorRotate(3,x);
		for(int i = 0;i<x.length;i++)
			System.out.print(x[i]+" ");
	}

}
