package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MergeInterval {
	ArrayList<Interval> merge(ArrayList<Interval> intervals){
		ArrayList<Interval> res = new ArrayList<Interval>();
		if(intervals==null||intervals.isEmpty()) return res;
		Comparator<Interval> comparator = new Comparator<Interval>(){
			@Override
			public int compare(Interval a,Interval b){
				if(a.start<b.start) return -1;
				else if(a.start>b.start) return 1;
				else{
					//start值相同，还需要比较end
					if(a.end<b.end) return -1;
					else if(a.end>b.end) return 1;
					else return 0;
				}
			}
		};
		//利用java排序函数
		Collections.sort(intervals,comparator);
		
		for(int i=0;i<intervals.size();i++){
			Interval current = intervals.get(i);
			if(res.isEmpty()){
				//初始化结果集
				res.add(current);
			}else{
				Interval last = res.get(res.size()-1);
				if(last.end>=current.start){
					//合并并更新结果集
					last.end = Math.max(last.end, current.end);
				}else{
					//若没有重叠，则直接加入结果集合里
					res.add(current);
				}
			}
					
		}
		return res;
	}
	public static void main(String[] args){
		Interval[] intervals1 = {new Interval(1,5),new Interval(6,10),
				new Interval(4,6),new Interval(15,20)};
		ArrayList<Interval> intervals = new ArrayList<Interval>(Arrays.asList(intervals1));
		ArrayList<Interval> ints =  new MergeInterval().merge(intervals);
		
		for(int i=0;i<ints.size();i++){
			System.out.print("("+ints.get(i).start+","+ints.get(i).end+")"+" ");
		}
		
	}
}
