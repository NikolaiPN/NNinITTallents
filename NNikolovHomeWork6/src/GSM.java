public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall = new Call();
	Call lastOutgoingCall = new Call();

	// Inserting Sim Card

	void insertSimCard(String newSimMobileNumber) {
		if (hasSimCard) {
			System.out.println("The GSM already has a Sim card");
		} else {
			if (newSimMobileNumber.length() != 10 || !(newSimMobileNumber.startsWith("08"))) {
				System.out.println("The Sim card you have entered is incorrect");
			} else {
				hasSimCard = true;
				simMobileNumber = newSimMobileNumber;
			}
		}
	}

	// Removing Sim Card

	void removeSimCard() {
		hasSimCard = false;
		simMobileNumber = null;
	}

	void call(GSM receiver, int duration) {
		if (duration > 1 && duration < 120) {
			if (this.hasSimCard == true && receiver.hasSimCard == true) {
				if (simMobileNumber != receiver.simMobileNumber) {
					this.lastOutgoingCall.caller = this.simMobileNumber;
					this.lastOutgoingCall.duration = duration;
					this.lastOutgoingCall.receiver = receiver.simMobileNumber;
					receiver.lastIncomingCall.caller = this.simMobileNumber;
					receiver.lastIncomingCall.duration = duration;
					receiver.lastIncomingCall.receiver = receiver.simMobileNumber;
					this.outgoingCallsDuration += duration;

				} else {
					System.out.println("The caller and reciever ids can not be the same");
				}
			}
			else{
				System.out.println("One of the GSMs has no Sim Card");
			}
		}
		else{
			System.out.println("The call duration is not correct");
		}
	}
	
	// Printing info about the last outgoing call
	
	void printInfoForTheLastOutgoingCall(){
		if(this.lastOutgoingCall != null){
		System.out.println("The recievers number is: " + lastOutgoingCall.receiver) ;
		System.out.println("The duration was: " + lastOutgoingCall.duration);
		System.out.println("The price for the call was: " + lastOutgoingCall.priceForAMin * lastOutgoingCall.duration);
		System.out.println("---------------------------------------------------------------------");
		}
		else{
			System.out.println("There are no Outgoing calls yet");
		}
	}
	
	// Printing info about the last incoming call
	
	void printInfoForLastIncomingCall(){
		if(this.lastIncomingCall != null){
		System.out.println("The callers number is: " + lastIncomingCall.caller) ;
		System.out.println("The duration was: " + lastIncomingCall.duration);
		System.out.println("The price for the call was: " + lastIncomingCall.priceForAMin * lastIncomingCall.duration);
		System.out.println("---------------------------------------------------------------------");
		}
		else{
			System.out.println("There are no incoming calls yet");
		}
	}
	
	// Getting the price for all outgoing calls
	
	void getSumForCalls(){
		int result = outgoingCallsDuration * (int)lastOutgoingCall.priceForAMin;
		System.out.println(result);
	}
	

}
