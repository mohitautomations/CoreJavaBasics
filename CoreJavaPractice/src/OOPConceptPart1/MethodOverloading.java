package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
			

	}
	
	public static void main(int p) {
		
	}
	
	public static void main(int q, int h) {
		
	}
	
	// we can overload main method also.
	// you can not create a method inside the method
	//duplicate method - i.e. same method with same number of arguments are not allowed
	
	
	//Method Overloading - when method name is same with different parameter within the same class.
	public void sum() { // 0 input parameter
		System.out.println("SUM Method--Zero param");
	}
	
	public void sum(double d) { // 1 input parameter
		System.out.println("SUM Method--Zero param");
	}
	
	public void sum(int i) { //1 input parameter
		System.out.println("Sum method -- 1 input parameter");
		System.out.println(i);
	}
	
	public void sum(int k, int n) {//2 input parameter
		System.out.println("Sum Method --- 1 input parameter");
		System.out.println(k+n);
	}
	

}
