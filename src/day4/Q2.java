package day4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2 {
public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("demoChar.txt");
	FileWriter fw = new FileWriter("demoCharcopy.txt");

	int i = 0;
	while ((i = fr.read()) != -1) {
		fw.write(i);
	}
	
	fw.flush();
	fr.close();
	fw.close();
	System.out.println("copied...");
}
}
