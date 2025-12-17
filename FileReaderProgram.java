package com.vsoftcorp.fileprogram;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderProgram {

	/*FileReader is used to read character data from the file
	 * FileReader fr = new FileReader(String fname);
	 * FileReader fr = new FileReader(File f);
	 * 
	 */
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(new File("D:\\java\\files\\abc.txt"));
		//int read it attempt to read next character from file and returns it's unicode value.
		//if the next character not available this method returs -1
		int i = fr.read();
		while(i != -1) {
			System.out.print((char)i);
			i = fr.read();
		}
		
		
	}
}
