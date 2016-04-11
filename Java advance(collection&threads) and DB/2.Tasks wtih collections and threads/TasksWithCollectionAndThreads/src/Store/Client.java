package Store;

public class Client implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " start shoppint");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
