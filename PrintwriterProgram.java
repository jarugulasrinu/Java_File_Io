package com.vsoftcorp.fileprogram;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintwriterProgram {
	/*
	 * It is the most enhanced writer to write character data to the file
	 * The main advantage of printwriter over fileWriter & bufferedWriter is we can write anytype of the primitive 
	 * data directly to the file
	 * printWriter can communicate directly with the file & can communicate via some writer object also
	 * we can use reader and writers to handle character data(text data) where we have to use outputstream to handle
	 * binary data  outputstream to write binary data  input stream to read binary data
	 */
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("D:\\java\\files\\abc.txt");
		pw.print("Hi dude this is srinu");
		pw.println("I am writing next line just checking but using pring");
		pw.println("I am write the next line using println");
		pw.write(100);
		pw.print(100);
		pw.flush();
		pw.close();
		
		
		
	}

}
