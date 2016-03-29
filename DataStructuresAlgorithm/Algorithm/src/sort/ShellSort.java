package sort;

public class ShellSort {
	public static <AnyType extends Comparable<? super AnyType>>
	void shellSort(AnyType[] a){
		int d = a.length>>1;
		while(d>=1){
			for(int k=0;k<d;k++){
				for(int i=k+d;i<a.length;i+=d){
					AnyType temp = a[i];
					int j = i-d;
					while(j>=k&&temp.compareTo(a[j])<0){
						a[j+d] = a[j];
						j-=d;
					}
					a[j+d]  = temp;
				}
			}
			d =  d>>1;
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = {1,3,6,5,4,8};
		shellSort(a);
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
