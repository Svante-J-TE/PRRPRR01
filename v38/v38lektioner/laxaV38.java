package v38lektioner;

import java.util.Scanner;

public class laxaV38 {

	public static void main(String[] args) {

		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;
		
		

		Scanner input = new Scanner(System.in); // G�r det m�jligt att ge variablerna ett v�rde via konsolen

		System.out.println("Skriv fem stycken heltal: ");

		number1 = input.nextInt();

		number2 = input.nextInt();

		number3 = input.nextInt();

		number4 = input.nextInt();

		number5 = input.nextInt(); // Variablerna har nu f�tt varsit v�rde
		
		
		
		if(number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5){
			
			System.out.println("Det h�gsta talet �r: " + number1); // Denna if sats j�mnf�r alla variabler och visar endast number1 om den har det h�gsta v�rdet
		}
		
		else if(number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
			
			System.out.println("Det h�gsta talet �r: " + number2);
		}
		
		else if(number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
			
			System.out.println("Det h�gsta talet �r: " + number3);
			
		}
			
		else if(number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5) {
				
				System.out.println("Det h�gsta talet �r: " + number4);
				
		}
		
		else if(number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4) {
			
			System.out.println("Det h�gsta talet �r: " + number5);
			
		}
		
		
		if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5) {
			
			System.out.println("Det l�gsta talet �r: " + number1); // Denna if sats j�mnf�r alla variabler och visar endast number1 om den har det l�gsta v�rdet
		}
		
		else if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5) {
			
			System.out.println("Det l�gsta talet �r: " + number2);
		}
		
		else if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5) {
			
			System.out.println("Det l�gsta talet �r: " + number3);
		}
		
		else if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5) {
			
			System.out.println("Det l�gsta talet �r: " + number4);
		}
		
		else if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4) {
			
			System.out.println("Det l�gsta talet �r: " + number5);
		}
		
		int sum = number1 + number2 + number3 + number4 + number5;
		int average = sum / 5; // Delar summan med 5 vilket ger medelv�rdet p� v�ra tal 
		
		 System.out.println("Medelv�rdet av dina tal �r: " + average); 
		
		}
	}
		


