package v39lektioner;
import java.util.Scanner;

public class for_loop {
	public static void main(String[] args) {

		// Används när man vet exakt hur många gånger man vill repetera något
		
		// Skriver ut 0-4	 
		for (int i = 0; i < 5; i++) { // i är en temporär variabel som bara har ett värde i for loopen // int i = 0 betyder vad variablen har för värde // ; i<5 är villkoret (vad den ska göra) // ;i++ är vad som den ska göra (++ vilket är +1)
			System.out.println(i);			
		}
	
		// Skriver ut 5-1 // i-- betyder (-1)
		for (int i = 5 ; i > 0; i--) {
			System.out.println(i);
		}

		// Skriver ut alla jämna tal under 100 
		for (int i = 0; i < 100; i += 2) { //+= 2 betyder (i + 2 och gör i:s nya värde till 2)
			System.out.println(i);			
		}

		// Skriver ut alla udda tal under 100
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);			
		}

		// Skriver ut alla gånger-tabeller för talen 1-10
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
			
		}
		
	}
}