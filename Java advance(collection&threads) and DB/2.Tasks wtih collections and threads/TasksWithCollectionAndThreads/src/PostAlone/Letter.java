package PostAlone;

public class Letter extends MailObject {

	private static final int TIME_FOR_LETTER_DELIVERY = 1500;
	private static final double PRICE_FOR_LETTER = 0.5;

	public Letter(Citizen sender, Citizen receiver) {
		super(sender, receiver);
		
	}

	@Override
	public double getTaxForSend() {
		return PRICE_FOR_LETTER;
	}

	@Override
	public int getTimeForDeliver() {
		return TIME_FOR_LETTER_DELIVERY;
	}

}
