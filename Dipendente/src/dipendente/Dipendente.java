package dipendente;

public class Dipendente {
	
	private String nome;
	private double stipendio;
	
	public Dipendente() {
		
	}

	public Dipendente(String nome, double stipendio) {
		this.nome = nome;
		this.stipendio = stipendio;
	}

	public String getNome() {
		return nome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	public void infoDipendente() {
		System.out.println("Nome del Dipendente : " + this.nome + " e ha uno Stipendio di " + this.stipendio + " Euro.");
	}
	
	public void alzaSalario(double percentuale) {
		this.stipendio = stipendio + ((stipendio * percentuale) / 100);
		System.out.println("Lo Stipendio del Dipendente " + this.nome + " si alza di circa " + percentuale + "%");
	}

}
