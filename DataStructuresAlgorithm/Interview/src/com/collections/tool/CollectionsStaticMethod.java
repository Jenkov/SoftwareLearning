package com.collections.tool;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionsStaticMethod {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("arthinking");
		list.add("Jason");
		list.add("X");
		
		//创建一个逆序的比较器;
		Comparator<String> r = Collections.reverseOrder();
		//通过逆序的比较器进行排序
		Collections.sort(list,r);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//打乱顺序
		Collections.shuffle(list);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//输出最大最小的数
		System.out.println(Collections.max(list)+":"+Collections.min(list));
	}

}
