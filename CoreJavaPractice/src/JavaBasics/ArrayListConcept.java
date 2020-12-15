package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println("Size of Array: "+ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println("Size of Array: "+ar.size());
		
		ar.add("TOM");//5
		ar.add("Hello");//6
		ar.add(22.23);//7
		ar.add('M');//8
		
		System.out.println("Size of Array: "+ar.size());
		
		System.out.println("Array Value: "+ar.get(4));
		
		
		//To Print all the value of ArrayList: For Loop
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}
