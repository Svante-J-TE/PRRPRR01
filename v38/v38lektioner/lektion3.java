package v38lektioner;

import java.util.Scanner;

public class lektion3 {

	public static void main(String[] args) {

		// Villkor

		boolean again = true; // variabel med två olika svar, true/false
		int age = 0; // Initierat variabel

		Scanner input = new Scanner(System.in); // Gör det möjligt att få input från konsolen

		System.out.println("Är du gammal nog att köra ett fordon? (Quiz) \n");

		System.out.println("Hur gammal är du? ");
		age = input.nextInt();

		if (age >= 18) { // (villkor) dvs man jämför i detta fal två heltal

			System.out.println("Du är gammal nog att köra bil! Grattis!");
			System.out.println("Du får även köra moped!");

		}

		else if (age >= 15 && age < 18) { // Körs om du inte är över 18 men ändå är 15+

			System.out.println("Du får inte köra bil än. Men du får köra moped!");
		}

		else { // om villkoret inte uppfylls körs else

			System.out.println("Du är för ung för att få köra. Segt.");
		}

	}
}

/*
 * && betyder "och" || betyder "eller" = betyder "likamed" != betyder
 * "ej likamed"
 */