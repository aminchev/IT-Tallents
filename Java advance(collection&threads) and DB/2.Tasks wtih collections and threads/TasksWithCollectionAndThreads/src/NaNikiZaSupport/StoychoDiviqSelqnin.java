package NaNikiZaSupport;

public class StoychoDiviqSelqnin implements Runnable {
	private static final int KOLKO_SHTE_PROIZVEDA = 20;
	private ITorba torba;

	@Override
	public void run() {
		final String[] produkti = { "Patladjani", "Morkovi", "Kerviz", "Djodjen", "Bulgur", "Kinoa", "Chia", "Tofu" };

		for (int broi = 1; broi <= KOLKO_SHTE_PROIZVEDA && !Thread.currentThread().isInterrupted(); broi++) {
			while (torba.isFull()) {
				try {
					synchronized (torba) {
						System.out.println(Thread.currentThread().getName() + "!!!!!!Shte chakam - pylna e!!!!!!!");
						torba.wait();
						
//						if (torba.isFull()) {
//							return;
//						}
					}
				} catch (InterruptedException e) {
					return;
				}
			}

			// veche ne e pylna - 100%
			System.out.println(Thread.currentThread().getName() + "Aide shte ponapylnq malko produkti");

			for (int i = 1; i <= 10 && !torba.isFull(); i++) {
				try {
					String produkt = produkti[(int) (Math.random() * produkti.length)];
					System.out.println(Thread.currentThread().getName() + "Shte dobavq " + produkt);
					torba.addProduct(produkt);
					broi++;
					
					if (torba.isPonapylnena()) {
						System.out.println(Thread.currentThread().getName() + "!!!!Sega shte q vikna onaq da qde");
						synchronized (torba) {
							torba.notifyAll();
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}

	void setTorba(ITorba torba) {
		this.torba = torba;
	}
}
