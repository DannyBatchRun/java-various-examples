package rifornimento;

public class Automobile {
	
	private String nome;
	private String marca;
	private String tipoBenzina;
	private int cilindrata;
	private double carburante;
	
	public Automobile() {
		this.carburante = 0;
	}

	public Automobile(String nome, String marca, String tipoBenzina, int cilindrata) {
		this.nome = nome;
		this.marca = marca;
		this.tipoBenzina = tipoBenzina;
		this.cilindrata = cilindrata;
	}



	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public String getTipoBenzina() {
		return tipoBenzina;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public double getCarburante() {
		return carburante;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setTipoBenzina(String tipoBenzina) {
		this.tipoBenzina = tipoBenzina;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public void setCarburante(double carburante) {
		this.carburante = carburante;
	}

	public void guida(int velocita) {
		if(this.carburante == 0) {
			System.out.println("La Macchina " + nome + " " + marca + " non può partire. Non ha carburante.");
		} else {
			System.out.println("La Macchina " + nome + " " + marca + " sta guidando a una velocità di " + velocita + "kmH. Il livello del carburante si abbassa.\n");
			this.carburante -= 5;
		}
	}

	public void controllaCarburante() {
		System.out.println("Il Livello del Carburante della tua " + nome + " " + marca + " attualmente è di " + carburante + " litri.\n");
	}

	public void faiRifornimento() {
		if (this.carburante != 30) {
			this.carburante = 30;
			System.out.println("Rifornimento Effettuato.\n");
		} else if (this.carburante == 30) {
			System.out.println("Il Livello del Carburante della tua " + nome + " " + marca + " è già al massimo della sua capacità.");
		}
	}

	@Override
	public String toString() {
		return "La tua Automobile " + nome + " " + marca + " ha una cilindrata di " + cilindrata + " cavalli.\n";
	}
}
