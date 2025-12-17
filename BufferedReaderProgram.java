package com.vsoftcorp.fileprogram;
/*
 * we can use BufferedReader to read character from the file
 * The main advantage of BufferedREader we can read character by character and we can 
 * read data line by line 
 * There are two constructor
 * 1.BufferedReader br = new BufferedReader(Reader);
 * 2.BufferedREader br = new BufferedREader(Reader,int bufferSize);
 * BufferedReader can't communicate directly with the file & it can communicate via reader object
 * same as fileReader in addition to that one new method is there that is readLine()
 * if next line is not ther it return null
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderProgram {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:\\java\\files\\abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {
          System.out.println(line);
          line =  br.readLine();
		}
		br.close();
	}

}
