

public class CallGSMDemo {
	
	public static void main(String[] args) {
		GSM nokia = new GSM();
		GSM sony = new GSM();
		
		nokia.insertSimCard("0879050750");
		nokia.model = "Lumia";
		sony.insertSimCard("0885727497"); 
		sony.model = "xperia";
		
		//nokia.removeSimCard();
		
		nokia.call(sony, 2);
		sony.call(nokia, 5);
		
		
		nokia.printInfoForLastOutgoingCall();
		sony.printInfoForLastIncomingCall();
		nokia.printInfoForLastIncomingCall();
		
		System.out.println(nokia.getSumFotCall());
		System.out.println(sony.getSumFotCall());
	}
	
		
}
