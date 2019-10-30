package homework;

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		ageControl();

	}
	/**
	 * Sätter in dig i en åldersgrupp och berättar lite om den
	 */
	public static void ageControl() {
		Scanner input = new Scanner(System.in);
		System.out.println("Hur gammal är du?");
		int age = input.nextInt();
		input.close();
		if(age < 0) {
			System.out.println("Sluta lek, unge");
		}
		else if(age <= 5) {
			System.out.println("Småbarn får inte göra något");
		}
		else if(age <= 12) {
			System.out.println("Du får spela Fortnite");
		}
		else if(age <= 14) {
			System.out.println("Du är tonåring");
		}
		else if(age <= 17) {
			System.out.println("Du får köra moppe");
		}
		else if(age <= 20) {
			System.out.println("Du får köra bil");
		}
		else if(age <= 64) {
			System.out.println("Du får vuxenstraff om du gör något dumt");
		}
		else if(age <= 99) {
			System.out.println("Du är penionär");
		}
		else {
			System.out.println("RIP!?");
		}
	}
}
