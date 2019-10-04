package v40Homework;

import java.util.Scanner;

public class fizzBuzzKattis {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int delbart1 = input.nextInt();
		int delbart2 = input.nextInt();
		int antal = input.nextInt();
		
		
		for(int i = 1; i <= antal; i++) { // Betämmer hur många gånger loopen ska köras genom att jämnföra i med variabeln antal
			
			if(i % delbart2 == 0 && i % delbart1 == 0) { // Testar om i är delbart med variabel 1 och 2. Om den är det skriv ut "FizzBuzz"
				System.out.println("FizzBuzz");
			}
			
			else if(i % delbart1 == 0) { // Testar om i är delbart med variabel 1. Om ja printa ut Fizz
				System.out.println("Fizz");
			}
			
			else if(i % delbart2 == 0) { // Testar om i är delbart med variabel 2. Om ja printa ut Buzz
				System.out.println("Buzz");
			}
			
			else if(i % delbart1 != 0 && i % delbart2 != 0) { // Testar om resten blir inte blir 0. Om det stämmer printa ut i:s värde vid detta tillfälle
				System.out.println(i);
			}
			
		}
		input.close();

	}

}
