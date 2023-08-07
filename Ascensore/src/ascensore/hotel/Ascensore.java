package ascensore.hotel;

public class Ascensore implements Sentinella {
	
	private int maxNumeroPiani;
	private int pianoCorrente;
	private int numeroCorrentePersone;
	private Prenotazione[] numeroMassimoPrenotazioni;
	
	public Ascensore() {
		
	}

	public Ascensore(int maxNumeroPiani, int pianoCorrente, int numeroCorrentePersone,
			Prenotazione[] numeroMassimoPrenotazioni) {
		this.maxNumeroPiani = maxNumeroPiani;
		this.pianoCorrente = pianoCorrente;
		this.numeroCorrentePersone = numeroCorrentePersone;
		this.setNumeroMassimoPrenotazioni(numeroMassimoPrenotazioni);
	}

	public int getMaxNumeroPiani() {
		return maxNumeroPiani;
	}

	public int getPianoCorrente() {
		return pianoCorrente;
	}

	public int getNumeroCorrentePersone() {
		return numeroCorrentePersone;
	}

	public Prenotazione[] getNumeroMassimoPrenotazioni() {
		return numeroMassimoPrenotazioni;
	}

	public void setMaxNumeroPiani(int maxNumeroPiani) {
		this.maxNumeroPiani = maxNumeroPiani;
	}

	public void setPianoCorrente(int pianoCorrente) {
		this.pianoCorrente = pianoCorrente;
	}

	public void setNumeroCorrentePersone(int numeroCorrentePersone) {
		this.numeroCorrentePersone = numeroCorrentePersone;
	}

	public void setNumeroMassimoPrenotazioni(Prenotazione[] numeroMassimoPrenotazioni) {
		controllaPrenotazioni(numeroMassimoPrenotazioni);
	}
	
	private void controllaPrenotazioni(Prenotazione[] numeroMassimoPrenotazioni) {
		int contatorePrenotazioni = 0;
		for(int i = 0; i < numeroMassimoPrenotazioni.length; i++) {
			if (numeroMassimoPrenotazioni[i].getPianoPrenotato() == this.pianoCorrente) {
				contatorePrenotazioni = contatorePrenotazioni + numeroMassimoPrenotazioni[i].getNumeroClientiPrenotati();
			}
		}
		
		if (contatorePrenotazioni > this.maxNumeroPiani) {
			System.out.println("Ci sono troppe prenotazioni. Gli ultimi clienti prenotati verranno messi in coda.");
			int inCoda = contatorePrenotazioni - this.maxNumeroPiani;
			System.out.println("Ci sono " + inCoda + " persone in coda.");
			
			System.out.println("Numero Corrente Persone ora è : " + this.numeroCorrentePersone);
		} else {
			System.out.println("Prenotazioni Effettuate");
		}
		
//		for (int i = 0; i < numeroMassimoPrenotazioni.length; i++) {
//			numeroMassimoPrenotazioni[i].setNumeroClientiPrenotati(i);
//		}
		
		this.numeroMassimoPrenotazioni = numeroMassimoPrenotazioni;
	}
	
	@Override
	public void entra(Ascensore ascensore, Prenotazione[] prenotazione) {
		int contatoreAscensore = 0;
		for(int i = 0; i < prenotazione.length; i++) {
			if(ascensore.getNumeroCorrentePersone() > ascensore.getMaxNumeroPiani()) {
				System.out.println("L'Ascensore è oltre il massimo della sua capienza. Qualcuno dovrà aspettare fuori.");
				ascensore.setNumeroCorrentePersone(ascensore.getMaxNumeroPiani());
				break;
			} else if (prenotazione[i].getPianoPrenotato() == ascensore.getPianoCorrente()) {
				int numeroPersone = prenotazione[i].getNumeroClientiPrenotati();
				contatoreAscensore = numeroPersone + contatoreAscensore;
				ascensore.setNumeroCorrentePersone(contatoreAscensore);
			}
		}
		System.out.println("L'Ascensore con Piano Numero " + ascensore.getPianoCorrente() + " attualmente ospita " 
				+ ascensore.getNumeroCorrentePersone() + " persone.");
	}



	@Override
	public void muovi(Ascensore ascensore, Prenotazione[] prenotazione) {
		System.out.println("\nL'ascensore si sta muovendo...");
		for (int i = 0; i < prenotazione.length; i++) {
			if (prenotazione[i].getPianoPrenotato() == ascensore.getPianoCorrente()) {
				int numeroPersone = prenotazione[i].getNumeroClientiPrenotati();
				numeroPersone = 0;
				ascensore.setNumeroCorrentePersone(numeroPersone);
			}
		}
		System.out.println("Chi doveva salire al piano " + ascensore.getPianoCorrente() + " sono usciti e ora l'ascensore ha "
				+ ascensore.getNumeroCorrentePersone() + " persone.");
	}
	
	@Override
	public void statoAttualeAscensore(Ascensore ascensore) {
		System.out.println("L'Ascensore in questo momento ha " + ascensore.getNumeroCorrentePersone() + " persone.");
	}
	
}
