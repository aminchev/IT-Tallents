package Exam;

public class EmployeeTransporter extends Person implements Runnable {

	private Office office;
	private static final int MIN_COUNT_OF_PRATKI = 10;
	
	public EmployeeTransporter(String name, String phoneNumber, String privateNumber, Address address) {
		super(name, phoneNumber, privateNumber, address);
	}

	@Override
	public void run() {
		while(true){
			while(this.office.getCountOfAllPratki()<MIN_COUNT_OF_PRATKI){
				System.out.println("Out priemchiks are not give me mails!. We will wait!");
				synchronized (office) {
					try {
						office.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			System.out.println("Now I will start wearing mails ");
		}
	}

}
