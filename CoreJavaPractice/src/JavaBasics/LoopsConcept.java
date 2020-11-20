package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. While loop
		//dis-advantage of while loop: it will generate infinite loop if you don't give incremental/decremental part
		
		int i = 1; //initialization
		while(i<=10) { //Condition
			System.out.println(i);
			i=i+1; //incremental/decremental
		}
		
		System.out.println("**************");
		
		//2. For loop
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		System.out.println("*************");
		
		//desending order
		for(int k=10;k>=1;k--) {
			System.out.println(k);
		}
	}

}
