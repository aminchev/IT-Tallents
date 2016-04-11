import java.util.ArrayList;
import java.util.List;

public class Citizen implements Runnable {
	private static final int NUMBER_OF_ITEMS = 30;
	private String firstName;
	private String lastName;
	private String address;
	private static PostOffice postOffice;
	private static List<Mailbox> mailboxes;
	
	static {
		mailboxes =  new ArrayList<Mailbox>();
		for (int mailbox = 1; mailbox <= 25; mailbox++) {
			mailboxes.add(new Mailbox());
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
		for (int numberOfLetters = 1; numberOfLetters < NUMBER_OF_ITEMS; numberOfLetters++) {
			try {
				System.out.println("Sega shte pratq obekt nomer " + numberOfLetters);
				
				sendRandomMailObjecgt();

				System.out.println("Pratih go " + numberOfLetters);

			} catch (MailboxException e) {
				e.printStackTrace();
			}
		}
	}

	private MailObject sendRandomMailObjecgt() throws MailboxException {
		MailObject result = null;
		if (Math.random() > 0.5) {
			 result = new Letter(this, new Citizen("Pesho", "Peshev", "Banishora 9, do chesmata"));
			 int randomIndex = (int) (Math.random() * mailboxes.size());
			 System.out.println("Shte go pusna ei tuka : " + randomIndex);
			 Mailbox mailBox = mailboxes.get(randomIndex);
			 if (Math.random() > 0.5) {
				 System.out.println("Shte go pusna v kutiq pylna s taini");	 
				 mailBox.addLetter((Letter) result);
			 }
			 else {
				 postOffice.addMailObject(result);
				 System.out.println("Shte go pusna v poshta pylna s maini");	 
			 }
		} else {
			result = new Parcel(this, new Citizen("Mara", 
					"Otvarachkata", "do kiusheto na okolovruystnoto"), generateRandom(),
					generateRandom(), generateRandom(), Math.random() > 0.5);
			
			System.out.println("Shte si generiram parcel(kolet)");	 
			postOffice.addMailObject(result);
		}
		return result;
	}

	private int generateRandom() {
		return (int)(Math.random() * 100);
	}

	public static PostOffice getPostOffice() {
		return postOffice;
	}

	public static List<Mailbox> getMailboxes() {
		return mailboxes;
	}
}
