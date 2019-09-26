package v39lektioner;
import java.util.Scanner;

//Jämför efter en iteration
public class do_while_loop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Används när man inte vet hur många gånger man vill repetera något
		// men vet att det åtminstone är en gång.
		
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