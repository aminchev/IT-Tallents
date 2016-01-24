package Geometria;

public class Usporednik extends Romb {
	
	Usporednik(double a, double b, double height) {
		super(a, height);
		this.setB(b);
	}
	
	@Override
	public double calcPerimetar() {
		return this.getA()*2 + this.getB()*2;
	}
	
	
}
