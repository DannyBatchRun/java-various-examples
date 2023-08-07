package piramide.pow;

public class PowerGenerator {
	
	private double base;
	private double exp;
	
	public PowerGenerator() {
		
	}
	
	public PowerGenerator(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double nextPow() {
		double result = Math.pow(base, exp);
		exp = exp + 1;
		return result;
	}

}
