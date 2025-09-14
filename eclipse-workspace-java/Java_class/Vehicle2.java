package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class vehicleclass2{ static //this is the super class
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	public abstract void type();
	public static int Print() throws NumberFormatException, IOException {
		System.out.println("Choose One Of The Following: ");
		System.out.println("	1•	Car");
		System.out.println("	2•	Truck");
		System.out.println("	3•	Minivan");
		return Integer.parseInt(input.readLine());
	}   
}
class CarClass2 extends vehicleclass2 { //this is the sub class
	public void type() {
		System.out.println("	1•	Car");
		System.out.println("		•	Koenigsegg CCXR Trevita");
		System.out.println("		•	Lamborghini Veneno");
		System.out.println("		•	W Motors Lykan Hypersport");
	} 
}
class Truck2 extends vehicleclass2 { //this is the sub class
	public void type() {
		System.out.println("	2•	Truck");
		System.out.println("		•	Ford Super D F-450 Platinum");
		System.out.println("		•	Ford F-150 Platinum Super Cab");
		System.out.println("		•	GMC Sierra 3500 Denali HD");
	}  
}
class Minivan2 extends vehicleclass2 { //this is the sub class
	public void type() {
		System.out.println("	3•	Minivan");
		System.out.println("		•	Honda Odyssey");
		System.out.println("		•	Dodge Grand Caravan");
		System.out.println("		•	Toyota Sienna");
	}  
}

public class Vehicle2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		CarClass2 c1=new CarClass2();
		Truck2 t1=new Truck2();
		Minivan2 m1=new Minivan2();
		int x=vehicleclass2.Print();
		switch (x) {
		case 2:
			t1.type();
			break;
		case 3:
			m1.type();
			break;
		default:
			c1.type();	
		}
	}

}