package dipendente;

public class TestDipendente {

	public static void main(String[] args) {
		
		Dipendente daniele = new Dipendente("Daniele Mazalla", 3000);
		
		daniele.infoDipendente();
		daniele.alzaSalario(100);
		daniele.infoDipendente();

	}

}
