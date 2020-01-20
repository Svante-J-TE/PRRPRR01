import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		int[] numbers = new int[37];
		boolean fin;
		int temp;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*1000);	// Randomizes 37 integers between 0-1000
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
