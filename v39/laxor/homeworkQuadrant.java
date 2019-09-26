package laxor;

import java.util.Scanner;

public class homeworkQuadrant {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int nummer1 = input.nextInt();
		int nummer2 = input.nextInt();
		
		if(nummer1 > 0 && nummer2 > 0) {
			System.out.println(1);
		}
		
		else if(nummer1 < 0 && nummer2 > 0) {
			System.out.println(2);
		}
		
		else if(nummer1 < 0 && nummer2 < 0) {
			System.out.println(3);
		}
		
		else if(nummer1 > 0 && nummer2 < 0) {
			System.out.println(4);
		}
	}

}
