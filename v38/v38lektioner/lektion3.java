package v38lektioner;

import java.util.Scanner;

public class lektion3 {

	public static void main(String[] args) {

		// Villkor

		boolean again = true; // variabel med tv� olika svar, true/false
		int age = 0; // Initierat variabel

		Scanner input = new Scanner(System.in); // G�r det m�jligt att f� input fr�n konsolen

		System.out.println("�r du gammal nog att k�ra ett fordon? (Quiz) \n");

		System.out.println("Hur gammal �r du? ");
		age = input.nextInt();

		if (age >= 18) { // (villkor) dvs man j�mf�r i detta fal tv� heltal

			System.out.println("Du �r gammal nog att k�ra bil! Grattis!");
			System.out.println("Du f�r �ven k�ra moped!");

		}

		else if (age >= 15 && age < 18) { // K�rs om du inte �r �ver 18 men �nd� �r 15+

			System.out.println("Du f�r inte k�ra bil �n. Men du f�r k�ra moped!");
		}

		else { // om villkoret inte uppfylls k�rs else

			System.out.println("Du �r f�r ung f�r att f� k�ra. Segt.");
		}

	}
}

/*
 * && betyder "och" || betyder "eller" = betyder "likamed" != betyder
 * "ej likamed"
 */