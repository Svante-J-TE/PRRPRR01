package v39lektioner;

import java.util.Scanner;

//J�mf�r f�re iteration
public class while_loop {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Anv�nds n�r man inte vet hur m�nga g�nger man vill repetera n�got
		
		boolean exit = false;
		
		while(!exit){	// !betyder att den fr�gar om motsatsen �r sann, �r det sant att sant �r sant
						// hade kunnat skriva att boolean exit = true ist�llet // men d� skulle det inte st� "!exit" i "while loopen" utan bara "exit"
			System.out.println("Skriv \"exit\" f�r att avsluta:");
			String line = input.nextLine();	
			if(line.equals("exit")){
				exit = true;
			}
		}
		
	}

}