package homework;

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		ageControl();

	}
	/**
	 * S�tter in dig i en �ldersgrupp och ber�ttar lite om den
	 */
	public static void ageControl() {
		Scanner input = new Scanner(System.in);
		System.out.println("Hur gammal �r du?");
		int age = input.nextInt();
		input.close();
		if(age < 0) {
			System.out.println("Sluta lek, unge");
		}
		else if(age <= 5) {
			System.out.println("Sm�barn f�r inte g�ra n�got");
		}
		else if(age <= 12) {
			System.out.println("Du f�r spela Fortnite");
		}
		else if(age <= 14) {
			System.out.println("Du �r ton�ring");
		}
		else if(age <= 17) {
			System.out.println("Du f�r k�ra moppe");
		}
		else if(age <= 20) {
			System.out.println("Du f�r k�ra bil");
		}
		else if(age <= 64) {
			System.out.println("Du f�r vuxenstraff om du g�r n�got dumt");
		}
		else if(age <= 99) {
			System.out.println("Du �r penion�r");
		}
		else {
			System.out.println("RIP!?");
		}
	}
}
