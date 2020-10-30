package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
public static void main(String[] args) throws Exception {
	int no=-1;
	boolean isOdd=false;
	do {
		System.out.println("Please enter a number or enter -1 if you want to exit");
		Scanner sc= new Scanner(System.in);
		try {
		no=sc.nextInt();
		if(no>100) {
			try {
			throw new Exception();
			}
			catch(Exception e){
	
				System.out.println("Number cant be greater than 100");
			}
		}
		}catch(InputMismatchException ex){
			System.out.println("you must enter an integer");
			
		}
		if(no<=100) {
		isOdd=checkNo(no);
		if(isOdd) {
			System.out.println("you have entered an odd number");
		}
		else {
			System.out.println("you have entered even number");
		}
		}
	}while(no !=-1);
}

private static boolean checkNo(int no) {
	
	return no%2 !=0;
}

}