package ascensore.hotel;

public interface Sentinella {
	
	public void entra(Ascensore ascensore, Prenotazione[] prenotazione);
	public void muovi(Ascensore ascensore, Prenotazione[] prenotazione);
	public void statoAttualeAscensore(Ascensore ascensore);

}
