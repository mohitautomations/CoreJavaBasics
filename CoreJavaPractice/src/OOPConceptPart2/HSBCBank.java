package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{//we are achieving multiple inheritance
	//Is-a relationship
	
	//if a class is implementing any interface, then its mandatory to define/override all the methods of interface.
	//overriding from USBank
	public void credit() {
		
		System.out.println("hsbc - Credit");
	}
	
	public void debit() {
		
		System.out.println("hsbc - debit");
	}
	
	//separate methods for HSBCBank
	public void transfermoney() {
		
		System.out.println("hsbc - transfermoney");
	}
	
	public void educationloan() {
		
		System.out.println("hsbc - edu. loan");
	}	
	
	public void carloan() {
		
		System.out.println("hsbc - car loan");
	}
	
	//Overriding from BrazilBank
	public void mutualfund() {
	
		System.out.println("hsbc - mutualfund");
	}

}
