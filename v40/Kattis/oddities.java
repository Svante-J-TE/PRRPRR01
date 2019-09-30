package Kattis;

import java.util.Scanner;

public class oddities {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv fyra tal så berättar jag om dem är jämna eller udda");
		
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		int tal3 = input.nextInt();
		int tal4 = input.nextInt();
		
		if (tal1 % 2 == 0) {
			System.out.println(tal1 + " is even");
		}
		else {
			System.out.println(tal1 + " is odd");
		}
		
		if (tal2 % 2 == 0) {
			System.out.println(tal2 + " is even");
		}
		else {
			System.out.println(tal2 + " is odd");
		}
		
		if (tal3 % 2 == 0) {
			System.out.println(tal3 + " is even");
		}
		else {
			System.out.println(tal3 + " is odd");
		}
		
		if (tal4 % 2 == 0) {
			System.out.println(tal4 + " is even");
		}
		else {
			System.out.println(tal4 + " is odd");
		}
		
		
		
		

	}

}
