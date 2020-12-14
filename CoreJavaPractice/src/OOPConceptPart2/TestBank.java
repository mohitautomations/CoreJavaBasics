package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		USBank.min_bal = 200;
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.educationloan();
		hs.carloan();
		
		//dynamic polymorphism:
		//Child class object can be referred by parent interface reference vars
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		

	}

}
