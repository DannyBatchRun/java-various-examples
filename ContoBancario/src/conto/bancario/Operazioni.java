package conto.bancario;

public interface Operazioni {
	
	public void prelevaDenaro(double denaro);
	public void aggiungiDenaro(double denaro);
	public void aggiungiInteresse(int interesse);

}
