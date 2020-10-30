package day4;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Q1 {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("demo.txt");
	FileOutputStream fos=new FileOutputStream("democopy.txt");
	
	int i = 0;
	while ((i = fis.read()) != -1) {
		fos.write(i);
	}
	
	fos.flush();
	fis.close();
	fos.close();
	System.out.println("copied using byte streams...");
}
}
