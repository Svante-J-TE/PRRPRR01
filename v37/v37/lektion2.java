package v37;

import java.util.Scanner;

public class lektion2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String namn1 = "Wayne Beats";
		String namn2 = "Pidilil Padildo";
		String namn3 = "Maxzy GG";
		String namn4 = "Ozaste";
		
		System.out.println("Skriv ett namn: ");
		
		String namn5 = input.nextLine(); // Läser in ett namn från konsolen
		
		System.out.println("Skriv ett namn: ");
		String namn6 = input.nextLine(); // Läser in ett namn från konsolen
		
		
		System.out.println("\tNAMN:");	// \t flyttar fram texten 8 tecken = en tab, \n är ett tecken = mellanslag
		
		System.out.println(namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4 + "\n" + namn5 + "\n" + namn6);

	}

}
