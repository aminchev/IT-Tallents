package Geometria;

public class Pravougulnik  extends Kvadrat{

	 Pravougulnik(double a, double b) {
		super(a);
		this.setB(b);
	}
	 
	@Override
	public double calcSurface() {
		return this.getA()*this.getB();
	}
	
	@Override
	public double calcPerimetar() {
		return (this.getA() + this.getB())*(this.NUMBER_OF_SIDES/2);
	}
	
	
}
