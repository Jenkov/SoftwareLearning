package com.shulun;

public class MaxGongyueshu {

	public int maxGongyueshu(int a,int b){
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int yu  = max%min;
		while(yu!=0){
			max = min;
			min = yu;
			yu = max%min;
		}
		return min;
	}
	public static void main(String[] args) {
		int maxGongyueshu = new MaxGongyueshu().maxGongyueshu(15, 11);
		System.out.println(maxGongyueshu);

	}

}
