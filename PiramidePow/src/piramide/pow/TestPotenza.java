package piramide.pow;

public class TestPotenza {

	public static void main(String[] args) {
		
		PowerGenerator p = new PowerGenerator();
		p.setBase(10);
		System.out.println(p.nextPow());
		System.out.println(p.nextPow());
		System.out.println(p.nextPow());

	}

}
