package esercizio1;

import java.util.Scanner;

public class EsercizioIfElse {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String user;
		System.out.println("scrivi una stringa");
		user=userInput.nextLine();
		stringaPariDispari(user);
		
		

	}
	
	
	public static String stringaPariDispari (String n1) {
		if (n1.length() % 2 == 0 ) {
			
			System.out.println("true");
			
		} else if (n1.length() % 2 == 1) {
			System.out.println("false");
		}
	return n1;
	
	}
	
	
		
	

}
