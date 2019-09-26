package v39lektioner;

import java.util.Scanner;

//Jämför före iteration
public class while_loop {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Används när man inte vet hur många gånger man vill repetera något
		
		boolean exit = false;
		
		while(!exit){	// !betyder att den frågar om motsatsen är sann, är det sant att sant är sant
						// hade kunnat skriva att boolean exit = true istället // men då skulle det inte stå "!exit" i "while loopen" utan bara "exit"
			System.out.println("Skriv \"exit\" för att avsluta:");
			String line = input.nextLine();	
			if(line.equals("exit")){
				exit = true;
			}
		}
		
	}

}