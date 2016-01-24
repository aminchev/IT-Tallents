package Geometria;

import javax.security.auth.callback.Callback;

public abstract class Chetiriugalnik implements IChetiriugulnaFigure {
	private double a;
	private double b; 
	private double c;
	private double d;
	
	//getter for a
	double getA(){
		return this.a;
	}
	//setter for a
	void setA(double a){
		if(a>0){
			this.a = a;
		}
	}
	//getter for b
		double getB(){
			return this.b;
		}
		//setter for b
		void setB(double b){
			if(b>0){
				this.b = b;
			}
		}
		//getter for c
		double getC(){
			return this.c;
		}
		//setter for c
		void setC(double c){
			if(c>0){
				this.c= c;
			}
		}
		//getter for d
		double getD(){
			return this.d;
		}
		//setter for d
		void setD(double d){
			if(d>0){
				this.d = d;
			}
		}
//		Chetiriugalnik(double a){
//			setA(a);
//		}
//		Chetiriugalnik(double a, double b){
//			this(a);
//			setB(b);
//		}
		
		Chetiriugalnik(double a, double b, double c, double d){
//			this(a,b);
			setA(a);
			setB(b);
			setC(c);
			setD(d);
		}

		
	public double calcPerimetar() {
		return this.getA()+this.getB() + this.getC() + this.getD();
	}
	//има ли смисъл да се имплементира тук абстрактен клас и той да се наследява или да се импле-
	//ментира директно в класовете от интерфейса
	//public abstract double calcSurface();
}
