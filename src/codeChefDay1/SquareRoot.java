package codeChefDay1;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (!(number > 0)) {
			System.out.println("Enter Valid Input");
		} 
		for (int i = 1; i <= number; i++) {
			int num = input.nextInt();
			System.out.println((int)Math.sqrt(num));
		}
		input.close();
	}

}
