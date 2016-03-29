package array;

public class Point implements Comparable<Point>{
	int value;//数值
	int type;//点的类型，0为起点，1为终点
	Point(int v,int t){
		value = v;
		type = t;
	}
	//还需要实现compareTo函数，以便排序
	@Override
	public int compareTo(Point p1) {
		if(this.value==p1.value){
			return 0;
		}else if(this.value>p1.value){
			return 1;
		}else{
			return -1;
		}
	}
	
	
}
