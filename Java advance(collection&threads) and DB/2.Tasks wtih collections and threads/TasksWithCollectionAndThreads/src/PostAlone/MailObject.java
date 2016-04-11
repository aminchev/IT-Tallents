package PostAlone;

public abstract class MailObject {
	private Citizen sender;
	private Citizen receiver;
	
	public MailObject(Citizen sender, Citizen receiver) {
		this.sender = sender;
		this.receiver = receiver;
	}
	
	public abstract double getTaxForSend();
	
	public abstract int getTimeForDeliver();
	

	public Citizen getSender() {
		return sender;
	}

	private void setSender(Citizen sender) {
		if(sender!=null){
			this.sender = sender;
		}
	}

	public Citizen getReceiver() {
		return receiver;
	}

	private void setReceiver(Citizen receiver) {
		if(receiver!=null){
			this.receiver = receiver;
		}
	}
	
	
}
