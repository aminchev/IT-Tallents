package ExamTaskHome;

import java.util.ArrayList;
import java.util.List;

public class PriemchikEmployee extends Person implements Runnable {

	private String city;
	private Office office;
	

	public PriemchikEmployee(String name, String phoneNumber, String privateNumber, Address address, String city) {
		super(name, phoneNumber, privateNumber, address);
		this.setCity(city); 
	}
	

	public String getCity() {
		return city;
	}

	private void setCity(String city) {
		if (city != null && city.length()>0) {
			this.city = city;
		}
	}


	@Override
	public void run() {
		while(true){
			while(this.office.getCountOfAllPratki()<20){
				System.out.println("There are not enough pratki for our driver.I will wait for more pratki!");
				synchronized (office.getPratki()) {
					try {
						office.getPratki().wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			System.out.println("There are enough pratki for our driver!");
			int countOfPratki = ((int) (Math.random())*this.office.getCountOfAllPratki());
			List<Pratka> pratkiForGivingOfDriver = new ArrayList<Pratka>();
			int counterOfPratki = 0;
			for(Pratka pratka:office.getPratki()){
				if(counterOfPratki>countOfPratki){
					break;
				}
				pratkiForGivingOfDriver.add(pratka);
				counterOfPratki++;
			}
			this.office.getDriver().addPratki(pratkiForGivingOfDriver);
			this.office.makeProtocol(this, this.office.getDriver());
			
			List<Pratka> pratkiForRemove = office.getPratki().subList(0, countOfPratki);
			office.getPratki().removeAll(pratkiForRemove);
			
			synchronized (office.getPratki()) {
				office.getPratki().notifyAll();
			}
		}
		
	}
}
