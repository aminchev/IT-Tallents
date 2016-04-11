package ExamTaskHome;

import java.time.LocalDateTime;
import java.util.List;

public class Client extends Person implements Runnable {

	private static final int NUMBER_OF_PRATKI = 100;
	private boolean isFirma;
	//private Office myOffice;
	
	public Client(String name, String phoneNumber, String privateNumber, Address address, boolean isFirma) {
		super(name, phoneNumber, privateNumber, address);
		this.setFirma(isFirma);
	}
	
	void sendPratka(){
		Person receiver = new Client("Kiril Kotev", "0897123221", "8765431231", new Address("Varna", "212"), false);
		Pratka pratka = new Pratka(this,receiver , "Podaruk", LocalDateTime.now());
		this.getOffice().acceptPratkaInOffice(pratka);
	}

	public boolean isFirma() {
		return isFirma;
	}

	private void setFirma(boolean isFirma) {
		this.isFirma = isFirma;
	}

	@Override
	public void run() {
		for (int numberOfPratka = 0; numberOfPratka < NUMBER_OF_PRATKI; numberOfPratka++) {
			System.out.println("Now I will send pratka!");
			this.sendPratka();
			System.out.println("I send it");
		}
		
	}

}
