package PostNiki;

import java.util.List;

public class Collector extends Postman {

	public Collector(String firstName, String lastName, String address) {
		super(firstName, lastName, address);
	}
	
	@Override
	public int getProcessedMailObjects() {
		return 0;
	}

	@Override
	public void run() {
		while(true) {
			while (getPostOffice().getNumberOfMailObjects() > MINIMUM_LETTERS) {
				synchronized (getPostOffice()) {
					try {
						System.out.println("Sega shta chakam shtoto ima mnogo pisma.");
						getPostOffice().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			System.out.println("Sega  shte sybiram i postfaktum shte gi naliq tuka tiq pisma.");
			
			for (Mailbox mailbox : getMailboxes()) {
				List<Letter> list = mailbox.getAll();
				getPostOffice().addMailObject(list);
				System.out.println("Sega shte dobavq malko pisma.");
				
				
				synchronized (getPostOffice()) {
					getPostOffice().notifyAll();
				}
			}
		}
	}
}
