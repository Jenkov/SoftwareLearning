package array;

import java.util.Arrays;

public class ClosestBigger {
	int[] getClosestBigger(int[] x,int[] y){
		int len = x.length;
		int[] res = new int[len];//最终得到的结果数组
		Arrays.sort(x);
		boolean[] used = new boolean[len];
		int i = 0;
		int k = 0;//作为结果数组的索引
		for(int j = 0;j<len;j++){
			while(i<len&&(x[i]<y[j]))
				i++;
			
			res[k++] = x[i];
			used[i] = true;
			if(k==len-1)
				break;
			if(x[i]>y[j]){
				for(int t=0;t<len;t++){
					if(!used[t]){
						res[k++] = x[t];
						used[t]  =true;
					}
				}
				break;
			}
			
		}
		return res;
	}
	public static void main(String[] args) {
		int[] x = {1,2,3,5}, y ={2,4,1,0};
		int[] res = new ClosestBigger().getClosestBigger(x, y);
		
		for(int i = 0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}

	}

}
