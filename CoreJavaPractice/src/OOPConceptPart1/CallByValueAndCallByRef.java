package OOPConceptPart1;

public class CallByValueAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x = 10;
		int y = 20;
		int o = obj.testSum(x, y); // Call by Value OR Pass by Value
		System.out.println(o);
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		//After Swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		
	}
	
	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;		
	}
	
	//Call by Ref
	public void swap(CallByValueAndCallByRef t) {
		int temp = t.p; //temp=50
		t.p= t.q; // t.p = 60
		t.q= temp; // t.q = 50
		
	}

}
