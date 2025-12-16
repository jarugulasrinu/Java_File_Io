package com.vsoftcorp.fileprogram;

import java.io.File;

public class ToDisplayOnlyFileNamesNotDirectory {

	// f.list is used to display both files and directory but i want only files not
	// directory
	public static void main(String[] args) {

		File f = new File("D:\\java\\files");
		String[] list = f.list();
		for (String file : list) {
			File f1 = new File(f, file);
			if (f1.isFile()) {
				System.out.println(file);
			}
		}

	}

}
