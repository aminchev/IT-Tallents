package PostWithVideo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PostOffice {

	private Map<LocalDate, List<MailObject>> archive = new TreeMap<LocalDate, List<MailObject>>();
	private List<MailObject> repository = new LinkedList<MailObject>();

	class PostOfficeQueryManager{
		List<MailObject> getMailObjectsByDate(LocalDate date) throws MailBoxException{
			if(archive.containsKey(date)){
				return archive.get(date);
			}
			else{
				throw new MailBoxException("Na taq data pisma nqma");
			}
		}
		
		public double getPersentOfLetters(){
			List<MailObject> lettersFromToday = archive.get(LocalDate.now());
			int numberOfLetters = 0; 
			for(MailObject mo :lettersFromToday){
				if(mo instanceof Letter){
					numberOfLetters++;
					
				}
			}
			
			return ((double)numberOfLetters/(double)lettersFromToday.size()) * 100.00;
		}
		
		public double getPersentOfProcessedFragileParcels(){
			int numberOfPFP = 0;
			int total = 0;
			for(LocalDate date:archive.keySet()){
				for(MailObject mo:archive.get(date)){
					if(mo instanceof Parcel && ((Parcel) mo).isFragile() && !repository.contains(mo)){
						numberOfPFP++;
					}
					total++;
				}
			}
			return ((double)numberOfPFP)/((double)total) * 100;
		}
	}
	
	public void addMailObject(MailObject mail) {
		this.addMailObject(Arrays.asList(mail));

	}

	public void addMailObject(List<? extends MailObject> mailObjects) {    //? extends добавени в края на демото

		if(mailObjects != null) {
			synchronized (repository) {
				repository.addAll(mailObjects);
			}
			synchronized (archive) {
				if(!archive.containsKey(LocalDate.now())) {
					archive.put(LocalDate.now(), new LinkedList<MailObject>());
				}
				archive.get(LocalDate.now()).addAll(mailObjects);
			}
		}
	}
	
	public List<MailObject> takeMails(int number) throws MailBoxException{
		if(number>repository.size()){
		   number = repository.size();	
		}
		synchronized (repository) {
			List<MailObject> result = repository.subList(0, number);
			repository.remove(result);
			return result;
		}		
	}
	
	public int getNumberOfMailObjects(){
		return this.repository.size();
	}

}
