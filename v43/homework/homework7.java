package homework;

import java.util.Scanner;

public class homework7 {

	public static void main(String[] args) {
		stair();

	}
	/**
	 * Skapar en trappa beroende p� v�rde inmatat
	 */
	public static void stair() {
		Scanner input = new Scanner(System.in);
		System.out.println("Hur m�nga steg ska trappan ha?");
		int x = input.nextInt();
		input.close();
		for (int i = 0; i <= x; i++) {
			for (int u = 1; u <= i; u++) {
				System.out.print("x");
			}
			System.out.print("\n");
		}
	}
}
