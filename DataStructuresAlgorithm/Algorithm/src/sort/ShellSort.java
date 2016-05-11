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

/*
 * shell排序
 * 希尔排序 直接插入排序的升级版
static void shellSort(int[] a){
	int j,i,h;
	int r,temp;
	int x=0;
	for(r= a.length/2;r>=1;r/=2){
		for(i =r ;i<a.length;i++){
			temp = a[i];
			j = i-r;
			while(j>=0 && temp<a[j]){
				a[j+r]=a[j];
				j -= r;
			}
			a[j+r]=temp;
			
		}
		x++;
		System.out.println("第"+x+"步排序结果：");
		for(h = 0;h<a.length;h++){
			System.out.print(""+a[h]+" ");
		}
		System.out.println("\n");
	}
}*/
