package rifornimento;

public interface Carburante {
	
	public void rifornisciVerde(double unaQuantita);
	public void rifornisciGasolio(double unaQuantita);
	public void vendi(double euro, Automobile auto);
	public void aggiorna(double unPrezzoPerLitro);

}
