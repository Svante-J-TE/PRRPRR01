package genomgang;

import java.util.Scanner;

import homework.homework1;

public class mathString {

	public static void main(String[] args) {
		
		double svar = Math.sqrt((Math.pow(3, 2))+4);	//Math.squrt = Roten ur   /    Math.pow = upphöjt med	
		System.out.println(svar);
		
		
		double pi = Math.PI;	// Math.PI = pi
		System.out.println(pi);
		
		
		System.out.println(Math.max(3, 7));			// Skriver ut det största av två tal, ex 3 och 7
		
		
		String mening = "Lorem ipsum dolor.";
		System.out.println(mening);
		
		Scanner input = new Scanner(System.in);
		String mening2 = input.nextLine();
		
		if (mening.equals(mening2)) {				// Jämnför meningarna
			System.out.println("Samma mening");
		}
		else {
			System.out.println("Inte samma mening");
		}
		
		
		System.out.println(mening.length());			//Räknar antalet tecken i Stringen
		System.out.println(mening.toUpperCase());		//Gör om alla tecken till uppercase
		System.out.println(mening.toLowerCase());		// Gör om alla tecken till lowercase
		
		System.out.println("LoReM IpSuM DoLoR.".toLowerCase());	// Gör om alla tecken till lowercase
		System.out.println(mening2.contains("Bruh"));			// Kollar om mening2 innehåller ordet "Bruh", om ja skriver ut true
		System.out.println("  lorem ipsum dolor  ".trim());	 	// Tar bort blankstegen i början och i slutet
		
		System.out.println("  lorem ipsum dolor  ".trim().toLowerCase());	//Går ifrån höger, alltså gör först allt till lowercase och sedan tar bort blankstegen i början och i slutet
		System.out.println("lorem ipsum dolor.".replace('o', 'Q'));			//Gör om 'o' till 'Q'
		
		
		int a = 7;
		int b = 3;
		
		double c = (double)a / (double)b;	//Gör tillfälligt om a och b till doubles
		System.out.println(c);
		homework1.lol();	//Gör såhär för att kalla på dina metoder från andra filer, filen heter homework1 och metoden heter lol();
		
	}

}
