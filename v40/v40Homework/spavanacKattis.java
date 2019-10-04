package v40Homework;

import java.util.Scanner;

public class spavanacKattis {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int Timmar = input.nextInt();
		int Minuter = input.nextInt();
		
		Minuter -= 45; // Tar bort 45 från variabeln

		if (Minuter < 0) // minuter blir mindre än 0 efter detta gör den denna if sats 
		    {
		    Timmar -= 1;
		    Minuter += 60;
		    }
		if (Timmar < 0) // om timmarna då är mindre än 0 så läggs det till 23 för att innan 12 på natten kommer 11 (23)
		    Timmar = 23;
		
		System.out.println(Timmar +":"+ Minuter);
		
		
	}

}
