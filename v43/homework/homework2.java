package homework;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		System.out.println("Det största talet är: " + min());
	}
/**
 * Tar två heltal och skriver ut det största
 * @return
 */
	public static int min() {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in två heltal:");
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
