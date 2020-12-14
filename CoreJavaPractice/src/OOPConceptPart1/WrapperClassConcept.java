package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//Data conversion: String to Int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean
		
		String y = "12.33";
		
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean:
		String k = "True";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Int to String Conversion:
		int j = 200;
		System.out.println(j+20);
		String s1 = String.valueOf(j);
		System.out.println(s1+20);
		
		
		String u = "100A";
		Integer.parseInt(u); //NumberFormatException -- for input string "100A"
		

	}

}
