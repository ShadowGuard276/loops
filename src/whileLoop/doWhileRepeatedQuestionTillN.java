package whileLoop;

import java.util.Scanner;

public class doWhileRepeatedQuestionTillN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number=0  ;
		
		do {
		 if(number >0) {
			 System.out.println(number*number*number);
		 }
		 System.out.print("Enter the Number:");
		number = scanner.nextInt();
		
	}while(number>=0);
System.out.println("thankyou have fun");
}}


