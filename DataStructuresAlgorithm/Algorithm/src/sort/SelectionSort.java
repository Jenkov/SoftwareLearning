package sort;

public class SelectionSort {
	public static <AnyType extends Comparable<? super AnyType>>
	void selectionSort(AnyType[] a){
		int min;//最小值的数组坐标
		for(int i=0;i<a.length-1;i++){
			min = i;
			for(int j=i+1;j<a.length;j++){
				if(a[min].compareTo(a[j])>0)
					min = j;
			}
			if(min!=i){
				AnyType temp = a[min];
				a[min] =a[i];
				a[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		Integer[] a = {1,3,6,5,4,8};
		selectionSort(a);
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
