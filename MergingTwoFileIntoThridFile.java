package com.vsoftcorp.fileprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergingTwoFileIntoThridFile {
	// Writer a program to merge a data from two files into a third file
	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("D:\\java\\files\\file3.txt");
		BufferedReader br = new BufferedReader(new FileReader("D:\\java\\files\\file1.txt"));
		String line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("D:\\java\\files\\file2.txt"));
		line = br.readLine();
		while (line != null) {
			pw.println(line);
		 line = br.readLine();
		}
		br.close();
		pw.flush();
		pw.close();
		System.out.println("both read and write operation is complete");
	}

}
