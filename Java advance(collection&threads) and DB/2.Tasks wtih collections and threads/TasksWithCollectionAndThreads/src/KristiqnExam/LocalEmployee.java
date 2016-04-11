package KristiqnExam;

import java.util.ArrayList;
import java.util.List;

public class LocalEmployee extends Employee implements Runnable{

	private List<Package> myListOfPackagesIHaveToDeliverToClient;
	
	
	public LocalEmployee(String name, String city, String telNum, String egn,FirmOffice myOffice) {
		super(name, city, telNum, egn, myOffice);
	
		myListOfPackagesIHaveToDeliverToClient=new ArrayList<Package>();
		
	}
	
	

	@Override
	public void addPackageToMyList(List<Package> packages) {
		//validaciika
		this.myListOfPackagesIHaveToDeliverToClient.addAll(packages);
		
	}


	@Override
	public void run() {
		while(true){
			while(getMyOffice().areTherePackagesToBeDeliveredToClient()){
				System.out.println("I'll be delivering these things now!");
				synchronized (getMyOffice()) {
					getMyOffice().assignTheNewPackagesToLocalEmp();
				}
			}
			try {
				getMyOffice().wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//da se dovurshi
		}
		
	}

}
