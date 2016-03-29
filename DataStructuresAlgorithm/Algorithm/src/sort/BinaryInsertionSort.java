package sort;

public class BinaryInsertionSort {
	public static <AnyType extends Comparable<? super AnyType>>
	void binaryInsertionSort(AnyType[] a){
		int mid,left,right;
		
		for(int i=1;i<a.length;i++){
			AnyType temp = a[i];
			left = 0;
			right = i-1;
			while(left<=right){
				mid = (left+right)/2;
				if(a[i].compareTo(a[mid])<0)
					right = mid-1;
					else
					left =mid+1;
			}
			for(int j = i;j>=left;j--)
				a[j] = a[j-1];
			a[left] = temp;
		}
		
		
	}
	
	public static void main(String[] args) {
		Integer[] a = {1,3,6,5,4,8};
		 binaryInsertionSort(a);
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
