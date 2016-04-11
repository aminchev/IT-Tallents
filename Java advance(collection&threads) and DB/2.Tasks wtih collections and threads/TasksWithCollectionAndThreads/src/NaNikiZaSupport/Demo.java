package NaNikiZaSupport;

public class Demo {
	public static void main(String[] args) {
		ITorba torbichka = new Torba();

		for (int i = 1; i <= 100; i++) {
			IvankaDetoShteKonsumira ivanka = new IvankaDetoShteKonsumira();
			StoychoDiviqSelqnin stoycho = new StoychoDiviqSelqnin();

			ivanka.setTorba(torbichka);
			stoycho.setTorba(torbichka);

			Thread t = new Thread(stoycho);
			ivanka.setOnqDetoProizvejda(t);
			t.start();
			new Thread(ivanka).start();
		}
	}
}
