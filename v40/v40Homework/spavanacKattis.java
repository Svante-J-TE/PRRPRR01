package v40Homework;

import java.util.Scanner;

public class spavanacKattis {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int Hours = input.nextInt();
		int minutes = input.nextInt();
		
		minutes -= 45;

		if (minutes < 0)
		    {
		    Hours -= 1;
		    minutes += 60;
		    }
		if (Hours < 0)
		    Hours = 23;
		
		System.out.println(Hours +" "+ minutes);
		
		
	}

}
