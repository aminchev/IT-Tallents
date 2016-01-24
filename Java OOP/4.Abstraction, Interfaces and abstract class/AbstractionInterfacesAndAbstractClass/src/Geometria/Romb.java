package Geometria;

public class Romb extends IzpuknalChetiriugalnik{

	private double height;
	//getter for height
	double getHeight(){
		return this.height;
	}
	// setter for height
	void setHeight(double height){
		if(height>0){
			this.height = height;
		}
	}
	
	Romb(double a, double height) {
		super(a,a,a,a);
		this.setHeight(height);
	
	}
	
	@Override
	public double calcPerimetar() {
		return this.getA()*this.NUMBER_OF_SIDES;
	}

	@Override
	public double calcSurface() {
		return this.getA()*this.getHeight();
	}

}
