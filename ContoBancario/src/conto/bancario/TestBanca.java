package conto.bancario;

public class TestBanca {

	public static void main(String[] args) {
		
		BancaDati harrys = new BancaDati("HarryButters", 30000.00);
		
		System.out.println(harrys);
		
		harrys.prelevaDenaro(1000);
		harrys.prelevaDenaro(500);
		harrys.prelevaDenaro(400);
		
		System.out.println(harrys + "\n");
		
		BancaDati moms = new BancaDati("SavingCost", 40000.0);
		System.out.println(moms);
		
		moms.aggiungiInteresse(10);
		
		System.out.println(moms);
		

	}

}
