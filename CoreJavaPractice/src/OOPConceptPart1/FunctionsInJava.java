 package OOPConceptPart1;

public class FunctionsInJava {

	//main method -- Starting point of execution
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created and OBJ reference variable, referring to this object
		//after creating the object the copy of all non-static method will be given to this object
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30, 10);
		System.out.println(div);
		
		//main method is void - Never return a value		
	}
	
	//Non-Static Methods
	
	//Void -- does not return any value
	public void test() { //No input, No Output
		System.out.println("test method");
	}
	
	//return type = int
	public int pqr() { //No input, Some output
		System.out.println("PQR Method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	//return type = String
	public String qa() { //No input, some output
		System.out.println("qa method");
		String s ="Selenium";
		
		return s;
	}
	
	//return type = int
	//x,y -- input parameter/argument
	public int division(int x, int y) {
		System.out.println("Division method");
		int d = x/y;
		
		return d;
	}
	
	

}
