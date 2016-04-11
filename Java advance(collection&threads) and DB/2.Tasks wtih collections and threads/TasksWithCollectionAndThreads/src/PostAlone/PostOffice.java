package PostAlone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PostOffice {
	List<MailObject> repository = new LinkedList<MailObject>();
	Map<LocalDate, List<MailObject>> archiv = new TreeMap<LocalDate, List<MailObject>>();
	                                            
	public void addMailObjectsInPostOffice(List<? extends MailObject> mailObjects ){
		if(mailObjects!=null){
			synchronized (repository) {
				repository.addAll(mailObjects);
			}
			synchronized (archiv) {
				if(!archiv.containsKey(LocalDate.now())){
					archiv.put(LocalDate.now(), new ArrayList<MailObject>());
				}
				archiv.get(LocalDate.now()).addAll(mailObjects);
			}
		}
	}
	
	public List<MailObject> takeRandomCountOfMailObjectsForWearing(){
		List<MailObject> randomMailObject = new ArrayList<MailObject>();
		int countForGetting = (int)(Math.random()*repository.size());
		int counter = 0;
		for(MailObject mailObj:repository){
			randomMailObject.add(mailObj);
			counter++;
			if(counter>=countForGetting){
				break;
			}
		}
		repository.removeAll(randomMailObject);
		return randomMailObject;
	}
	
	public List<MailObject> allObjectOnDate(LocalDate date) throws MailException{
		List<MailObject> allMailObj = new ArrayList<>();
		if(archiv.containsKey(date)){
			return archiv.get(date);
		}
		throw new MailException("No mail objects on this date!");
	}
	
	double percentOfAllLetterFromDate(){
		List<MailObject> allObjectsForToday = archiv.get(LocalDate.now());
		double counterOfLetters = 0;
		double counterOfAllMailObjects = 0;
		for(MailObject mailObj : allObjectsForToday){
			if(mailObj instanceof Letter){
				counterOfLetters++;
			}
			counterOfAllMailObjects++;
		}
		double percentOfLetters = (counterOfLetters/counterOfAllMailObjects)*100;
		return percentOfLetters;
	}
	
	double percentOfAllFragileParcel(){
		double countOfAllParcels = 0;
		double countOfFragileParcels = 0;
		for(LocalDate date:archiv.keySet()){
			List<MailObject> objForThisDate = archiv.get(date);
			for(MailObject obj: objForThisDate){
				if(obj instanceof Parcel){
					if(((Parcel)obj).isFragile()==true){
						countOfFragileParcels++;
					}
					countOfAllParcels++;
				}
			}
		}
		double percentOfFragileParcels = (countOfFragileParcels/countOfAllParcels)*100;
		return percentOfFragileParcels;
	}
	
	void addMailObjectsInPostOffice(MailObject mailObject){
		this.addMailObjectsInPostOffice(Arrays.asList(mailObject));
	}
	
	int getCountOfMailObjectsInPost(){
		return repository.size();
	}
	
}