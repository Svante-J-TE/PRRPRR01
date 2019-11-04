package homework;

import java.util.Scanner;

public class homework7 {

	public static void main(String[] args) {
		stair();

	}
	/**
	 * Skapar en trappa beroende på värde inmatat
	 */
	public static void stair() {
		Scanner input = new Scanner(System.in);
		System.out.println("Hur många steg ska trappan ha?");
		int x = input.nextInt();
		input.close();
		
		String printOut ="";
		
		for (int i = 0; i <= x; i++) {
			for (int j = 1; j <= x-i; j++) {
				printOut += " ";
			}
			for (int k = 1; k <= i; k++) {
				printOut += "x";
			}
			System.out.println(printOut);
			printOut = "";
		}
	}
}
