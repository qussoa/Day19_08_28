package com.biz.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_02 {
	public static void main(String[] args) {
		String fileName = "src/com/biz/files/data4.txt";
		PrintWriter fileOut = null;
		
		try {
			fileOut = new PrintWriter(fileName);
			fileOut.println("우리나라만세");
			fileOut.println(30*40);
			fileOut.println(200 % 2);
			
			fileOut.printf("%5d\n",30+40);
			fileOut.print("Republic of Korea\n");
			
			fileOut.flush();
			fileOut.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
