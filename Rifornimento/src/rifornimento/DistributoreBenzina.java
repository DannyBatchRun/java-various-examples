package rifornimento;

public class DistributoreBenzina implements Carburante {
	
	private double deposito;
	private double euroPerLitro;
	
	public DistributoreBenzina() {
		this.deposito = 0;
	}
	
	public DistributoreBenzina (double euroPerLitro) {
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

	public void setEuroPerLitro(double euroPerLitro) {
		this.euroPerLitro = euroPerLitro;
	}

	@Override
	public void rifornisci(double unaQuantita) {
		this.deposito = deposito + unaQuantita;
		System.out.println("E' stato riempito il Distributore di Benzina di circa " + this.deposito + " litri.");
	}

	@Override
	public void vendi(double euro) {
		deposito = deposito - euro/euroPerLitro;
		System.out.println("Vendita Effettuata. Nel Distributore sono rimasti circa " + this.deposito + " litri.");
	}

	@Override
	public void aggiorna(double unPrezzoPerLitro) {
		this.euroPerLitro = unPrezzoPerLitro;
		System.out.println("Ora il Distributore di Benzina vende circa a " + this.euroPerLitro + "€ per Litro.");
	}
	
	

}
