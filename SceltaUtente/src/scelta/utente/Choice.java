package scelta.utente;

public class Choice {
	
	public static void risposta(String rispostaUtente) {
		if(rispostaUtente.equals("Si") || rispostaUtente.equals("S") || rispostaUtente.equals("Certo") || rispostaUtente.equals("Perchè no?")) {
			System.out.println("OK");
		} else if(rispostaUtente.equals("si") || rispostaUtente.equals("s") || rispostaUtente.equals("certo") || rispostaUtente.equals("perchè no?")) {
			System.out.println("OK");
		} else if (rispostaUtente.equals("No") || rispostaUtente.equals("N")) {
			System.out.println("Fine");
		} else if (rispostaUtente.equals("no") || rispostaUtente.equals("n")) {
			System.out.println("Fine");
		} else {
			System.out.println("Dato non corretto");
		}
	}
}
