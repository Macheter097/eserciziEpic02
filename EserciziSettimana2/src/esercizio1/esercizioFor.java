package esercizio1;

import java.util.Scanner;

public class esercizioFor {
	public static void main(String[] args) {
		int num;
		Scanner userInput = new Scanner(System.in);
		System.out.println("inserisci intero");
		num=userInput.nextInt();
		contoAllaRovescia(num);
	}
	
	
	public static int contoAllaRovescia (int n1) {
		int rovescio;
		for ( int i=n1 ; i>=0 ; i--) {
			rovescio=i;
			System.out.println(rovescio);
			
		}
		return n1;
	}

}
