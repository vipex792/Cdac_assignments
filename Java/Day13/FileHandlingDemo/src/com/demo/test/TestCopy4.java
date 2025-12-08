package com.demo.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
public class TestCopy4 {

	public static void main(String[] args) {

		File f = new File("myfilecopy.txt");
		FileOutputStream fos = null;
		try {
			if(f.exists()) {
				fos = new FileOutputStream("myfilecopy.txt", true);
			}
			else {
				fos = new FileOutputStream("myfilecopy.txt");
			}
			
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		try (FileInputStream fis  = new FileInputStream("myfile.txt");
				FileOutputStream fos1 =fos;){
			int i = fis.read();
			while(i!=-1) {
				fos1.write(i);
				i = fis.read();
			}
			
		}catch(IOException e){
			System.out.println(e.getMessage() );
		}
	}

}
