package ascensore.hotel;

public class Prenotazione {
	
	private int numeroClientiPrenotati;
	private int pianoPrenotato;
	
	public Prenotazione() {
		
	}

	public Prenotazione(int numeroClientiPrenotati, int pianoPrenotato) {
		this.numeroClientiPrenotati = numeroClientiPrenotati;
		this.pianoPrenotato = pianoPrenotato;
	}

	public int getNumeroClientiPrenotati() {
		return numeroClientiPrenotati;
	}

	public int getPianoPrenotato() {
		return pianoPrenotato;
	}

	public void setNumeroClientiPrenotati(int numeroClientiPrenotati) {
		this.numeroClientiPrenotati = numeroClientiPrenotati;
	}

	public void setPianoPrenotato(int pianoPrenotato) {
		this.pianoPrenotato = pianoPrenotato;
	}
	
	

}
