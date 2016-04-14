package com.corejava.oops.objectmethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileExample {
	public static void main(String[] args) {

		File file = new File("E:/chaitu/doc.txt");

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);

			int content;
			while ((content = fis.read()) != -1) {

				System.out.print((char) content);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
