package homework;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		count();
	}
	
	/**
	 * R�knar fr�n 1-n
	 */
	public static void count() {
		Scanner input = new Scanner(System.in);
		System.out.println("Till vad vill du r�kna till?");
		int n = input.nextInt();
		input.close();
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
