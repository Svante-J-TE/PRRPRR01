package v37;

import java.util.Scanner;

public class laxaV37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du? ");
		
		String name = input.nextLine();
		
		System.out.println("Hur gammal är du? ");
		
		String age = input.nextLine();
		
		System.out.println("Vad är din adress? ");
		
		String adress = input.nextLine();
		
		System.out.println("Vad är ditt postnummer? ");
		
		String postcode = input.nextLine();
		
		System.out.println("Vilken stad bor du i? ");
		
		String city = input.nextLine();
		
		System.out.println("Vad är ditt telefonnummer? ");
		
		String phonenumber = input.nextLine();
		
		System.out.println("\n" + "Infromation:" + "\n" + "Namn:" + "\t\t" + name + "\n" + "Ålder:" + "\t\t" + age + "\n" + "Adress:" + "\t\t" + adress + "\n" + 
		"Postnummer:" + "\t" + postcode + "\n" + "Stad:" + "\t\t" + city + "\n" + "Telefon:" + "\t" + phonenumber);
		
	}

}
