package Geometria;

public class Trapets extends IzpuknalChetiriugalnik {

	private double height;
	
	//getter for height
	double getHeight(){
		return this.height;
	}
	//setter for height
	void setHeight(double height){
		if(height>0){
			this.height = height;
		}
	}
	
	Trapets(double a, double b, double c, double d, double height) {
		super(a, b, c, d);
		this.setHeight(height);
	}
	@Override
	public double calcSurface() {
		return ((this.getA() + this.getC())/2)*this.getHeight();
	}
	
}
