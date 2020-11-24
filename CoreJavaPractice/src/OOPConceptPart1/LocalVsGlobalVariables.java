package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	//Global Variable -- Class variable
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		
		int i = 10; // Local Variable
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		System.out.println(i);
		int i1 = obj.sum();
		System.out.println(i1);
		

	}
	
	public int sum() {
		
		int i = 15;
		return i;
		
	}

}
