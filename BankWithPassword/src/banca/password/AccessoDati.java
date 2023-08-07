package banca.password;

import java.util.Scanner;
import java.util.InputMismatchException;

public class AccessoDati {

	public static void main(String[] args) {
	
		BancoPosta daniele = new BancoPosta("DanieleMazalla", 12345, 3000);
		BancoPosta renato = new BancoPosta("RenzoArvin", 14567, 300000);
		BancoPosta michele = new BancoPosta("StefanoVivi", 34565, 20000);
		BankWithPassword banca = new BankWithPassword();
		
		banca.aggiungiUtente(daniele);
		banca.aggiungiUtente(renato);
		banca.aggiungiUtente(michele);
		
		@SuppressWarnings("resource")
		Scanner utente = new Scanner(System.in);
		
		System.out.println("Benvenuto nel nostro Conto BancoPosta! Inserisci il nome utente.");
		
		try {
			String controlloUtente = utente.next();
			banca.verificaUtente(controlloUtente);
		} catch (InputMismatchException e) {
			System.out.println("Impossibile inserire un codice alfanumerico. ERRORE!");
			e.printStackTrace();
		}
		
	}

}
