package Kattis;

import java.util.Scanner;

public class oddities {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int antal = input.nextInt();
		int tal = input.nextInt();
		
		
		for(int i = 1; i<= antal; i++) {
			
		
		if (tal % 2 == 0) {
			System.out.println(tal + " is even");
		}
		else if(tal % 2 != 0) {
			System.out.println(tal + " is odd");
		}
		
		
		
		
		
		}
		
		

	}

}
