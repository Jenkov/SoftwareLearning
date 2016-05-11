package randnum;

import java.util.Random;

public class RandNum {

	public static void main(String[] args) {
		Random rand = new Random();
		int sum = 0;
		for(int i = 0 ;i<100;i++){
			int j = rand.nextInt(100)+1;
			sum+=j;
		}
		System.out.println((int)sum*3/400);
			

	}

}
