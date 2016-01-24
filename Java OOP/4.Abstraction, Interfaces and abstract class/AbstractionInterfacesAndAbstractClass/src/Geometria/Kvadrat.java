package Geometria;

public class Kvadrat extends IzpuknalChetiriugalnik {
	
	Kvadrat(double a){
		super(a, a, a, a);
	}
	

	@Override
	public double calcSurface() {
		return this.getA()*this.getA();
	}
	
	@Override
	public double calcPerimetar() {
		return this.getA()*this.NUMBER_OF_SIDES;
	}

	

}
