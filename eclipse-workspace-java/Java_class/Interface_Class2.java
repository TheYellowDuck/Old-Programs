package programs;

interface FirstInterface {
	public void myMethod();
}

interface SecondInterface {
	public void myOtherMethod();
}

class Demo_Class implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Some Text...");
	}
	public void myOtherMethod() {
		System.out.println("Some Other Text...");
	}
	
}

public class Interface_Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_Class d=new Demo_Class();
		d.myMethod();
		d.myOtherMethod();;
	}

}
