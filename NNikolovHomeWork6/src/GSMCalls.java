
public class GSMCalls {

	public static void main(String[] args) {
		GSM purvi = new GSM();
		GSM vtori = new GSM();
		
		// Creating the first gsm
		
		purvi.hasSimCard = false;
		purvi.model = "Nokia N8";
		
		// Creating the second gsm
		
		vtori.hasSimCard = true;
		vtori.model = "Nexus 5";
		vtori.simMobileNumber = "0878222222";
		
		// Actions using GSM
		
		purvi.insertSimCard("0888111111");
		purvi.call(vtori, 12);
		vtori.call(purvi, 5);
		purvi.call(vtori, 45);
		
		
		purvi.printInfoForTheLastOutgoingCall();
		purvi.printInfoForLastIncomingCall();
		purvi.getSumForCalls();
		
				
				

	}
	

}
