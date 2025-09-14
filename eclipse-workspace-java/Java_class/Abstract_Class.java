package programs;

abstract class Animal3 {// 1st parent class
	public abstract void animalSound();
	public void sleep() {
		System.out.println("Zzz");
	}
}

interface Zoo{//2nd parent class
}

class Pig2 extends Animal3 implements Zoo { //extends can only take one parent //multiple inheritance // that is th reason that we use interface
	public void animalSound() {
		System.out.println("The Pig Says: Wee Wee");
	}
	
}

public class Abstract_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal3 a1=new Animal3();
		Pig2 pig=new Pig2();
		pig.animalSound();
		pig.sleep();
	}

}
