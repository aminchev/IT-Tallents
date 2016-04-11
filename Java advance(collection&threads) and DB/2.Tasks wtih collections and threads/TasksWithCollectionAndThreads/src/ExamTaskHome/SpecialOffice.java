package ExamTaskHome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SpecialOffice extends Office {

	private List<TransporterEmployee> drivers; 
	private List<Client> allClients;
	private List<Pratka> allPratki;
	private List<Office> ordinaryOffices;
	
	public SpecialOffice(String city) {
		super(city);
		allClients = new ArrayList<Client>();
		ordinaryOffices = new ArrayList<Office>();
		
		drivers = new ArrayList<TransporterEmployee>();
		TransporterEmployee first = new TransporterEmployee("Petko Petkov", "0888123443", "1123214124",
				new Address("Veliko Turnovo", "1"), "Sofiq");
		TransporterEmployee second = new TransporterEmployee("Iliq Iliev", "08881126453", "1937274384",
				new Address("Veliko Turnovo", "2"), "Plovdiv");
		TransporterEmployee third = new TransporterEmployee("Dobri Dobrev", "0987231243", "341224312434",
				new Address("Veliko Turnovo", "3"), "Russe");
		TransporterEmployee fourth = new TransporterEmployee("Asen Asenov", "0372641221", "647363468346",
				new Address("Veliko Turnovo", "4"), "Varna");
		
		drivers.add(first);
		drivers.add(second);
		drivers.add(third);
		drivers.add(fourth);
		
	}
	
	//��������� ��� ���� �� ������ �� �� � ThreadPool??
	
	void addClientOfTheFirm(Client client){
		if(client!=null){
			allClients.add(client);
		}
	}
	
	List<Client> getAllClientsSorted(){
		List<Client> result = new ArrayList<Client>((Collection<? extends Client>) new ClientComparator());
		for(Client client:allClients){
			result.add(client);
		}
		return result;
	}
	
	void addOffice(Office office){
		if(office!=null){
			this.ordinaryOffices.add(office);
		}
	}
	
	List<Pratka> getAllPratkiOrdered(){
		List<Pratka> result = new ArrayList<Pratka>((Collection<? extends Pratka>) new PratkaComparator());
		for(Office office:ordinaryOffices){
			for(Pratka pratka:office.getPratki()){
				result.add(pratka);
			}
		}
		return result;
	}
	
	List<Protocol> allProtocolsOfGivenPratka(Pratka pratka){
		List<Protocol> allProtocolsForPratka = null;
		if(pratka!=null){
			for(Pratka curPratka:allPratki){
				if(curPratka.equals(pratka)){
					allProtocolsForPratka = curPratka.getProtocolsThatThisPratkaExists();
				}
			}
		}
		return allProtocolsForPratka;
	}	

}
