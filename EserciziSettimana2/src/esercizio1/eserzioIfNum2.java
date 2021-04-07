package esercizio1;

import java.util.Scanner;

public class eserzioIfNum2 {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int num;
		System.out.println("inserisci anno");
		num = userInput.nextInt();
		controllaSeBisestile(num);
		

	}

	public static void controllaSeBisestile(int n1) {
		if (n1 % 4 == 0) {
			System.out.println(" l'anno " + n1 + " è bisestile ");

		}
		else if (n1 % 100 == 0 && n1 % 400 == 0) {
			System.out.println(" l'anno " + n1 + " è bisestile ");
			
		}
		else if (n1 % 4 == 1) {
			System.out.println(" l'anno " + n1 + " non è bisestile");

		}
		
			

	} 

}
