package auto.carburante;

public class TestAutomobile {

	public static void main(String[] args) {
		
		Automobile autoUno = new Automobile("Alfa Romeo", "Giulietta", 200000);
		Automobile autoDue = new Automobile("Fiat", "Cinquecento", 900);
		
		System.out.println(autoUno);
		System.out.println(autoDue);
		
		autoUno.faiRifornimento();
		autoUno.controllaCarburante();
		
		autoUno.guida(30);
		autoUno.guida(20);
		
		autoUno.controllaCarburante();
	}

}
