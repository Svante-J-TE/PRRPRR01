package genomgang;

import java.util.Scanner;

public class hittaFel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		boolean success = false;

		System.out.println("Write an integer: ");

		while (!success) {

			try {
				number = input.nextInt();
				System.out.println("The number is: " + number);
				success = true;

			} catch (Exception e) {
				input.next();
				System.out.println("You typed in wrong input");
				System.out.println("\nWrite an integer: ");
			}
		}

	}

}
