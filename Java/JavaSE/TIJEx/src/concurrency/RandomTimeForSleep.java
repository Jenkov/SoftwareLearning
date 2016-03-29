package concurrency;
import java.util.concurrent.*;
import java.util.*;

public class RandomTimeForSleep implements Runnable{
	
	public void run(){
		try{
		Random rand = new Random();
		int i = (rand.nextInt(10)+1)*1000;
		TimeUnit.MILLISECONDS.sleep(i);
		System.out.println(" "+i+" ");
		}catch(InterruptedException e){
			System.err.println(e);
		}
		
	}
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			exec.execute(new RandomTimeForSleep());
		exec.shutdown();

	}

}
