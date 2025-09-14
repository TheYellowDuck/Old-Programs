package programs;

import java.util.Scanner;

class calclass {
	private int x;
	private int y;
	public calclass(int x1, int y1) {
		x=x1;
		y=y1;
	}
	public void calculate() {
		int ans=x/y;
		if (x%y!=0) {
			System.out.println("Quotient and Remainder: "+ans+" R "+x%y);
		}
		else {
			System.out.println("Quotient: "+ans);
		}
	}
}
public class Divide {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Enter Your Dividend");
		int x=input.nextInt();
		System.out.println("Enter The Divisor");
		int y=input.nextInt();
		calclass n1=new calclass(x, y);
		n1.calculate();
	}

}