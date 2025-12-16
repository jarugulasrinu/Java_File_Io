package com.vsoftcorp.fileprogram;

import java.io.File;

public class FileOperations {
	
	public static void main(String[] args) {
		//To get the list of the all files and directory of specified 
		File f = new File("D:\\java\\files");
		String[] listOfFile = f.list();
		for(String file:listOfFile) {
			System.out.println(file);
		}
		
		//to get number of character present in the specified File
		File f1 = new File("D:\\java\\files\\newFile\\demo.txt");
		long length = f1.length();
		System.out.println("Total number of character present "+length);
		
		//To delete file 
		boolean isDeleted = f1.delete();
		System.out.println("isDeleted :: "+isDeleted);
	}

}
