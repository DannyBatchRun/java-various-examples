package second.converter;

public class SecondConverter implements Conversione {
	
	private int numeroSecondi;
	private TimeConverter tempo = new TimeConverter();
	private int giorno;
	private int ora;
	private int minuto;
	
	public SecondConverter() {
		
	}

	public SecondConverter(int numeroSecondi) {
		this.numeroSecondi = numeroSecondi;
	}

	public int getNumeroSecondi() {
		return numeroSecondi;
	}

	public void setNumeroSecondi(int numeroSecondi) {
		this.numeroSecondi = numeroSecondi;
	}

	@Override
	public String toString() {
		return "Il Numero di Secondi inserito è di " + numeroSecondi + ".";
	}

	@Override
	public void conteggioGiorni() {
		this.giorno = this.numeroSecondi / 86400;
		if(this.giorno < 0) {
			tempo.setGiorno(0);
		} else {
			this.tempo.setGiorno(this.giorno);	
		}
	}

	@Override
	public void conteggioOre() {
		this.ora = this.numeroSecondi / 3600;
		if(this.ora < 0) {
			tempo.setOra(0);
		} else {
			this.tempo.setOra(this.ora);
		}
	}

	@Override
	public void conteggioMinuti() {
		this.minuto = this.numeroSecondi / 60;
		if(this.minuto < 0) {
			tempo.setMinuti(0);
		} else {
			this.tempo.setMinuti(this.minuto);
		}
	}

	@Override
	public void conteggioSecondi() {
		this.tempo.setSecondi(numeroSecondi);
	}

	@Override
	public void conteggioSecondiTotali() {
		conteggioGiorni();
		conteggioOre();
		conteggioMinuti();
		conteggioSecondi();
		System.out.println(tempo);
	}

}
