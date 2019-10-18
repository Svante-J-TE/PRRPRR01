package blandadeUppgifter;

import java.util.Scanner;

public class uppgift6 {

	public static void main(String[] args) {
		Scanner variables = new Scanner(System.in);
		
		System.out.println("Skriv höjd: ");
		double height = variables.nextInt();
		System.out.println("Skriv radie: ");
		double radius = variables.nextInt();
		
		double radiusSum = radius*radius;
		double heightPi = height*Math.PI;
		
		System.out.println(radiusSum*heightPi);

	}

}
