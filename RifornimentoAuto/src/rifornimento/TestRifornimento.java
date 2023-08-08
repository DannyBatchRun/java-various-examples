package rifornimento;

public class TestRifornimento {

	public static void main(String[] args) {
		
		DistributoreBenzina verde = new DistributoreBenzina("Verde", 2);
		DistributoreBenzina gasolio = new DistributoreBenzina("Gasolio", 1);
		Automobile alfaRomeo = new Automobile("Alfa Romeo", "Giulietta", "Verde", 100000);
		
		verde.rifornisciVerde(2334);
		gasolio.rifornisciGasolio(3455);
		
		verde.vendi(44, alfaRomeo);
		
		alfaRomeo.controllaCarburante();
	}

}
