package esercizio1;

import java.util.Scanner;

public class esercizioSwitch {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int numero;
		System.out.println("inserisci numero compreso tra 0 e 3");
		numero = userInput.nextInt();
		stampaNumInLettere(numero);
		
		
	}
	
	
	
	public static void stampaNumInLettere (int n1) {
		
		switch (n1) {
		case  0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
			default:
				System.out.println("il numero non è compreso tra 0 e 3");
		
		
		
		}
	}

}
