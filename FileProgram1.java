package com.vsoftcorp.fileprogram;

import java.io.File;
import java.io.IOException;

public class FileProgram1 {
	
	/*File f = new File("abc.txt"); This line won't create any physical file first it will
	 * check is there any physcial file name with "abc.txt" is available it is representing to f
	 * if it's not available then we are just creating file object and represnt name "abc.tx"
	 */
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\java\\files\\abc.java");
		if(!f.exists())
		f.createNewFile();
		System.out.println(f.exists());
		
	}

}
