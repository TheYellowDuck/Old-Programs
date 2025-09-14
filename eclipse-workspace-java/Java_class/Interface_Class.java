package programs;

interface Animal4 {
	public abstract void animalSound();
	public void sleep();
}



class Pig3 implements Animal4 {
	public void animalSound() {
		System.out.println("The Pig Says: Wee Wee");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
	
}

public class Interface_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig3 pig=new Pig3();
		pig.animalSound();
		pig.sleep();
	}

}
