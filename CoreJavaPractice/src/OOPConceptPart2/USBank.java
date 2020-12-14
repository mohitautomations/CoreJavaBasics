package OOPConceptPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
	//only method declaration
	//no method body - only method prototype
	//in interface, we can declare the variables, vars. are by default static in nature
	//Vars value will not be changed, it final/constant in nature.
	//no static method in the interface.
	//no main method in interface.
	//we can not create the object of interface
	//interface is abstract in nature.

}
