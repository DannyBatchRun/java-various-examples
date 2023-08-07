package ascensore.hotel;

public class Reception {

	public static void main(String[] args) {
	
		Prenotazione[] prenotazioni = {
				new Prenotazione(3, 2), 
				new Prenotazione(2, 2),
				new Prenotazione(2, 2),
				new Prenotazione(4, 2),
				new Prenotazione(3, 3)
		};
		
		Ascensore ascensore = new Ascensore(10, 2, 0, prenotazioni);
		
		ascensore.entra(ascensore, ascensore.getNumeroMassimoPrenotazioni());
		ascensore.muovi(ascensore, ascensore.getNumeroMassimoPrenotazioni());
		ascensore.statoAttualeAscensore(ascensore);
		
	}
}
