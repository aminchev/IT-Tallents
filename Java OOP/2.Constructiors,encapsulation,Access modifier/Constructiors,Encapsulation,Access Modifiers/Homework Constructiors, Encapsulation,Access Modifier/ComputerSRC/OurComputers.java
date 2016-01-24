
public class OurComputers {

	public static void moreExpensive (int number, Computer a, Computer b){
		if(number == -1){
			System.out.println(a.name + " is more expencive than " + b.name );
		}
		if(number == 1){
			System.out.println(a.name + " is less expencive than " + b.name );
		}
		if(number == 0){
			System.out.println("Price of " + a.name + " is equal to price of " + b.name );
		}
	}
	
	public static void main(String[] args) {
		Computer lenovo  = new Computer(2012, 800, false, 700, 50, "Windows 7");
		lenovo.name = "Lenovo";
		Computer asus = new Computer(2013, 800, 1000, 500);
		asus.name = "Asus";
		Computer pravec = new Computer();
		pravec.year = 1992;
		pravec.price = 2000;
		pravec.hardDiskMemory = 10;
		pravec.freeMemomry = 5;
		pravec.name = "Pravec";

		int moreExpensiveThan = pravec.comparePrice(lenovo);
		moreExpensive(moreExpensiveThan, pravec, lenovo);
		
		moreExpensiveThan = asus.comparePrice(pravec);
		moreExpensive(moreExpensiveThan, asus, pravec);
		
		moreExpensiveThan = asus.comparePrice(lenovo);
		moreExpensive(moreExpensiveThan, asus, lenovo);
	}

}
