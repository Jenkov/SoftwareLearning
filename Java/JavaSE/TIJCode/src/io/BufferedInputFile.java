package io;
import java.io.*;
//ÄãºÃ
public class BufferedInputFile {
	//Throw exceptions to console:
	public static String
	read(String filename)throws IOException{
		//Reading input by lines:
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while((s=in.readLine())!=null)
			sb.append(s+"\n");
		in.close();
		return sb.toString();
	}
	public static void main(String[] args)
	throws IOException{
		System.out.print(read("D:/eclipse/eclipse-jee-mars-1-win32/workspace/ThinkingInJava/TIJCode/src/io/BufferedInputFile.java"));
	}
}
