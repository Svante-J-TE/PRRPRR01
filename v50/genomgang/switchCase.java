package genomgang;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int choice;

		System.out.println("Välkommen, välj något av dessa alternativ:");
		System.out.println("(1) - New Game");
		System.out.println("(2) - Load Game");
		System.out.println("(3) - Options");
		System.out.println("(4) - Credits");
		System.out.println("(5) - Quit");

		choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Startar nytt spel...");
			break;

		case 2:
			System.out.println("Laddar sparat spel...");
			break;

		case 3:
			System.out.println("Ljud, Kontroller, Video");
			break;

		case 4:
			System.out.println("Game designer - Svante Jonsson");
			break;

		case 5:
			System.out.println("Spelet avslutas...");
			break;

		default:
			System.out.println("Felaktig input, välj ett nytt alternativ:");
			break;
		}
	}

}
