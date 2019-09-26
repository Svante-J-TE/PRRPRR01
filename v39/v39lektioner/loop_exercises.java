package v39lektioner;

import java.util.Scanner;

public class loop_exercises {

	public static void main(String[] args) {
		
		int sum = 0;
		int times = 0;
		int randomnumber = 0;
		int sum2 = 0;
		
		for (int i = 0; i < 100; i ++) { 
			sum = sum + i;
			
		}
		System.out.println("Den totala summan av alla positiva heltal under 100 är: \n" + sum);

	
		System.out.println("\nAlla heltal mellan 25-50:");
		for (int i = 25; i <= 50; i ++) {
		System.out.println(i);
		
	}
		
		System.out.println("\nAlla positiva heltal under 20:");
		for (int i = 20; i >= 0; i --) {
			System.out.println(i);
		}
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vilket tals multiplikations tabell vill du veta?");
		times = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
				
				System.out.println(i * times);
				
		}
		
		System.out.println("Skriv tal du vill ska adderas: ");
		randomnumber = input.nextInt();
		
		boolean exit = false;
		do {
			int correct = input.nextInt();
			if (correct == 0) {
				exit = true;
				sum2 += sum2 + sum2;
			
			}
		}
		while (!exit); 
		System.out.println(question);
	
	
	}
}
