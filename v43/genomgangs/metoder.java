package genomgangs;

import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {
		twoNumbers();
	}
	
	/**
	 * Skirver två heltal och skickar de vidare
	 */
	public static void twoNumbers() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vänligen skriv in två tal: ");
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();

		minstaTal(tal1, tal2);
		input.close();
	}
	
	/**
	 * Jämför två heltal och utvärderar vilket som är minst. Skickar tillbaka svaret 
	 * @param nummer1
	 * @param nummer2
	 */
	public static void minstaTal(int nummer1, int nummer2) {
			
		if (nummer1 > nummer2) {
			System.out.println("Minsta talet: " + nummer2);
		} 
		else if(nummer1 == nummer2) {
			System.out.println("Talen har samma värde! Vilket är: " + nummer1);
		}
		else {
			System.out.println("Minsta talet: " + nummer1);
		}
	}
}