package scelta.utente;

import java.util.Scanner;

public class TestChoice {

	public static void main(String[] args) {
		
		System.out.println("Vuoi continuare?");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		
		Choice.risposta(answer);

	}

}
