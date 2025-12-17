package com.vsoftcorp.fileprogram;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/*
 * conculsion
 * -------------
 * Usage of filereader and filewriter is not recommended because while writing data we have to
 * insert line separator manucally 
 * while readingwe can read data character by character it is not convient 
 * to overcome this problem we should for buffered reader and bufferedReader
 * 
 */
public class FileReaderProgram2 {
	
	//to read char from file and copy to the array
	public static void main(String[] args) throws Exception {
		File f = new File("D:\\java\\files\\abc.txt");
		FileReader fr = new FileReader("D:\\java\\files\\abc.txt");
		char ch[] = new char[(int)f.length()];
		fr.read(ch);
		for(char c:ch) {
			System.out.print(c);
		}
		fr.close();
		
	}

}
