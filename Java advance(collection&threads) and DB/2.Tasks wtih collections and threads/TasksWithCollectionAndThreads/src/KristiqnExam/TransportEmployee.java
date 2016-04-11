package KristiqnExam;

import java.util.ArrayList;
import java.util.List;

public class TransportEmployee extends Employee implements Runnable{


	private List<Package> myListOfPackagesIHaveToDeliverToTown;
	private String townIHaveToDeliverTheseTo;
	private FirmOffice officeIHaveToDeliverTo;
	
	public FirmOffice getOfficeIHaveToDeliverTo() {
		return officeIHaveToDeliverTo;
	}

	public void setOfficeIHaveToDeliverTo(FirmOffice officeIHaveToDeliverTo) {
		this.officeIHaveToDeliverTo = officeIHaveToDeliverTo;
	}

	public TransportEmployee(String name, String city, String telNum, String egn,String town,FirmOffice myOffice) {
		//validaciq
		super(name, city, telNum, egn, myOffice);
		this.townIHaveToDeliverTheseTo=town;
		myListOfPackagesIHaveToDeliverToTown=new ArrayList<Package>();
		
	}

	public String getTownIHaveToDeliverTheseTo() {
		return townIHaveToDeliverTheseTo;
	}

	public void setTownIHaveToDeliverTheseTo(String townIHaveToDeliverTheseTo) {
		this.townIHaveToDeliverTheseTo = townIHaveToDeliverTheseTo;
	}

	@Override
	public void run() {
		while(true){
			while(getMyOffice().areTherePackagesToBeDelivered() && myListOfPackagesIHaveToDeliverToTown.size()<=10){
				synchronized (getMyOffice()) {
					this.getMyOffice().employeeGetPackage(this);
					System.out.println("Here , I've got my packages!");
					this.getMyProtocol().generateProtocol();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
			
			try {
				getMyOffice().wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
			System.out.println("Im running to the other office!");
			synchronized(getOfficeIHaveToDeliverTo()){
				getOfficeIHaveToDeliverTo().addNewPackages(myListOfPackagesIHaveToDeliverToTown);
				System.out.println("I delivered those");
				this.getMyProtocol().generateProtocol();
				myListOfPackagesIHaveToDeliverToTown.removeAll(myListOfPackagesIHaveToDeliverToTown);
				
				
				getOfficeIHaveToDeliverTo().notifyAll();
			}
			
			
			
		}
		
	}

	
	@Override
	public void addPackageToMyList(List<Package> packages) {
		//synch
		//za vseki sluchai
		synchronized (myListOfPackagesIHaveToDeliverToTown) {
			this.myListOfPackagesIHaveToDeliverToTown.addAll(packages);
			System.out.println("I've added some packages to my list");
		}
		
	}

}
