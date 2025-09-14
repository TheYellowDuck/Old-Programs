package programs;

class Animal{ //this is the super class
	public void animalSound() {
		System.out.println("The Animal Makes a Sound!");
	}   
}
class Pig extends Animal { //this is the sub class
	public void animalSound() {
		System.out.println("The Pig Says Wee Wee!");
	}  
}
class Dog extends Animal { //this is the sub class
	public void animalSound() {
		System.out.println("The Dog Says Bow Wow!");
	}  
}
public class SuperClass_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal A1= new Animal();
		A1.animalSound();
		Dog d1=new Dog();
		d1.animalSound();
		Pig p1=new Pig();
		p1.animalSound();
	}

}
