package fiveClassLoop;

import java.util.Scanner;

public class fiveClassDisplayLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		do {
			System.out.print("Enter Number 1: ");
			int number1 = scanner.nextInt();
			System.out.print("Enter Number 2: ");
			int number2 = scanner.nextInt();

			System.out.println("press 1 for addition");
			System.out.println("press 2 for subtraction");
			System.out.println("press 3 for multiplication");
			System.out.println("press 4 for division");
			System.out.println("press 5 for exit");
			System.out.print("press the input: ");
			input = scanner.nextInt();
			if (input == 1) {
				System.out.println("the total: " + (number1 + number2));
			
			}
			if (input == 2) {
				System.out.println("the total: " + (number1 - number2));
			
			}
			if (input == 3) {
				System.out.println("the total: " + (number1 * number2));
				
			}
			if (input == 4) {
				System.out.println("the total: " + (number1 / number2));
				
			}
			else {
				if(input==5) {
				System.out.println("exit");
				
				}
		} 

		
	}while (input < 5);
		System.out.println("thank you ");

}
}