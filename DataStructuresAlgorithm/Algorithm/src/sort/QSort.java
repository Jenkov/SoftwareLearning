package sort;

public class QSort {
	private int[] x;
	public QSort(int[] x){
		this.x = x;
	}
	public void qsort1(int l,int u){
		if(l>=u)
			return;
		int m = l;
		for(int i=l+1;i<=u;i++){
			if(x[i]<x[l])
				swap(++m,i);
		}
		swap(l,m);
		qsort1(l,m-1);
		qsort1(m+1,u);
	}
	public void qsort3(int l,int u){
		if(l>=u)
			return;
		int t = x[l];
		int i = l,j = u+1;
		while(i<=j){
			do{
				i++;
			}while(i<=u&&x[i]<t);
			do{
				j--;
			}while(x[j]>t);
			if(i>j)
				break;
			swap(i,j);
		}
		swap(l,j);
		qsort3(l,j-1);
		qsort3(j+1,u);
			
	}

	private void swap(int i1, int i2) {
		int temp  = x[i1];
		x[i1] = x[i2];
		x[i2] = temp;
		
	}

	public static void main(String[] args) {
		int[] x = {1,6,3,7,9,8,4,8,0,3,5};
		//new QSort(x).qsort1(0, x.length-1);
		new QSort(x).qsort3(0, x.length-1);
		for(int i = 0;i<x.length;i++)
			System.out.print(x[i]+" ");
	}

}
