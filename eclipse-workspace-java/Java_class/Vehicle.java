package programs;

class vehicleclass{ //this is the super class
	public void Print() {
		System.out.println("Vehicle: a thing used for transporting people or goods, especially on land.");
		System.out.println("	•	Car");
		System.out.println("	•	Truck");
		System.out.println("	•	Minivan");
	}   
}
class CarClass extends vehicleclass { //this is the sub class
	public void Print() {
		System.out.println("	Car: a road vehicle, typically with four wheels, powered by an internal combustion engine and able to carry a small number of people.");
		System.out.println("		•	Koenigsegg CCXR Trevita");
		System.out.println("		•	Lamborghini Veneno");
		System.out.println("		•	W Motors Lykan Hypersport");
	} 
}
class Truck extends vehicleclass { //this is the sub class
	public void Print() {
		System.out.println("	Truck: a large, heavy motor vehicle used for transporting goods, materials, or troops.");
		System.out.println("		•	Ford Super D F-450 Platinum");
		System.out.println("		•	Ford F-150 Platinum Super Cab");
		System.out.println("		•	GMC Sierra 3500 Denali HD");
	}  
}
class Minivan extends vehicleclass { //this is the sub class
	public void Print() {
		System.out.println("	Minivan: a small van, typically one fitted with seats in the back for passengers.");
		System.out.println("		•	Honda Odyssey");
		System.out.println("		•	Dodge Grand Caravan");
		System.out.println("		•	Toyota Sienna");
	}  
}
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicleclass v1= new vehicleclass();
		v1.Print();
		CarClass c1=new CarClass();
		c1.Print();
		Truck t1=new Truck();
		t1.Print();
		Minivan m1=new Minivan();
		m1.Print();
	}

}