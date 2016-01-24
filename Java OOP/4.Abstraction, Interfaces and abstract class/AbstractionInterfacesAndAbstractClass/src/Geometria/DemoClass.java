package Geometria;

public class DemoClass {

	public static  void main(String[] args) {
		Trapets trap = new Trapets(5,6,4,3,2.3);
		IzpuknalChetiriugalnik test = new Kvadrat(5);
		
		Kvadrat kv = new Kvadrat(3);
		double z =  kv.calcPerimetar();
		double w = kv.calcSurface();
		System.out.println(z);
		System.out.println(w);
		
		Pravougulnik prav = new Pravougulnik(3, 6);
		double x = prav.calcPerimetar();
		double y = prav.calcSurface();
		System.out.println("Лицето на правоъгълника е " + y );
		System.out.println("Обиколката му е " + x);
		
		
		Romb rombi = new Romb(7,2);
		double romSur = rombi.calcSurface();
		double romPer = rombi.calcPerimetar();
		System.out.println("Romb lice " + romSur);
		System.out.println("Romb perimetur " + romPer);
		
		Chetiriugalnik uspor = new Usporednik(6, 4, 3);
		double uspSur = uspor.calcSurface();
		double uspPer = uspor.calcPerimetar();
		System.out.println("Usporednik lice:" + uspSur);
		System.out.println("Usporednik perimetur:" + uspPer);
		
	}

}
