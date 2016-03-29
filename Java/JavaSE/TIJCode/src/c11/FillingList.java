package c11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillingList {

	public static void main(String[] args) {
		List list = new ArrayList();
		for(int i=0;i<10;i++){
			list.add("");
		}
		/*
		 * 以上可以让List容器知道存储的大小
		 * */
		Collections.fill(list, "Hello");
		System.out.println(list);
		

	}

}
