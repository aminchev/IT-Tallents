package PostNiki;

import java.util.List;

public class Postman extends Citizen {

	protected static final int MINIMUM_LETTERS = 50;
	private int processedMailObjects = 0;

	public Postman(String firstName, String lastName, String address) {
		super(firstName, lastName, address);
		getPostOffice().registerPostman(this);
	}

	@Override
	public void run() {
		while (true) {
			while (getPostOffice().getNumberOfMailObjects() <= MINIMUM_LETTERS) {
				synchronized (getPostOffice()) {
					try {
						System.out.println("Are shte chakam shtoto nqma pisma do chesmata.");
						getPostOffice().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
						return;
					}
				}
			}
			
			System.out.println("E sega gi razdadoh ot syrce!");
			int numberOfPostmen = Thread.currentThread().getThreadGroup().activeCount();
			int numberOfMailsToGet = getPostOffice().getNumberOfMailObjects() / numberOfPostmen;
			
			try {
				List<MailObject> mails = getPostOffice().takeMails(numberOfMailsToGet);
				for (MailObject mo : mails) {
					Thread.sleep((long) mo.getTimeToDeliver());
					System.out.println("Eto sega razdadoh ei tozi : " + mo);
				}
				
				this.processedMailObjects += mails.size();
				
				synchronized (getPostOffice()) {
					getPostOffice().notifyAll();
				}
			} catch (MailboxException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public int getProcessedMailObjects() {
		return processedMailObjects;
	}
	
}
