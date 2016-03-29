package array;

public class TopK {
	int partition(int[] data,int start,int end){
		if(start>end) return -1;
		int index = start;//可以随机选择pivot，不一定是第一个元素
		//第一次交换
		int tmp = data[index] ;
		data[index] = data[end];
		data[end] = tmp;
		for(int i=start;i<end;i++){
			if(data[i]<=data[end]){
				if(i!=index){
					//第二次交换
					tmp = data[index];
					data[index] = data[i];
					data[i] = tmp;
				}
				index++;
			}
		}
		//第三次交换
		tmp = data[end];
		data[end] = data[index];
		data[index] = tmp;
		return index;
		
	}
	void getTopK(int[] data,int k){
		int start = 0,end = data.length-1;
		int index = partition(data,start,end);
		while(index!=k-1){
			if(index>k-1){
				//从index前面重新找
				end = index-1;
				index = partition(data,start,end);
			}else{
				//从index后面重新找
				start = index+1;
				index = partition(data,start,end);
			}
		}
		for(int i = 0;i<k;i++){
			System.out.println(data[i]+"\t");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
