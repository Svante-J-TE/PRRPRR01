package v39lektioner;
import java.util.Scanner;

//J�mf�r efter en iteration
public class do_while_loop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Anv�nds n�r man inte vet hur m�nga g�nger man vill repetera n�got
		// men vet att det �tminstone �r en g�ng.
		
		boolean exit = false;
		do {
			String line = input.nextLine();
			if (line.equals("exit")) {
				exit = true;
			}
		}
		while (!exit); 

	}

}