package homework;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		fahrenheitToCelsius();

	}
	/**
	 * Omvandlar fahrenheit till celsius
	 */
	public static void fahrenheitToCelsius() {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in grader i fahrenheit så omvandlar jag dem till celcius:");
		double f = input.nextDouble();
		double c = ((f-32) * 5/9);
		System.out.println(c + " grader celsius");
		input.close();
	}
}
