package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q4 {
public static void main(String[] args) throws Exception {
	int no=-1;
	boolean isOdd=false;
	do {
		System.out.println("Please enter a number or enter -1 if you want to exit");
		Scanner sc= new Scanner(System.in);
		try {
		no=sc.nextInt();
		
		}catch(InputMismatchException ex){
			System.out.println("you must enter an integer");
		}
		isOdd=checkNo(no);
		if(isOdd) {
			System.out.println("you have entered an odd nukber");
		}
		else {
			System.out.println("you have entered even number");
		}
	}while(no !=-1);
}

private static boolean checkNo(int no) {
	
	return no%2 !=0;
}

}
