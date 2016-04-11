package KristiqnExam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirmOffice {

	private static DistributionFirmOffice velikoTurnovo;
	private String townNameOfThisOffice;
	private List<Protocol> protocols;
	private List<LocalEmployee> localEmployeesInOffice;
	private List<TransportEmployee> transportEmployeesOfThisOffice;

	private List<Package> packagesToBeDeliveredInAnotherOffice;
	private List<Package> packagesToBeDeliveredToClient;
	

	public FirmOffice(String townNameOfThisOffice) {
		if (townNameOfThisOffice != null)
			this.setTownNameOfThisOffice(townNameOfThisOffice);
		
		
		protocols=new ArrayList<Protocol>();
		localEmployeesInOffice=new ArrayList<LocalEmployee>();
		transportEmployeesOfThisOffice=new ArrayList<TransportEmployee>();
		
		
		packagesToBeDeliveredInAnotherOffice=new LinkedList<Package>();
		packagesToBeDeliveredToClient=new LinkedList<Package>();
		

	}
	
	public void employeeGetPackage(TransportEmployee te){
		//synch
		te =transportEmployeesOfThisOffice.get((int) (Math.random()*transportEmployeesOfThisOffice.size()));
		List<Package> packagesToMyList=new LinkedList<Package>();
		packagesToMyList=packagesToBeDeliveredInAnotherOffice.subList(0, 5);
		for(int i=0;i<=5;i++){
			Package thisPack=packagesToMyList.get(i);
			if(!te.getCity().equals(thisPack.getReceiver().getCity())){
				packagesToMyList.remove(i);
			}
		}
		
		//ne sum siguren dali tova ima smisul? 
		packagesToBeDeliveredInAnotherOffice.remove(packagesToMyList);
		//
		
		te.addPackageToMyList(packagesToMyList);
	}
	
	

	public String getTownNameOfThisOffice() {
		return townNameOfThisOffice;
	}
//VALIDACII
	public void setTownNameOfThisOffice(String townNameOfThisOffice) {
		this.townNameOfThisOffice = townNameOfThisOffice;
	}

	public DistributionFirmOffice getVelikoTurnovo() {
		return velikoTurnovo;
	}

	public void setVelikoTurnovo(DistributionFirmOffice velikoTurnovo) {
		this.velikoTurnovo = velikoTurnovo;
	}
	
	
	public void addNewPackage(Package newPackage) throws PackageException{
	//synchronized
		if(newPackage!=null){
			packagesToBeDeliveredInAnotherOffice.add(newPackage);
		}else{
			throw new PackageException("Sorry,we cannot add this package");
		}
	
	}
	
	public void getSpravka(Package p){
		System.out.println(p);
	}

	public boolean areTherePackagesToBeDeliveredToClient(){
		if(packagesToBeDeliveredToClient.size()>0){
			return true;
		}else{
			return false;
		}
	}
	
	
	public boolean areTherePackagesToBeDelivered(){
		if(packagesToBeDeliveredInAnotherOffice.size()>0){
			return true;
		}else{
			return false;
		}
	}
	
	
	public void assignTheNewPackagesToLocalEmp(){
		
		LocalEmployee localEmp=localEmployeesInOffice.get((int) (Math.random()*transportEmployeesOfThisOffice.size()));
		List<Package> packagesToMyList=new LinkedList<Package>();
		packagesToMyList=packagesToBeDeliveredToClient.subList(0, 5);
		packagesToBeDeliveredToClient.remove(packagesToMyList);
		localEmp.addPackageToMyList(packagesToMyList);
		
	}
	
	
	
	
	public void addNewPackages(List<Package> incomingPackages){
		if(incomingPackages.size()>0){
			packagesToBeDeliveredToClient.addAll(incomingPackages);
		}
		
		
	}
	
	

}