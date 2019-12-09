package genomgang;

import java.util.Scanner;

public class hittaFel2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int index;

		for (int i = 1; i < numbers.length; i++) {

			numbers[i] = i;
		}
		System.out.println("Write an index number: ");
		index = input.nextInt();

		try {

			System.out.println("The index you chose: " + numbers[index]); // detta är fel, därför kommer den köra catch satsen

		} catch (Exception e) {
			System.out.println("Array index out of bound");

		}
	}

}
