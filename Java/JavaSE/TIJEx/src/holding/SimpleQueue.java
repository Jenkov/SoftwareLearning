package holding;

import java.util.LinkedList;
import java.util.Queue;

class Command{
	private String str;
	public Command(){
		
	}
	public Command(String str){
		this.str = str;
	}
	public void operation(){
		System.out.println(str);
	}
}

class FillQueue{
	public Queue<Command> queue;
	public FillQueue(){
		
		queue= new LinkedList<Command>();
		
		queue.offer(new Command("daxiong"));
		queue.offer(new Command("xiaohuang"));
		queue.offer(new Command("zhuzhu"));
	}
}
public class SimpleQueue {
	
	public void display(FillQueue fq){
		while(fq.queue.peek()!=null){
			fq.queue.remove().operation();
		}
	}
	public static void main(String[] args) {
		new SimpleQueue().display(new FillQueue());
	}

}
