package ExamTaskHome;

import java.util.ArrayList;
import java.util.List;

public class TransporterEmployee extends Person implements Runnable {

	private String city;
	private Office office;
	private List<Pratka> pratkiThatIMustToDrive;

	public TransporterEmployee(String name, String phoneNumber, String privateNumber, Address address, String city) {
		super(name, phoneNumber, privateNumber, address);
		this.setCity(city);
		pratkiThatIMustToDrive = new ArrayList<Pratka>();
	}

	public String getCity() {
		return city;
	}

	private void setCity(String city) {
		this.city = city;
	}

	void addPratki(List<Pratka> pratki) {
		if (pratki != null) {
			this.pratkiThatIMustToDrive.addAll(pratki);
		}
	}

	@Override
	public void run() {
		while (true) {
			while (this.pratkiThatIMustToDrive.size() < 8) {
				System.out.println("There are not enough pratki for driving. I will wait for more by priemchika!");
				synchronized (pratkiThatIMustToDrive) {
					try {
						pratkiThatIMustToDrive.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			System.out.println("There are enough pratki. I will go");
			//...
		}
	}

}
