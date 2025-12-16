package com.vsoftcorp.fileprogram;

import java.io.File;
import java.io.IOException;

public class CreateFileDirectory {
	//create directory using file 
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\java\\files\\newFile");
		f.mkdir();
		File f1 = new File(f,"demo.txt");
		if(!f1.exists()) {
			f1.createNewFile();
		}
		System.out.println("return true specified directory is pointing to physical folder or not :: "+f.isDirectory());	
		System.out.println("return true specified file objecting pointing to physcial file or not :"+f1.isFile());
		
	}

}
