package v40Homework;

import java.util.Scanner;

public class spavanacKattis {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int Timmar = input.nextInt();
		int Minuter = input.nextInt();
		
		Minuter -= 45; // Tar bort 45 fr�n variabeln

		if (Minuter < 0) // minuter blir mindre �n 0 efter detta g�r den denna if sats 
		    {
		    Timmar -= 1;
		    Minuter += 60;
		    }
		if (Timmar < 0) // om timmarna d� �r mindre �n 0 s� l�ggs det till 23 f�r att innan 12 p� natten kommer 11 (23)
		    Timmar = 23;
		
		System.out.println(Timmar +":"+ Minuter);
		
		
	}

}
