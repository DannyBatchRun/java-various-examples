package conteggio.secondi;

public class TimeConverter {
	
	private int giorno;
	private int ora;
	private int minuti;
	private int secondi;
	
	public TimeConverter() {
		
	}

	public TimeConverter(int giorno, int ora, int minuti, int secondi) {
		this.giorno = giorno;
		this.ora = ora;
		this.minuti = minuti;
		this.secondi = secondi;
	}

	public int getGiorno() {
		return giorno;
	}

	public int getOra() {
		return ora;
	}

	public int getMinuti() {
		return minuti;
	}

	public int getSecondi() {
		return secondi;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	public void setOra(int ora) {
		this.ora = ora;
	}

	public void setMinuti(int minuti) {
		this.minuti = minuti;
	}

	public void setSecondi(int secondi) {
		this.secondi = secondi;
	}
	
	public void conteggioSecondi() {
		int totSecondiGiorno = 86400 * this.giorno;
		int totSecondiOra = 3600 * this.ora;
		int totSecondiMinuto = 60 * this.minuti;
		
		int secondiTotali = totSecondiGiorno + totSecondiOra + totSecondiMinuto + this.secondi;
		
		System.out.println("In base ai dati inseriti, il totale di secondi è di circa " + secondiTotali + ".");
	}
	
	public String toString() {
		return "I Giorni ne sono : " + this.giorno + " con numero complessivo di " + this.ora + " ore, " + this.minuti + " minuti e " + this.secondi + " secondi.";
	}

}
