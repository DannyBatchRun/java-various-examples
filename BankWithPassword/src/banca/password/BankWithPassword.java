package banca.password;

import java.util.*;

public class BankWithPassword {
	
	private List<BancoPosta> listaUtenti = new ArrayList<>();
	private int tentativiPassword = 4;
	
	public void aggiungiUtente(BancoPosta utente) {
		listaUtenti.add(utente);
	}
	
	public List<BancoPosta> getListaUtenti() {
		return listaUtenti;
	}

	public void setListaUtenti(List<BancoPosta> listaUtenti) {
		this.listaUtenti = listaUtenti;
	}
	
	public void verificaUtente(String utente) {
		boolean presente = false;
		for(BancoPosta b : listaUtenti) {
			if(b.getNomeUtente().equals(utente)) {
				presente = true;
			}
		}
		if (presente) {
			System.out.println("Utente Inserito Correttamente\n");
			verificaPassword(utente);
		} else {
			System.out.println("Non è stato trovato alcun nickname con nome " + utente);
		}
	}
	
	public void verificaPassword(String utente) {
		boolean corretto = false;
		int pinCorretto = 0;
		@SuppressWarnings("resource")
		Scanner pass = new Scanner(System.in);
		System.out.println("Inserisci la Password di " + utente); 
		int controlloPass = pass.nextInt();
		
		for(BancoPosta b : listaUtenti) {
			if (b.getNomeUtente().equals(utente) && b.getPin() == controlloPass) {
				corretto = true;
				pinCorretto = b.getPin();
			}
		}
		
		if(corretto) {
			System.out.println("\nPassword Corretta.");
			bancaDati(utente, pinCorretto);
		} else if (corretto == false) {
			tentativiPassword--;
			System.out.println("\nPassword Errata! Hai a disposizione altri " + tentativiPassword + " tentativi.");
			if (tentativiPassword != 0) {
				verificaPassword(utente);
			} else if (tentativiPassword == 0) {
				System.out.println("Hai esaurito tutti i tentativi a disposizione. Il programma si interrompe.");
			}
		}
		
	}

	public void bancaDati(String nomeUtente, int pinInserito) {
		double contoCorrente = 0;

		for(BancoPosta b : listaUtenti) {
			if(b.getNomeUtente().equals(nomeUtente) && b.getPin() == pinInserito) {
				contoCorrente = b.getSaldoCorrente();
			}
		}
		
		System.out.println("\nBenvenuto nel tuo Conto BancoPosta.\nHai un saldo di circa " + contoCorrente + " €.\nQuanto vuoi prelevare?");
		
		@SuppressWarnings("resource")
		Scanner prel = new Scanner(System.in);
		double controlloPrelievo = prel.nextDouble();
		double sommaSottratta = 0;
		sommaSottratta = contoCorrente - controlloPrelievo;
		
		boolean cifraDisponibile = false;
		
		if (contoCorrente > controlloPrelievo) {
			cifraDisponibile = true;
		} else {
			cifraDisponibile = false;
		}
		
		if (!cifraDisponibile) {
			System.out.println("Questa somma non è disponibile sul tuo Conto Corrente. Riprova.");
			bancaDati(nomeUtente, pinInserito);
		} else if (cifraDisponibile) {
			System.out.println("E' stato effettuato un prelievo di " + controlloPrelievo + " €.");
			for (BancoPosta b : listaUtenti) {
				if(b.getNomeUtente().equals(nomeUtente) && b.getPin() == pinInserito) {
					b.setSaldoCorrente(sommaSottratta);
					System.out.println("Il tuo nuovo Conto ora è di " + b.getSaldoCorrente() + " €.");
					System.out.println("Operazione Terminata.");
				}
			}
		}
	}

}
