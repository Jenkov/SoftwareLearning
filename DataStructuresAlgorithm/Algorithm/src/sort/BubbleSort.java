package sort;

public class BubbleSort {

	public static <AnyType extends Comparable<? super AnyType>> 
	void bubbleSort(AnyType[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j].compareTo(a[j+1])>0){
					AnyType temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args){
		Integer[] a = {6,1,6,3,7,9,5};
		bubbleSort(a);
		for(int x = 0;x<a.length;x++)
			System.out.print(a[x]+" ");
	}
}
