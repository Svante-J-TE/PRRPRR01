package homework;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		System.out.println("Det st�rsta talet �r: " + max());
	}
/**
 * Tar tv� heltal och skriver ut det st�rsta
 * @return
 */
	public static int max() {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in tv� heltal:");
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		if (a < b) {
			return b;
		} 
		else {
			return a;
		}
	}
}
