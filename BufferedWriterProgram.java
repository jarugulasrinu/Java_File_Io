package com.vsoftcorp.fileprogram;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterProgram {
	/* Buffered writer is used to write the character into the new file
	 * There are two constructors
	 * 1.BufferedWriter bw = new BufferedWriter(Writer w);
	 * 2.BufferedWriter bw - new BufferedWriter(Writer w,int bufferSize);
	 * BufferedWriter cannot communicate directly with the file
	 * it can communicate via some writer object
	 * The main disadavantage of the file is 
	 * we can write only int char and string not any time for that 
	 * we need to use printWriter
	 * whever we are closing bufferedwriter automatically internal writer will be closed and we are not required 
	 * to cloase explicity
	 * 
	 */
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("D:\\java\\files\\abc.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Buferedreader");
		bw.write("can do writer");
		bw.newLine();
		bw.write("new line also");
		bw.flush();
		bw.close();
		
		
	}

}
