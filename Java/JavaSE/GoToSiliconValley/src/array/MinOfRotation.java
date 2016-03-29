package array;

public class MinOfRotation {
	int getMinOfRotation(int[] A){
		int left = 0,right = A.length-1,mid,min = A[left];
		while(left<right){
			mid = left + (right-left)/2;
			min = Math.min(A[left], min);
			if(A[mid]==A[left]&&A[mid]==A[right]){
				//不能确定最小值在哪一部分，向前移动一格
				left++;
			}else if(A[mid]>=A[left]){
				//在右半部分查找
				left = mid+1;
				min = Math.min(A[left], min);
			}else{
				//在左半部分
				min = Math.min(A[mid], min);
				right = mid-1;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] A = {3,4,5,6,1,2};
		int minValue = new MinOfRotation().getMinOfRotation(A);
		
		System.out.println("minValue: "+minValue);

	}

}
