package genomgang;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {

		mainMenu();
	}

	/**
	 * The main menu of the homework. You can from here navigate to sub menus and
	 * also terminates the program by selecting "Quit"
	 */
	public static void mainMenu() {

		Scanner input = new Scanner(System.in);

		System.out.println("The top 5 NBA rosters for 2019-2020 season:");
		System.out.println("(1) - Millwaukee Bucks");
		System.out.println("(2) - Los Angeles Lakers");
		System.out.println("(3) - Boston Celtics");
		System.out.println("(4) - Los Angeles Clippers");
		System.out.println("(5) - Dallas Mavericks");
		System.out.println("(6) - Quit");

		String team = "";
		boolean failSafe = false;

		while (!failSafe) {
			try {

				int choice = input.nextInt();

				switch (choice) {
				case 1:
					team = "Milwaukee Bucks";
					teamRoster(team);
					break;

				case 2:
					team = "Los Angeles Lakers";
					teamRoster(team);
					break;

				case 3:
					team = "Boston Celtics";
					teamRoster(team);
					break;

				case 4:
					team = "Los Angeles Clippers";
					teamRoster(team);
					break;

				case 5:
					team = "Dallas Mavericks";
					teamRoster(team);
					break;

				case 6:
					System.out.println("Closing application....");
					Thread.currentThread().stop();
					break;

				}

				if (choice < 7 && choice > 0) {
					failSafe = true;
				} else {
					System.out.println("Invalid input, type an integer between \"1\" and \"6\"");
				}

			}

			catch (Exception e) {
				input.next();
				System.out.println("Invalid input, type an integer between \"1\" and \"6\"");
			}
		}
	}

	/**
	 * A sub menu of mainMenu() where you can select a specific position and find
	 * out the starting and backup player for that position. This method is reliant
	 * of mainMenu() because of the variable team. Leads also to a sub menu which
	 *  is called goBackInMenu()
	 * 
	 * @param team - The name of the selected team
	 */
	public static void teamRoster(String team) {

		Scanner input = new Scanner(System.in);

		System.out.println("View the " + team + " roster by each position:");
		System.out.println("(1) - Point Guard");
		System.out.println("(2) - Shooting Guard");
		System.out.println("(3) - Small Forward");
		System.out.println("(4) - Power Forward");
		System.out.println("(5) - Center");
		System.out.println("(6) - Go back to main menu");

		String sPG = "";
		String bPG = "";
		String sSG = "";
		String bSG = "";
		String sSF = "";
		String bSF = "";
		String sPF = "";
		String bPF = "";
		String sC = "";
		String bC = "";

		if (team == "Milwaukee Bucks") {
			sPG = "Eric Bledsoe";
			bPG = "George Hill";
			sSG = "Pat Connaughton";
			bSG = "Donte DiVincenzo";
			sSF = "Kris Middleton";
			bSF = "Wesley Matthews";
			sPF = "Giannis Antetokounmpo";
			bPF = "Ersan Ilyasova";
			sC = "Brook Lopez";
			bC = "Robin Lopez";

		} else if (team == "Los Angeles Lakers") {
			sPG = "Rajon Rondo";
			bPG = "Avery Bradley";
			sSG = "Danny Green";
			bSG = "Kentavious Caldwell-Pope";
			sSF = "Lebron James";
			bSF = "Jared Dudley";
			sPF = "Anthony Davis";
			bPF = "DeMarcus Cousins";
			sC = "Dwight Howard";
			bC = "Javale McGee";
			
		} else if (team == "Boston Celtics") {
			sPG = "Kemba Walker";
			bPG = "Marcus Smart";
			sSG = "Jayson Tatum";
			bSG = "Romeo Langford";
			sSF = "Jaylen Brown";
			bSF = "Gordon Hayward";
			sPF = "Semi Ojeleye";
			bPF = "Grant Williams";
			sC = "Daniel Thies";
			bC = "Enes Kanter";
			
		} else if (team == "Los Angeles Clippers") {
			sPG = "Patrick Beverly";
			bPG = "Lou Williams";
			sSG = "Paul George";
			bSG = "Jerome Robinson";
			sSF = "Kawhi Leonard";
			bSF = "Rodney McGruder";
			sPF = "Maurice Harkless";
			bPF = "JaMychal Green";
			sC = "Ivica Zubac";
			bC = "Montrezl Harrell";
			
		} else if (team == "Dallas Mavericks") {
			sPG = "Luka Doncic";
			bPG = "Delon Wright";
			sSG = "Tim Hardaway Jr.";
			bSG = "Seth Curry";
			sSF = "Dorian Finney-Smith";
			bSF = "Courtney Lee";
			sPF = "Kristaps Porzingis";
			bPF = "Justin Jackson";
			sC = "Dwight Powell";
			bC = "Boban Marjanovic";
		}

		boolean failSafe = false;

		while (!failSafe) {

			try {

				int choice = input.nextInt();
				switch (choice) {
				case 1:
					System.out.println("The starting PG for the " + team + ": " + sPG + "\nThe backup PG for the "
							+ team + ": " + bPG);
					goBackInMenu(team);
					break;

				case 2:
					System.out.println("The starting SG for the " + team + ": " + sSG + "\nThe backup SG for the "
							+ team + ": " + bSG);
					goBackInMenu(team);
					break;

				case 3:
					System.out.println("The starting SF for the " + team + ": " + sSF + "\nThe backup SF for the "
							+ team + ": " + bSF);
					goBackInMenu(team);
					break;

				case 4:
					System.out.println("The starting PF for the " + team + ": " + sPF + "\nThe backup PF for the "
							+ team + ": " + bPF);
					goBackInMenu(team);
					break;

				case 5:
					System.out.println(
							"The starting C for the " + team + ": " + sC + "\nThe backup C for the " + team + ": " + bC);
					goBackInMenu(team);
					break;

				case 6:
					mainMenu();
					break;

				}

				if (choice < 7 && choice > 0) {
					failSafe = true;
				} else {
					System.out.println("Invalid input, type an integer between \"1\" and \"6\"");
				}

			}

			catch (Exception e) {
				System.out.println("Invalid input, type an integer between \"1\" and \"6\"");
				input.next();
			}
		}

	}

	/**
	 * A method which gives the user the ability to go back to mainMenu(),
	 * teamRoster() or terminate the program
	 * @param team - The name of the selected team
	 */
	public static void goBackInMenu(String team) {

		Scanner input = new Scanner(System.in);

		System.out.println("\n(1) - Go back to position select");
		System.out.println("(2) - Go back to main menu");
		System.out.println("(3) - Close Application");

		boolean failSafe = false;

		while (!failSafe) {

			try {

				int choice = input.nextInt();

				switch (choice) {
				case 1:
					teamRoster(team);
					break;

				case 2:
					mainMenu();
					break;

				case 3:
					System.out.println("Closing application....");
					Thread.currentThread().stop();
					break;
				}

				if (choice < 4 && choice > 0) {
					failSafe = true;
				} else {
					System.out.println("Invalid input, type an integer between \"1\" and \"3\"");
				}

			}

			catch (Exception e) {
				System.out.println("Invalid input, type an integer between \"1\" and \"3\"");
				input.next();
			}
		}
	}

}
