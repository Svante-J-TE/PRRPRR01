package blandadeUppgifter;

import java.util.Scanner;

public class uppgift1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		
		if(tal1 > tal2) {
			System.out.println(tal1 + " �r st�rst");
		}
		else {
			System.out.println(tal2 + " �r st�rst");
		}

		input.close();
	}

}
