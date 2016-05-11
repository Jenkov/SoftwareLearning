package leetcode;

public class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i = num;i>=0;i--){
            int tmp = i;
            int counter = 0;
            while(i!=0){
                if(i%2==1)
                    counter++;
                i=i>>1;
            }
            i = tmp;
            res[i] = counter;
        }
        return res;
    }
    public static void main(String[] args){
    	int[] res = new Solution().countBits(2);
    	for(int i=0;i<res.length;i++){
    		System.out.print(res[i]+" ");
    	}
    }
}