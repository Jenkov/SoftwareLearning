package array;

import java.util.ArrayList;

public class InsertInterval {
	ArrayList<Interval> insert(Interval[] intervals,Interval newInt){
		ArrayList<Interval> res = new ArrayList<Interval>();
		if(intervals == null){
			res.add(newInt);
			return res;
		}
		int i = 0,  n=intervals.length;
		while(i<n&& newInt.start>intervals[i].end){
			res.add(intervals[i++]);
		}
		while(i<n&&newInt.end>=intervals[i].start){
			//合并
			newInt.start = Math.min(newInt.start, intervals[i].start);
			newInt.end = Math.max(newInt.end, intervals[i].end);
			i++;
		}
		res.add(newInt);
		//剩下的部分
		while(i<n){
			res.add(intervals[i++]);
		}
		
		return res;
				
	}

	public static void main(String[] args) {
		Interval[] intervals = {new Interval(1,5),new Interval(6,10)};
		Interval newInt = new Interval(4,6);
		ArrayList<Interval> ints = new InsertInterval().insert(intervals, newInt);
		
		for(int i=0;i<ints.size();i++){
			System.out.print("("+ints.get(i).start+","+ints.get(i).end+")"+" ");
		}

	}

}
