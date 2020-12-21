package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("i", "100");
		h.put(1, "200");
		h.put("k", "Hello");
		
		System.out.println(h.size());
		
		System.out.println(h.get("k"));
		System.out.println(h.get(1));
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1, 1000);
		//h1.put("A", "Atom");
		
		System.out.println(h1.get(1));
		
		System.out.println();
		for (int j=0;j<h.size();j++) {
			System.out.println(h.get(j));
			
		}
		
				
		

	}

}
