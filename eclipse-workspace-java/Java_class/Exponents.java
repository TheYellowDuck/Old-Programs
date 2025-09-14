package programs;

import java.util.Scanner;

class expo {
	private int x;
	public expo(int x1) {
		x=x1;
	}
	public int square() {
		return x*x;
	}
	public String cube() {
		return "cubed: "+x*x*x;
	}
	public String cube2() {
		return "cubed: "+square()*x;
	}
}
public class Exponents {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Enter Your Number");
		int x=input.nextInt();
		expo n1=new expo(x);
		System.out.println("Squared: "+n1.square());
		System.out.println(n1.cube());
		System.out.println(n1.cube2());
	}

}
