package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: to store similar data type in a array variable
		
		//1. int array:
		//Lowest bound/index = 0
		//Upper bound/index = n-1 (n is size of array)
		//one die array
		
		//dis-advantage of array:
		//1. size is fixed -- Static Array
		//2. store only similar Data types -- to overcome of this problem, we use object array
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		System.out.println(i.length);
		
		//print all the values of array: use for loop
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//double
		double d[] = new double[2];
		d[0] = 12.12;
		d[1] = 11.00;
		
		//char
		char c[] = new char[2];
		c[0] = 't';
		c[1] = 'f';
		
		//boolean
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//String
		String s[] = new String[2];
		s[0] = "Hello";
		s[1] = "World";
		
		
		//Object Array: (Object is Class) -- is used to store different data type values
		
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/2020";
		ob[4] = 'M';
		ob[5] = "London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		
		for(int k=0;k<ob.length;k++) {
			System.out.println(ob[k]);
		}
		
	}

}
