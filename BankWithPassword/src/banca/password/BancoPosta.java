package banca.password;

public class BancoPosta {
	
	private String nomeUtente;
	private int pin;
	private double saldoCorrente;
	
	public BancoPosta() {
		
	}

	public BancoPosta(String nomeUtente, int pin, double saldoCorrente) {
		this.nomeUtente = nomeUtente;
		this.pin = pin;
		this.saldoCorrente = saldoCorrente;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getSaldoCorrente() {
		return saldoCorrente;
	}

	public void setSaldoCorrente(double saldoCorrente) {
		this.saldoCorrente = saldoCorrente;
	}

}
