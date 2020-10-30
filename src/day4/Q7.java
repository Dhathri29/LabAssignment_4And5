package day4;

import java.io.IOException;

class ExceptionEg {
	
	public void throwException() throws InputException, IOException {
		
	}

}
public class Q7 {
public static void main(String[] args) {
	ExceptionEg exceptionExample = new ExceptionEg();
	try {
		exceptionExample.throwException();
	} catch (InputException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}