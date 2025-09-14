package programs;

import java.util.Scanner;

class intclass {
	private double x;
	private double y;
	private String ans;
	private double r;
	public intclass(double x1, double y1) {
		x=x1;
		y=y1;
		r=1.05;
	}
	public void calculate() {
		for (int i=0; i<y; i++) {
			x=x*r;
		}
		ans=String.format("%.2f", x);
		System.out.println("Total Money After "+y+" Years: $"+ans);
	}
}
public class Interest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Enter Your Starting Money");
		double x=input.nextDouble();
		System.out.println("Enter Your Amount of Years in the Investment");
		double y=input.nextDouble();
		intclass n1=new intclass(x, y);
		n1.calculate();
	}

}
