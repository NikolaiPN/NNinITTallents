
public class GSMCalls {

	public static void main(String[] args) {
		GSM purvi = new GSM();
		GSM vtori = new GSM();
		GSM treti = new GSM();
		GSM chet = new GSM();
		
		// na purvi i vtori shte slojim greshni sim karti, a na treti i chet shte slojim pravilni
		
		// Creating the first gsm	
		
		purvi.model = "Nokia N8";
		purvi.insertSimCard("0987235467");

		// Creating the second gsm
		
		vtori.insertSimCard("088934657");
		vtori.model = "Nexus 5";
		
		// Creating the third gsm
		
		treti.model = "Nokia Lumia";
		treti.insertSimCard("0887457683");
		
		// Creating the forth gsm
		
		chet.model = "IPhone 6";
		chet.insertSimCard("0889347623");
				
		// Actions using GSM
		
		treti.call(chet, 12);
		chet.call(treti, 5);
		treti.call(chet, 45);
		
		System.out.println("-------------------------------------------------------------------");
		
		treti.printInfoForTheLastOutgoingCall();
		treti.printInfoForLastIncomingCall();
		System.out.println(treti.getSumForCalls());
		System.out.println(chet.getSumForCalls());
		
				
				

	}
	

}
