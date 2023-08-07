package rettangolo;

public class Rettangolo {
	
	private int base;
	private int altezza;
	private int x;
	private int y;
	
	public Rettangolo() {
		
	}

	public Rettangolo(int base, int altezza, int x, int y) {
		this.base = base;
		this.altezza = altezza;
		this.x = x;
		this.y = y;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Questo Rettangolo ha come base " + base + " cm, altezza " + altezza + ", ascissa " + x + ", ordinata " + y + ",";  
	}
	
	

}
