package v40Lektioner;

public class modulus {

	public static void main(String[] args) {
		
		// % == modulus
		
		int tal1 = 47;
		int sum = 0;
		
		System.out.println(tal1 % 3); 	// Testar om tal1 �r delbart med 3
										// �r den det s� blir svaret 0, om inte
										// s� anges rest.

		for (int i = 0; i <= 100; i++) {
			
			if (i % 3 ==0) {
				System.out.println("Talet " + i + " �r delbart med 3");
				sum += i;
			}
		}
		
		System.out.println("\nSumman av alla dessa talen �r: " + sum);
		
		int turn = 0; 
		
		while (true) {	// Skriver ut vems tur det �r tills dess man gjort det hundra g�nger
			
			turn++;
			
			if(turn % 3 == 0) {
				
				System.out.println("Det �r Davids tur");
			}
			
			else if(turn % 3 == 1) {
				
				System.out.println("Det �r Johans tur");
			}
			
			else if(turn % 3== 2) {
				System.out.println("Det �r Lucas tur");
			}
			
			if(turn == 100) {
				break;
			}
		} 
		
	}

}
