package programs;

class Animal2{ //this is the super class
	public void animalSound() {
		System.out.println("The Animal Makes a Sound!");
	}   
}
class Dog2 extends Animal2 { //this is the sub class
	public void animalSound() { // this function is rewritten or overwritten by Animal2
		super.animalSound(); // this is going to invoke my  super classmethod
		System.out.println("The Dog Says Bow Wow!");
	}  
}
public class SuperClass_Animal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d1=new Dog2();
		d1.animalSound();
	}

}