package v39lektioner;
import java.util.Scanner;

public class for_loop {
	public static void main(String[] args) {

		// Anv�nds n�r man vet exakt hur m�nga g�nger man vill repetera n�got
		
		// Skriver ut 0-4	 
		for (int i = 0; i < 5; i++) { // i �r en tempor�r variabel som bara har ett v�rde i for loopen // int i = 0 betyder vad variablen har f�r v�rde // ; i<5 �r villkoret (vad den ska g�ra) // ;i++ �r vad som den ska g�ra (++ vilket �r +1)
			System.out.println(i);			
		}
	
		// Skriver ut 5-1 // i-- betyder (-1)
		for (int i = 5 ; i > 0; i--) {
			System.out.println(i);
		}

		// Skriver ut alla j�mna tal under 100 
		for (int i = 0; i < 100; i += 2) { //+= 2 betyder (i + 2 och g�r i:s nya v�rde till 2)
			System.out.println(i);			
		}

		// Skriver ut alla udda tal under 100
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);			
		}

		// Skriver ut alla g�nger-tabeller f�r talen 1-10
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
			
		}
		
	}
}