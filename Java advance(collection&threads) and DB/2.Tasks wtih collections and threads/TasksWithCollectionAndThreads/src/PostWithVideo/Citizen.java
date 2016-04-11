package PostWithVideo;

import java.util.ArrayList;
import java.util.List;

public class Citizen implements Runnable {
	private String firstName;
	private String lastName;
	private String address;
	private static PostOffice postOffice;
	
	private static List<MailBox> mailboxes;

	static{
		mailboxes = new ArrayList<MailBox>();
		for(int mailbox = 1; mailbox<=25; mailbox++){
			mailboxes.add(new MailBox());
		}
		
		postOffice = new PostOffice();
	}
	
	public Citizen(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Citizen [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

	@Override
	public void run() {
		for (int numberOfLetters = 0; numberOfLetters < 30; numberOfLetters++) {
			try {
				
				System.out.println("Sega she pratq obekt nomer " + numberOfLetters);
				sendRandonMailObject();
				System.out.println("Pratih go " +numberOfLetters);
			} catch (MailBoxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	private synchronized MailObject sendRandonMailObject() throws MailBoxException {
		MailObject result = null;
		if(Math.random()>0.5){
			 result  = new Letter(this, new Citizen("Pesho", "Peshev", "Banishora 9"));
			 int randomIndex = (int) (Math.random()*mailboxes.size());
			 System.out.println("She go pusna ei tuka " + randomIndex);
			 MailBox mailBox = mailboxes.get(randomIndex);
			 if(Math.random()<0.5){
				 System.out.println("She go pusna v kutiq!");
				 mailBox.addLetter((Letter) result);
			 }
			 else{
				 System.out.println("She go pusna v poshtata!");
				 postOffice.addMailObject(result);
			 }
		}
		else{
			 result = new Parcel(this, new Citizen("Mara", "Ivanovo", "Ta nqkude"), generateRanodm(), generateRanodm(), 
					 generateRanodm(), Math.random()>0.5);
			 System.out.println("She si generiral parcel(kolet)");
			 postOffice.addMailObject(result);
			 
		}
		return result;
	}

	private int generateRanodm() {
		return (int)(Math.random()*100);
	}

	public static PostOffice getPostOffice() {
		return postOffice;
	}

	public static List<MailBox> getMailboxes() {
		return mailboxes;
	}
	
	
}