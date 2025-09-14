package programs;

import java.util.Scanner;

class disc {
	private double x;
	private double y;
	private double z;
	public disc(double x1, double y1, double z1) {
		x=x1;
		y=(y1/100)+1;
		z=(100-z1)/100;
	}
	public void calculate() {
		String ans=String.format("%.2f", (x*y)*z);
		System.out.println("Final Price: $"+ans);
	}
}
public class Discount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Enter The Original Price");
		double x=input.nextDouble();
		System.out.println("Enter The Salemans Commission in Percent (Example: 13)");
		double y=input.nextDouble();
		System.out.println("Enter The Discount in Percent (Example: 13)");
		double z=input.nextDouble();
		disc n1=new disc(x, y, z);
		n1.calculate();
	}

}
