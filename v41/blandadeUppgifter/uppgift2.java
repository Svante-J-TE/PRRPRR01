package blandadeUppgifter;

import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ett heltal: ");
		
		int number = input.nextInt();
		int sum = 0;
		int digit;
		
		while(number != 0) {
			
			digit = number % 10;
			sum += digit;
			number /= 10;
			
			
		}
		System.out.println(sum);
		
		
		
		

	}

}
