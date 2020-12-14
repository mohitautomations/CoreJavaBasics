package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//Static Polymorphism -- Compile time polymorphism
		Bmw b = new Bmw();
		b.Start();
		b.stop();
		b.refuel();
		b.TheftSafety();
		b.engine();
		
		System.out.println("**********");
		
		Car c = new Car();
		c.Start();
		c.stop();
		c.refuel();
		
		System.out.println("**********");
		
		//Top Casting
		Car c1 = new Bmw(); //Child Class Object can be referred by parent class reference variable -- 
							//Dynamic Polymorphism --Run-time Polymorphism
		
		c1.Start();
		c1.stop();
		c1.refuel();
		
		//Down Casting
		Bmw b1 = (Bmw)new Car(); //ClassCastException
		
		
		
		

	}

}
