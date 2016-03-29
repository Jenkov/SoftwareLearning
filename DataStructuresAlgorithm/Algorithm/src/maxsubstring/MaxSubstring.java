package maxsubstring;

public class MaxSubstring {
	private int[] x;
	public MaxSubstring(int[] x){
		this.x = x;
	}
	
	public int maxsubstring1(int n){
		int maxsofar = 0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				int sum = 0;
				for(int k= i;k<=j;k++){
					sum+=x[k];
				}
				maxsofar =max(maxsofar,sum);
			}
		}
		return maxsofar;
	}

	public int maxsubstring2(int n){
		int maxsofar = 0;
		for(int i =0;i<n;i++){
			int sum  =0 ;
			for(int j = i;j<n;j++){
				sum+=x[j];
				maxsofar = max(maxsofar,sum);
			}
		}
		
		return maxsofar;
	}
	
	public int maxsubstring3(int l,int u){
		if(l>u)
			return 0;
		if(l==u)
			return max(0,x[l]);
		int m = (l+u)/2;
		int lmax,sum;
		lmax =sum =0;
		//向左走
		for(int i = m;i>=l;i--){
			sum+=x[i];
			lmax = max(lmax,sum);
		}
		int rmax;
		rmax = sum = 0;
		//向右走
		for(int i = m+1;i<=u;i++){
			sum+=x[i];
			rmax  =max(rmax,sum);
		}
		
		return max(lmax+rmax,maxsubstring3(l,m),maxsubstring3(m+1,u));
	}
	
	private int max(int maxsofar, int sum) {
		return (maxsofar>sum)?maxsofar:sum;
	}
	private int max(int a,int b,int c){
		return max(max(a,b),c);
	}
	public static void main(String[] args) {
		int[] x = {31,-41,59,26,-53,58,97,-93,-23,84};
		int n = x.length;
		//O(n^3)
		/*int maxsubstring1=new MaxSubstring(x).maxsubstring1(n);
		System.out.println("maxsubstring1: "+maxsubstring1);*/
		//O(n^2)
		/*int maxsubstring2=new MaxSubstring(x).maxsubstring2(n);
		System.out.println("maxsubstring2: "+maxsubstring2);*/
		int maxsubstring3=new MaxSubstring(x).maxsubstring3(0,n-1);
		System.out.println("maxsubstring3: "+maxsubstring3);
	}

}
