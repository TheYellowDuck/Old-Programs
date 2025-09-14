package programs;

class AClass {
	public AClass() {
		System.out.println("In SuperClass Constructor.");
	}
	public AClass(int x) { //constructor overloading
		int y=x;
		System.out.println("I am in parent class\n" + y);
	}
}
class ASubClass extends AClass {// Constructor Overloading

	public ASubClass(int x) { 
		super(5); // Super is a reserved keyword to use in JAva // super invokes the constructor of the parent class which is 
	}
	public ASubClass() { //consturctor 1
		System.out.println("In SubClass Constructor.");
	}
	//public ASubClass(int z) { //constructor 2
//		int q=z;
//		System.out.println(q);
	//}
	public ASubClass(int r, int j, int y) {//constructor 3
		System.out.println(r);
		System.out.println(j);
	}
	
}
public class SuperClass_Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ASubClass child=new ASubClass();
		ASubClass child2=new ASubClass(5);
		//ASubClass child3=new ASubClass(5,10,15);
	}

}
