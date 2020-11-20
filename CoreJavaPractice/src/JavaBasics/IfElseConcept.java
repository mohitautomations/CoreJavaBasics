package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		
		int a = 30;
		int b = 20;
		
		if(b>a){
			System.out.println("B is greater than a ");
		}
		else {
			System.out.println("A is greater than B");
		}

		
		//Comparison Operator:
		//< > <= >= == !=
		
		
		int c = 40;
		int d = 50;
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		//write a login to find out the highest number
		
		int a1 = 400;
		int b1 = 500;
		int c1 = 300;
		
		//nested if condition
		
		if(a1>b1 & a1>c1) { // false & true = false
			System.out.println("a1 is greater");
		}
		else if(b1>c1) {
			System.out.println("b1 is greater");
		}
		else {
			System.out.println("c1 is greater");
		}
	}

}
