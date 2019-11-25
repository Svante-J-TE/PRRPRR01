package genomgang;

import java.util.Arrays;
import java.util.Scanner;

public class arrayer {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] siffror1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // skapar en array och
															// fyller den med 10 tal
		int[] siffror2 = new int[10]; // skapar en array med 10 tomma lådor

		int[] summa = new int[10];

		for (int i = 0; i < siffror1.length; i++) { // loopar genom siffror1[]
			System.out.print(siffror1[i]); // och skriver ut innehållet
		}

		System.out.println();
		System.out.println(Arrays.toString(siffror1)); // alternativt sätt att skriva ut en array

		for (int i : siffror1) { // ett annat sätt att använda for-loop för arrayer
			System.out.print(i);
		}

		for (int i = 0; i < siffror2.length; i++) { // fyller array2 med input från konsolen
			siffror2[i] = input.nextInt();
		}
		
		for (int i = 0; i < summa.length; i++) {
			summa[i] = siffror1[i] + siffror2[i];
			
		}
		
		for (int i : summa) {
			System.out.print(i + " ");
		}
	}

}
