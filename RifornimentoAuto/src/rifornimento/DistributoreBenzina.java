package rifornimento;

public class DistributoreBenzina implements Carburante {
	
	private String tipoDistributore;
	private double deposito;
	private double euroPerLitro;
	
	public DistributoreBenzina() {
		this.deposito = 0;
	}
	
	public DistributoreBenzina (String tipoDistributore, double euroPerLitro) {
		this.setTipoDistributore(tipoDistributore);
		this.euroPerLitro = euroPerLitro;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getEuroPerLitro() {
		return euroPerLitro;
	}
	
	public String getTipoDistributore() {
		return tipoDistributore;
	}
	
	public void setTipoDistributore(String tipoDistributore) {
		if(tipoDistributore.equals("Verde") || tipoDistributore.equals("Gasolio")) {
			this.tipoDistributore = tipoDistributore;
		} else {
			System.out.println("Hai inserito un tipo distributore non valido");
		}
	}

	public void setEuroPerLitro(double euroPerLitro) {
		this.euroPerLitro = euroPerLitro;
	}

	@Override
	public void rifornisciGasolio(double unaQuantita) {
		if(this.tipoDistributore.equals("Gasolio")) {
			this.deposito = deposito + unaQuantita;
			System.out.println("E' stato riempito il Distributore di Gasolio di circa " + unaQuantita + " litri.");
			System.out.println("Ora il Distributore ha " + this.deposito + " litri.");
		} else {
			System.out.println("Il Distributore non è a gasolio");
		}
	}
	
	@Override
	public void rifornisciVerde(double unaQuantita) {
		if(this.tipoDistributore.equals("Verde")) {
			this.deposito = deposito + unaQuantita;
			System.out.println("E' stato riempito il Distributore di Benzina Verde di circa " + unaQuantita + " litri.");
			System.out.println("Ora il Distributore ha " + this.deposito + " litri.");
		} else {
			System.out.println("Il Distributore non è di Benzina Verde");
		}
	}

	@Override
	public void vendi(double euro, Automobile auto) {
		if(tipoDistributore.equals("Verde") && auto.getTipoBenzina().equals("Verde")) {
			deposito = deposito - euro/euroPerLitro;
			double litriAccumulati = euro/euroPerLitro;
			auto.setCarburante(litriAccumulati);
			System.out.println("Vendita Effettuata. Nel Distributore sono rimasti circa " + this.deposito + " litri.");
		} else if (tipoDistributore.equals("Gasolio") && auto.getTipoBenzina().equals("Gasolio")) {
			deposito = deposito - euro/euroPerLitro;
			double litriAccumulati = euro/euroPerLitro;
			auto.setCarburante(litriAccumulati);
			System.out.println("Vendita Effettuata. Nel Distributore sono rimasti circa " + this.deposito + " litri.");
		} else {
			System.out.println("La Macchina non può essere rifornita perchè di tipo diverso rispetto al Distributore.");
		}
	}

	@Override
	public void aggiorna(double unPrezzoPerLitro) {
		this.euroPerLitro = unPrezzoPerLitro;
		System.out.println("Ora il Distributore vende circa a " + this.euroPerLitro + "€ per Litro.");
	}

}
