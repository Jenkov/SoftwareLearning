package sort;

public class InsertionSort {

	/*
	 * Simple insertion sort.
	 * @param a an array of Comparable items.
	 */
	public static <AnyType extends Comparable<? super AnyType>>
	void insertionSort(AnyType[] a){
		int j;
		for(int i=1;i<a.length;i++){
			AnyType temp = a[i];
			for(j=i;j>0&&temp.compareTo(a[j-1])<0;j--)
				a[j] = a[j-1];
			a[j] = temp;
		}
	}
	public static void main(String[] args) {
		Integer[] a = {1,3,6,5,4,8};
		insertionSort(a);
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
