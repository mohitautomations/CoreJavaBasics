package OOPConceptPart2;

public class Bmw extends Car{//"has-o relationship"
	
	//when same method is present in parent class as well as an child class with same name and same no. of argument, 
	//is called "Method-Overriding".
	public void Start() { //overridden method
		System.out.println("Bmw...Start");
	}
	
	public void TheftSafety() {
		System.out.println("Bmw...TheftSafety");
	}

}
