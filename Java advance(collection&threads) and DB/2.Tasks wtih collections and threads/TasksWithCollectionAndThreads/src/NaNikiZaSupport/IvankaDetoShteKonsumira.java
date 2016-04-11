package NaNikiZaSupport;

public class IvankaDetoShteKonsumira implements Runnable {
	private ITorba torba;
	private Thread onqDetoProizvejda;
	
	void setOnqDetoProizvejda(Thread onqDetoProizvejda) {
		this.onqDetoProizvejda = onqDetoProizvejda;
	}

	@Override
	public void run() {
		while (onqDetoProizvejda.isAlive() || !torba.isEmpty()) {
			System.out.println(Thread.currentThread().getName() + "Sega shte nabivam");
			
			while (torba.isEmpty()) {
				synchronized (torba) {
					try {
						System.out.println(Thread.currentThread().getName() + "!!!!!!!!!Mai shte trqbva da pochakam!!!!!!");
						torba.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
						return;
					}
				}
			}
			
			try {
				System.out.println(Thread.currentThread().getName() + "Sega shte izqm 1 : " + torba.getLastProduct());
				Thread.sleep(100);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			if (torba.isPoizpraznena()) {
				System.out.println(Thread.currentThread().getName() + "!@!!Sega shte go vikna onq pustinqk da proizede");
				synchronized (torba) {
					torba.notifyAll();	
				}
			}
		}
	}

	void setTorba(ITorba torba) {
		this.torba = torba;
	}
	
}
