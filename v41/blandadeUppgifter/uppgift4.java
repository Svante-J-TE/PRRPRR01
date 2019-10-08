package blandadeUppgifter;

import java.util.Scanner;

public class uppgift4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long number = 0;
		long sum = 1;
		
		for(int i = 1; i <= 10; i++) {
			number = input.nextInt();
			sum = number * sum;

			if(sum >= 100000) {
				break;
			}
			
		}
		
		System.out.println(sum);
	}

}
