package com.vsoftcorp.fileprogram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProgram1 {
	/* file writer is used to write character data to the file
	 * There are three constructor are there
	 * 1.FileWriter fw = new FileWriter(String fname);
	 * 2.FileWriter fw = new FileWriter(File f);
	 * 
	 * The above filewriter meant for over-riding of existing data instead on overridng if we want append
	 * operation then we have to create filewriter by using following constructor
	 * 
	 * 3.FileWriter fw = new FileWriter(String fname, boolean append);
	 * 4.FileWriter fw = new FileWriter(File f, boolean append);
	 * if the specified file is not already available then all the 
	 * above constructor will create that file
	 * 
	*/
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter(new File("D:\\java\\files\\abc.txt"),true);
//		fw.write(100);
//		fw.write("urga\nsoftwaresolutions");
//		fw.write("\n");
//		char [] ch = {'a','b','c'};
	//	fw.write(ch);
		fw.write("This is appending ");
		fw.flush();
		fw.close();
		
	}
	
	/*The main problem with filewriter we have to insert the line separator("\n) manulaly which variaed from system
	 * to system It is diffulty to the programmer we can solve this problem by Buffered writer
	 *
	 * 
	 */

}
