import javax.swing.plaf.synth.SynthSpinnerUI;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber != null) {
			if (simMobileNumber.substring(0, 2).equals("08") && simMobileNumber.length() == 10) {
				this.simMobileNumber = simMobileNumber;
				this.hasSimCard = true;
			} else {
				this.simMobileNumber = "Invalid number";
			}
		}
	}

	void removeSimCard() {
		this.hasSimCard = false;
		this.simMobileNumber = "";
	}

	void call(GSM receiver, int duration) {
		if (receiver != null && duration > 0) {
			if (receiver.hasSimCard == true) {
				if (this.hasSimCard == true) {
					if (!this.simMobileNumber.equals(receiver.simMobileNumber)) {
						if (this != receiver) { // Ники го каза
							Call importantCall = new Call();
							this.lastOutgoingCall = importantCall;
							importantCall.caller = this;
							importantCall.receiver = receiver;
							importantCall.duration = duration;
							this.lastOutgoingCall = importantCall;
							receiver.lastIncomingCall = importantCall;
							this.outgoingCallsDuration = this.outgoingCallsDuration + importantCall.duration;
						}
					}
				}
			}
		}
	}

//	 Call call(GSM receiver, int duration) {
//		 if ( receiver != null && duration > 0) {
//			 if (!this.simMobileNumber.equals(receiver.simMobileNumber)) {
//				 if (this.hasSimCard == true && receiver.hasSimCard == true) {
//					 Call importantCall = new Call();
//					 importantCall.caller = this;
//					 importantCall.receiver = receiver;
//					 importantCall.duration = duration;
//					 importantCall.priceForAMinute = 1;
//					 this.lastOutgoingCall = importantCall;
//					 receiver.lastIncomingCall = importantCall;
//					 this.outgoingCallDuration = this.outgoingCallDuration +
//					 importantCall.duration;
//					 return importantCall;
//				
//				 }
//			 }
//		 }
//		 Call emptyCall = new Call();
//		 return emptyCall;
//	 }

	double getSumFotCall() {
		if (this.lastIncomingCall == null) {
			return 0.0;
		} else {
			double sum = this.outgoingCallsDuration * this.lastOutgoingCall.priceForAMinute;
			return sum;
		}
	}

	void printInfoForLastIncomingCall() {
		if(this.lastIncomingCall != null)
		System.out.println("GSM " + this.model+ " with number " + this.lastIncomingCall.caller.simMobileNumber + " is calling to "
				+ this.lastIncomingCall.receiver.simMobileNumber + " for " + this.lastIncomingCall.duration +
				" minutes");
	}

	void printInfoForLastOutgoingCall() {
		if(this.lastOutgoingCall != null)
		System.out.println("GSM " + this.model + " with number " + this.lastOutgoingCall.caller.simMobileNumber + " is calling to "
				+ this.lastOutgoingCall.receiver.simMobileNumber + " for " + 
				this.lastOutgoingCall.duration +
				" minutes");
	}
}
