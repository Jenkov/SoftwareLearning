package io;
import java.io.*;
import java.util.*;

public class ReadLineByLine {
	private List<String> list = new LinkedList<String>();
	public  List<String> read(String filename) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String s;
		while((s=br.readLine())!=null){
			list.add(s+"\n");
		}
		return list;
	}
	public void displayInReverseOrder(){
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(list.size()-i-1));
	}
	public static void main(String[] args) throws Exception {
		ReadLineByLine rlbl = new ReadLineByLine();
		rlbl.read("F:/hehe.txt");
		rlbl.displayInReverseOrder();
	}

}
