import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class talspelet {

	static Scanner _input = new Scanner(System.in);		// Universal Scanner used for all user inputs
	static ArrayList<Integer> _alternatives = new ArrayList<>();	//arrayList used to store alternatives for the right answer
	static int _arrayListSize;	// integer used to figure out the size of the intervall during the setup of the game
	static int _rightAnswer;	// integer used to store the right answer
	static int _guessAmount;	// integer used to store maximum amount of guesses based on difficulty

	public static void main(String[] args) {
		System.out.println("Welcome to \"The Numbers Game\" \n");
		startMenu();	
	}

	/**
	 * The start and main menu of the game, is used to navigate between other menus, needs the global variable _input to be functional
	 */
	private static void startMenu() {
		System.out.println("Please choose an option below by typing in the corresponding integer");
		System.out.println("(1) - Game Setup \n(2) - Game Instructions \n(3) - Credits \n(4) - Exit Game");

		boolean failsafe = false;

		while(!failsafe) {
			try {

				switch (_input.nextInt()) {
				case 1: 
					gameSetup();
					break;

				case 2: 
					gameInstructions();
					break;

				case 3:
					credits();
					break;

				case 4:
					exitGame();

				default: 
					System.out.println("Please choose an integer between \"1\" and \"4\"");
					break;
				}

			}
			catch (Exception E) {
				_input.next();
				System.out.println("Invalid input, Please choose an integer between \"1\" and \"4\"");
			}
		}


	}

	/**
	 * A sub menu used to either begin the game or to navigate to other menus, needs the global variable _input to be functional
	 */
	private static void gameSetup() {
		System.out.println("(1) - Choose intervall \n(2) - Game Instructions \n(3) - Main Menu");

		boolean failsafe = false;
		while(!failsafe) {

			try {

				switch (_input.nextInt()) {
				case 1: 
					intervallSelection();
					difficultySelection();
					guessGame();
					break;

				case 2: 
					gameInstructions();
					break;

				case 3:
					startMenu();
					break;

				default: 
					System.out.println("Please choose an integer between \"1\" and \"3\"");
					break;
				}

			}
			catch(Exception E) {
				_input.next();
				System.out.println("Invalid input, Please choose an integer between \"1\" and \"3\"");
			}
		}

	}

	/**
	 * A sub menu used to learn the basics about the game, need _input to be functional
	 */
	private static void gameInstructions(){
		System.out.println("Game Instructions: \nThis game is a number guessing game, you begin by choosing the size of your intervall (ex. 5-437).\n"
				+ "Then you choose your difficulty which give you different amount of guesses based on how big your intervall is and how challenging you want it to be.\n"
				+ "The difficulties \"Unlimited\" and \"Extreme\" are exceptions since one gives you unlimited amount of guesses and \nthe other only gives you one guess no mather the size of the intervall");
		System.out.println("\n(1) - Game Setup\n(2) - Main Menu");

		boolean failsafe = false;
		while(!failsafe) {

			try {

				switch(_input.nextInt()) {

				case 1: 
					gameSetup();
					break;

				case 2:
					startMenu();
					break;

				default:
					System.out.println("Please choose an integer, either \"1\" or \"2\"");
					break;
				}

			}
			catch(Exception E) {
				_input.next();
				System.out.println("Invalid input, Please choose an integer, either \"1\" or \"2\"");
			}
		}

	}

	/**
	 * A sub menu used to learn about the important people who made this game, need _input to be functional
	 */
	private static void credits() {
		System.out.println("\nImportant people: Svante, Svante and Svante");
		System.out.println("\n(1) - Main Menu \n(2) - Exit Game");

		boolean failsafe = false;
		while(!failsafe) {

			try {

				switch(_input.nextInt()) {
				case 1:
					startMenu();
					break;

				case 2:
					exitGame();
					break;

				default:
					System.out.println("Please choose an integer, either \"1\" or \"2\"");
					break;
				}

			}
			catch(Exception E) {
				_input.next();
				System.out.println("Invalid input, Please choose an integer either \"1\" or \"2\"");
			}
		}

	}

	/**
	 * A method which terminates the application when used
	 */
	private static void exitGame() {
		System.out.println("\nClosing application...");
		System.out.println("--Application terminated--");
		System.exit(0);	//Terminates application
	}

	/**
	 * A method which gives the user the ability to choose their intervall range. Uses the method randomNumber() and needs _input to be functional
	 */
	private static void intervallSelection() {

		int top = 0;
		int bottom = 0;
		boolean rightInput = false;

		while(!rightInput) {


			System.out.println("Input upper limit of intervall using one or more integers");
			top = _input.nextInt();
			System.out.println();
			System.out.println("Input lower limit of intervall using one ore more integers");
			bottom = _input.nextInt();
			System.out.println();

			if(bottom > top) {
				System.out.println("The upper limit has to be greater than the lower limit in an intervall, please try again:\n");
			}
			else {
				rightInput = true;
			}

		}

		_arrayListSize = top - bottom;

		for (int i = 0; i < (_arrayListSize); i++) {
			_alternatives.add(randomNumber(bottom, top));
		}

	}

	/**
	 * A method which returns a random number between two integers
	 * @param min a integer used to limit the random numbers on the lower side
	 * @param max a integer used to limit the random numbers on the higher side
	 * @return randomNumber = a nomber between the param "max" and "min"
	 */
	private static int randomNumber(int min, int max) {

		Random randomNumber = new Random();
		return randomNumber.nextInt((max - min) + 1) + min;
	}

	/**
	 * The main part of this application, gives the user the ability to guess number until failure/victory. Also gives them the ability to play again or quit
	 * _input in needed for the method to work properly
	 */
	private static void guessGame() {

		System.out.println("Guess a number within your choosen intervall");


		int rightAnswer = _alternatives.get((int) (Math.random()*(_arrayListSize)));

		if(_guessAmount < 1 && _guessAmount != -2) {	
			_guessAmount = 1;
		}

		int counter = 0;

		boolean failsafe = false;
		boolean correctAnswer = false;
		boolean outOfGuesses = false;


		while(!failsafe) {
			try {

				while(!correctAnswer && !outOfGuesses) {

					int guess = _input.nextInt();

					if(guess > rightAnswer) {

						counter = counter + 1;

						if(counter == _guessAmount) {
							outOfGuesses = true;
							failsafe = true;
						}
						System.out.println("Wrong, try a lower integer");

						System.out.println("You have guessed " + (counter) + " time(s)");

						if(_guessAmount == -2) {	//Translation: If you have unlimited amount of guesses, don't print amount of guesses left, else print them
							System.out.println();
						}
						else {
							System.out.println("You have " + (_guessAmount-counter) + " guess(es) left!");
						}


					}
					else if(guess < rightAnswer) {

						counter = counter + 1;

						if(counter == _guessAmount) {
							outOfGuesses = true;
							failsafe = true;
						}

						System.out.println("Wrong, try a higher integer");
						System.out.println("You have guessed " + (counter) + " time(s)");

						if(_guessAmount == -2) {	//Translation: If you have unlimited amount of guesses, don't print amount of guesses left, else print them
							System.out.println();
						}
						else {
							System.out.println("You have " + (_guessAmount-counter) + " guess(es) left!");
						}

					}
					else {
						correctAnswer = true;
						failsafe = true;
					}
				}	

			}
			catch(Exception E) {
				_input.next();
				System.out.println("Invalid input, Please choose an integer in your choosen intervall");
			}
		}


		if(correctAnswer == true) {
			System.out.println("You won, congratulations");
		}
		else {
			System.out.println("You lost, too bad");
		}


		System.out.println("(1) - Quick restart \n(2) - Back to game setup \n(3) - Exit Game");

		failsafe = false;

		while(!failsafe) {
			try {
				switch(_input.nextInt()) {

				case 1:
					guessGame();
					break;
				case 2: 
					gameSetup();
					break;
				case 3:
					exitGame();
					break;
				default:
					System.out.println("Please choose an integer between \"1\" and \"3\"");
					break;
				}	
			}
			catch(Exception E) {
				_input.next();
				System.out.println("Invalid input, Please choose an integer between \"1\" and \"3\"");
			}
		}
	}

	/**
	 * A switch case method for the user to be able to choose the difficulty they want to play on. also impactful for the amount
	 * of guesses on all difficulties except medium which is the base all others are based of
	 */
	private static void difficultySelection() {
		System.out.println("Choose your difficulty: \n(1) - Unlimited \n(2) - Easy \n(3) - Medium \n(4) - Hard \n(5) - Extreme");
		String difficultyS = "";
		boolean failsafe = false;

		while(!failsafe) {
			try {
				switch(_input.nextInt()) {

				case 1:
					_guessAmount = -2;	//-2 is used because it is a integer which never will be achived by any of the other difficulties
					// that way i can in the method guessGame() single out the integer -2 and use it so if _guessAmount is -2 the amount of guesses will never run out
					difficultyS = "Unlimited";
					System.out.println("You have choosen: " + difficultyS);
					failsafe = true;
					break;

				case 2:
					_guessAmount = difficultyCalculation() + 2;
					difficultyS = "Easy";
					System.out.println("You have choosen: " + difficultyS + ", and have " + _guessAmount + " guesses!");
					failsafe = true;
					break;

				case 3:
					_guessAmount = difficultyCalculation();
					difficultyS = "Medium";
					System.out.println("You have choosen: " + difficultyS + ", and have " + _guessAmount + " guesses!");
					failsafe = true;
					System.out.println(_guessAmount);
					break;

				case 4:
					_guessAmount = difficultyCalculation() -2;
					difficultyS = "Hard";
					System.out.println("You have choosen: " + difficultyS + ", and have " + _guessAmount + " guesses!");
					failsafe = true;
					break;

				case 5:
					_guessAmount = 1;
					difficultyS = "Extreme";
					System.out.println("You have choosen: " + difficultyS + ", and have " + _guessAmount + " guesses!");
					failsafe = true;
					break;

				default:
					System.out.println("Please choose an integer between \"1\" and \"5\"");
					break;
				}
			}
			catch(Exception E) {
				_input.next();
				System.out.println("Invalid input, Please choose an integer between \"1\" and \"3\"");
			}
		}
	}

	/**
	 * A method to calculate how many guesses you are allowed on medium difficulty based on the size of the choosen intervall
	 * @return difficulty = the amount of guesses on medium diffuculty
	 */
	private static int difficultyCalculation() {

		int counter = 0;
		int arrayListSize = _arrayListSize;
		int difficulty = 0;
		boolean placeholder = false;

		while(!placeholder) {
			if(arrayListSize < 1) {
				difficulty = difficulty + counter;
				placeholder = true;
			}
			else {
				arrayListSize = arrayListSize / 2;
				counter = counter + 1; 
			}
		}

		return difficulty;
	}

}


