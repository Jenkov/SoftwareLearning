package concurrency;

public class PrintMessageThread implements Runnable{
	protected int count = 3;
	private static int task = 0;
	private final int id = task++;
	private String startMes,endMes;
	public PrintMessageThread(){
		startMes  = "start......";
		endMes  = "end........";
	}
	public void run(){
		System.out.println(startMes);
		
		while(count-- >0){
			System.out.print("("+id+"running"+ count+")");
			Thread.yield();
		}
		
		System.out.println(endMes);
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
			new Thread(new PrintMessageThread()).start();

	}

}
