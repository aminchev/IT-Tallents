package Exam;

import java.time.LocalDateTime;

public class Client extends Person implements Runnable {
	
	private static final int NUMBER_OF_PRATKI = 100;
	private Office office;
	private EmployeePriemchik priemchik;
	
	public Client(String name, String phoneNumber, String privateNumber, Address address, boolean isFirm) {
		super(name, phoneNumber, privateNumber, address);
		this.setFirm(isFirm);
	}

	boolean isFirm;

	public boolean isFirm() {
		return isFirm;
	}

	private void setFirm(boolean isFirm) {
		this.isFirm = isFirm;
	}

	void sendPratka(){
		
			Pratka pratka = new Pratka(this, new Client("Ivan", "0888123456",
					"8701021234", new Address("Varna", "Kom 15"), false), "morkovi", LocalDateTime.now());
		
		this.office.acceptPratka(pratka);
		this.priemchik.addPratkaInProtocol(pratka);
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
