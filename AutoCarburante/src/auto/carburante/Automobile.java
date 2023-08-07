package auto.carburante;

public class Automobile implements Volante {
	
	private String nome;
	private String marca;
	private int cilindrata;
	private int carburante;
	
	public Automobile() {
		this.carburante = 0;
	}

	public Automobile(String nome, String marca, int cilindrata) {
		this.nome = nome;
		this.marca = marca;
		this.cilindrata = cilindrata;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public void guida(int velocita) {
		if(this.carburante == 0) {
			System.out.println("La Macchina " + nome + " " + marca + " non pu� partire. Non ha carburante.");
		} else {
			System.out.println("La Macchina " + nome + " " + marca + " sta guidando a una velocit� di " + velocita + "kmH. Il livello del carburante si abbassa.\n");
			this.carburante -= 5;
		}
	}

	@Override
	public void controllaCarburante() {
		System.out.println("Il Livello del Carburante della tua " + nome + " " + marca + " attualmente � di " + carburante + " litri.\n");
	}

	@Override
	public void faiRifornimento() {
		if (this.carburante != 30) {
			this.carburante = 30;
			System.out.println("Rifornimento Effettuato.\n");
		} else if (this.carburante == 30) {
			System.out.println("Il Livello del Carburante della tua " + nome + " " + marca + " � gi� al massimo della sua capacit�.");
		}
	}

	@Override
	public String toString() {
		return "La tua Automobile " + nome + " " + marca + " ha una cilindrata di " + cilindrata + " cavalli.\n";
	}
}
