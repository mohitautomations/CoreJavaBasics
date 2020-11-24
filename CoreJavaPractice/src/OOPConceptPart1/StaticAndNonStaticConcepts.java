package OOPConceptPart1;

public class StaticAndNonStaticConcepts {
	
	//Global Veriable: the scope of global veriable will be available across all the functions with some condtions.
	String name = "Tom"; //non-static global variable
	static int age = 25; //Static global variable
	
	public static void main(String[] args) {
		
		//How to call static methods and veriable?
		//1. direct calling:
		sum();
		//2. Calling by ClassName:
		StaticAndNonStaticConcepts.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcepts.age);
		
		//How to call non static methods and veriable:
		StaticAndNonStaticConcepts obj = new StaticAndNonStaticConcepts();
		obj.SendMail();
		System.out.println(obj.name);
		
		//can i access static method by object reference? YES
		obj.sum(); //Warning will be given
		
		

	}
	
	public void SendMail() {//non static method
		System.out.println("Send Mail Method");
	}
	
	public static void sum() {//Static method
		System.out.println("Sum Method");
	}

}
