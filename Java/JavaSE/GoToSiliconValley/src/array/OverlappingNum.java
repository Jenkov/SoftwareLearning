package array;

import java.util.Arrays;
import java.util.Collections;

public class OverlappingNum {
	int getOverlappingCount(Interval[] A){
		int max = 0,count =1;
		if(A==null||A.length==0)
			return max;
		Point[] points = new Point[A.length*2];
		for(int i=0;i<A.length;i++){
			//转为可排序的点
			points[2*i] = new Point(A[i].start,0);
			points[2*i+1]= new Point(A[i].end,1);
		}
		
		Collections.sort(Arrays.asList(points));
		
		for(int i=0;i<points.length;i++){
			System.out.print(points[i].value+"("+points[i].type+")"+" ");
			if(points[i].type==0){
				count++;//起点
				max = Math.max(max, count);
			}else{
				count--;
			}
		}

		return max;
	}	
	public static void main(String[] args) {
		Interval[] A = {new Interval(1,5),new Interval(10,15),new Interval(5,10),new Interval(20,30)};
		int overlappingCount = new OverlappingNum().getOverlappingCount(A);
		System.out.println("overlappingCount is "+overlappingCount);
	}

}
