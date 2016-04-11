package PostAlone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Citizen implements Runnable {
	private static final int COUNT_OF_MAILBOXES = 25;
	private String firstName;
	private String lastName;
	private String address;
	private static PostOffice postoffice;
	private static List<MailBox> mailboxes;
	
	static{
		mailboxes = new ArrayList<MailBox>();
		for(int mailBox = 1; mailBox<=COUNT_OF_MAILBOXES; mailBox++){
			mailboxes.add(new MailBox());
		}
		postoffice = new PostOffice();
	}
	
	void startCollectMailsFromMailboxes(){
		for(MailBox box:mailboxes){
			List<Letter> letters = box.getAllLettersFormBox();
			getPostoffice().addMailObjectsInPostOffice(letters);
		}
	}
	
	public Citizen(String firstName, String lastName, String address) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
	}

	void putRandomMeilObjectInBoxOrPostOffice() throws MailException{
		MailObject randMailObject = null;
		if(Math.random()<0.5){
			randMailObject = new Letter(this, new Citizen("Ivan", "Ivanov", "Lulin 212"));
			if(Math.random()<0.5){
				int randomIndexOfMailBox = (int)(Math.random()*mailboxes.size());
				System.out.println("She go pusna v kutiq nomer " + randomIndexOfMailBox );
				MailBox randomMailBox = mailboxes.get(randomIndexOfMailBox);
				randomMailBox.addLetter((Letter) randMailObject);
			}
			else{
				System.out.println("She go pusna v poshtata");
				postoffice.addMailObjectsInPostOffice(randMailObject);
			}
		}
		else{
			System.out.println("Sega she izpratq kolet napravo v poshtata she go zanesa!");
			randMailObject = new Parcel(this, new Citizen("Ivo", "Petrov", "Mladost 4"),
				getRandomValue(), getRandomValue(), getRandomValue(), Math.random()>0.5);
			postoffice.addMailObjectsInPostOffice(randMailObject);
		}
		
	}
	
	@Override
	public void run() {
		for(int numberOfMailObject =1; numberOfMailObject<=30; numberOfMailObject++){
			System.out.println("Sega she izpratq pratka nomer " + numberOfMailObject);
			try {
				this.putRandomMeilObjectInBoxOrPostOffice();
			} catch (MailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Izpratih go " + numberOfMailObject);
		}
		
	}
	
	public int getRandomValue(){
		return (int)(Math.random()*100);
	}
	
	public String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		if(firstName!=null && firstName.length()>0){
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		if(lastName!=null && lastName.length()>0){
			this.lastName = lastName;
		}
	}

	public String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		if(address!= null && address.length()>0){
			this.address = address;
		}
	}

	public static PostOffice getPostoffice() {
		return postoffice;
	}

	List<MailBox> unmodMailBox = Collections.unmodifiableList(mailboxes);
	
	public static List<MailBox> getMailboxes() {
		return mailboxes;
	}

	
	
}