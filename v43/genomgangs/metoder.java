package genomgangs;

import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("V�nligen skriv in tv� tal: ");
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();

		minstaTal(tal1, tal2);
		input.close();

	}
	/**
	 * J�mf�r tv� heltal och utv�rderar vilket som �r minst. Skickar tillbaka svaret 
	 * @param nummer1
	 * @param nummer2
	 */

	public static void minstaTal(int nummer1, int nummer2) {

		if (nummer1 >= nummer2) {
			System.out.println("Minsta talet: " + nummer2);
		} 
		else {
			System.out.println("Minsta talet: " + nummer1);
		}
	}
}