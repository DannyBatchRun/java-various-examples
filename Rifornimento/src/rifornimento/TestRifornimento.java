package rifornimento;

public class TestRifornimento {

	public static void main(String[] args) {
		
		DistributoreBenzina unDistributore = new DistributoreBenzina(1);
		
		unDistributore.rifornisci(30000);
		unDistributore.vendi(30);

	}

}
