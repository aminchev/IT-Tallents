package Store2;

public class Provider implements Runnable {
	private IStore store;

	@Override
	public void run() {
		while (true) {
			while (this.store.isNeedFromSomeProduct() == false) {
				synchronized (store) {
					System.out.println(Thread.currentThread().getName()
							+ " Nqma nujda on nikakva stoka - she pochakam da se izcherpi nqkoq!");
					try {
						this.store.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				// veche se poizprazni - trqbva da zaredq
				System.out.println(Thread.currentThread().getName() + " She zaredq lipsvashti producti");
				synchronized (store) {
					this.store.addMissingProducts();
					System.out.println("Zaredih ot vsichko!");
					store.notifyAll();
				}
			}
		}
	}

	public void setStore(Store store) {
		this.store = store;
	}

}
