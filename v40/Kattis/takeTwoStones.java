package Kattis;

import java.util.Scanner;

public class takeTwoStones {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
	
			if(N % 2 != 0) {
				System.out.println("Alice");
			}
			
			else if(N % 2 == 0) {
				System.out.println("Bob");
			}
			
			input.close();
	}

}
