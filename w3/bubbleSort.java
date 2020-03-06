import java.util.Arrays;
import java.util.Scanner;



public class bubbleSort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Choose amount of numbers: ");
		int length = input.nextInt(); 
		int[] numbers = new int[length];
		
		System.out.println("Choose your interval, x < your numbers > y");
		int intervalLeast = input.nextInt();
		int intervalMost = input.nextInt();
		
		System.out.println("How many interations before finnish: ");
		int iterations = input.nextInt();
		
		boolean fin;
		int temp;

		for (int i = intervalLeast; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*intervalMost+1);	// Randomizes 37 integers between 0-1000
		}
		System.out.println(Arrays.toString(numbers));

		
		do {

			fin = false; // Resets boolean at start of comparison, if needed
			for (int i = 0; i < numbers.length - 1; i++) {

				if (numbers[i] > numbers[i + 1]) { // Replaces two adjacent numbers
					temp = numbers[i]; // Temporarily saves the integer on the left
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					fin = true;
				}
			}
			
		} while (fin);

		System.out.println(Arrays.toString(numbers));

	}

}
