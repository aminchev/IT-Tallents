package PostWithVideo;

public class Letter extends MailObject {

	
	
	public Letter(Citizen sender, Citizen receiver) {
		super(sender, receiver);
		
	}

	@Override
	public float getTax() {
		return 0.2f;
	}

	@Override
	public float getTimeForDelivery() {
		return 1500;
	}
	
	
	
}
