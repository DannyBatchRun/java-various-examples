package conto.bancario;

public class BancaDati implements Operazioni {
	
	private String nomeBanca;
	private double bilance;
	
	public BancaDati() {
		
	}

	public BancaDati(String nomeBanca, double bilance) {
		this.nomeBanca = nomeBanca;
		this.bilance = bilance;
	}

	public String getNomeBanca() {
		return nomeBanca;
	}

	public void setNomeBanca(String nomeBanca) {
		this.nomeBanca = nomeBanca;
	}

	public double getBilance() {
		return bilance;
	}

	public void setBilance(double bilance) {
		this.bilance = bilance;
	}

	@Override
	public String toString() {
		return "La Banca Dati si chiama " + nomeBanca + " e ha un bilancio di circa " + bilance + " $.";
	}

	@Override
	public void prelevaDenaro(double denaro) {
		if(bilance < 0) {
			System.out.println("La Banca Dati ha il bilancio in negativo.\n");
		}
		bilance -= denaro;
		System.out.println("Sono stati prelevati " + denaro + " $ dal bilancio");
	}

	@Override
	public void aggiungiDenaro(double denaro) {
		if(bilance > 0) {
			System.out.println("La Banca Dati ha il credito in positivo\n");
		}
		bilance += denaro;
		System.out.println("Sono stati aggiunti " + denaro + " $ al bilancio.");
	}

	@Override
	public void aggiungiInteresse(int interesse) {
		bilance = bilance + ((bilance * interesse) / 100);
		System.out.println("Alla Banca Dati " + nomeBanca + " è stato applicato un interesse del " + interesse + "% .");
	}
	
	

}
