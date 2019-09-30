package v40Lektioner;

public class modulus {

	public static void main(String[] args) {
		
		// % == modulus
		
		int tal1 = 47;
		int sum = 0;
		
		System.out.println(tal1 % 3); 	// Testar om tal1 är delbart med 3
										// är den det så blir svaret 0, om inte
										// så anges rest.

		for (int i = 0; i <= 100; i++) {
			
			if (i % 3 ==0) {
				System.out.println("Talet " + i + " är delbart med 3");
				sum += i;
			}
		}
		
		System.out.println("\nSumman av alla dessa talen är: " + sum);
		
		int turn = 0; 
		
		while (true) {	// Skriver ut vems tur det är tills dess man gjort det hundra gånger
			
			turn++;
			
			if(turn % 3 == 0) {
				
				System.out.println("Det är Davids tur");
			}
			
			else if(turn % 3 == 1) {
				
				System.out.println("Det är Johans tur");
			}
			
			else if(turn % 3== 2) {
				System.out.println("Det är Lucas tur");
			}
			
			if(turn == 100) {
				break;
			}
		} 
		
	}

}
