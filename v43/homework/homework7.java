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
		
		String out ="";
		
		for (int i = 0; i <= x; i++) {
			for (int o = 1; o <= x-i; o++) {
				out += " ";
			}
			for (int u = 1; u <= i; u++) {
				out += "x";
			}
			System.out.println(out);
			out = "";
		}
	}
}
