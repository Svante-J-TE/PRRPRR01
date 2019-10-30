package homework;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		System.out.println(kelvin() + " grader kelvin");
	}

	/**
	 * Omvandlar celsius till kelvin
	 * @return
	 */
	public static double kelvin() {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in grader i celsius så omvandlar jag dem till kelvin:");
		double c = input.nextDouble();
		double kelvin = c -= 273.15;
		input.close();
		return kelvin;
	}
}
