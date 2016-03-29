package array;

import java.util.Arrays;
import java.util.Random;

public class NumInRange {
	void numInRange(int[] intList,int min,int max){
		Arrays.sort(intList);//对输入数组进行排序
		int range = max-min+1;
		Random rand =new Random();
		int result = rand.nextInt(range)+min;
		//二分查找,直到该随机数不在数组里
		while(Arrays.binarySearch(intList,result)>0){
			result = rand.nextInt(range)+min;
		}
		System.out.println(result);
		
		
	}
	public static void main(String[] args) {
		int[] intList = {15,12,48,66,10,3,99};
		new NumInRange().numInRange(intList, 3, 99);
	}

}
