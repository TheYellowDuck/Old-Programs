package programs;

class vehicle1{ //this is the super class
	protected String brand="Ford"; // brand is a parent variable
	public void honk() {
		System.out.println("Tuut, Tuut!");
	}   
	public void move() {
		System.out.println("The vehicle moves");
	}
}
class Car extends vehicle1 { //this is the sub class
	public String modelname="Mustang";
	public void Steer() {
		System.out.println("I can manouver the car");
	}
}

class SuperClass{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar=new Car();
		mycar.honk();
		mycar.move();
		mycar.Steer();
		System.out.println(mycar.brand+" "+mycar.modelname);
	}
}
