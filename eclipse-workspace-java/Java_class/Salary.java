package programs;

import java.util.Scanner;

class salclass {
	private double x;
	private double y;
	private double z;
	private String ans;
	private String ans2;
	private String ans3;
	public salclass(double x1, double y1, double z1) {
		x=x1;
		y=y1;
		z=z1;
	}
	public void calculate() {
		ans=String.format("%.2f", x*y*5);
		System.out.println("Weekly Pay: $"+ans);
	}
	public void OverTime() {
		ans2=String.format("%.2f", (x*1.5)*z);
		System.out.println("OverTime Pay: $"+ans2);
		ans3=String.format("%.2f", (x*y*5)+((x*1.5)*z));
		System.out.println("Total Pay: $"+ans3);
	}
}
public class Salary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Enter Your Hourly Pay Rate");
		double x=input.nextDouble();
		System.out.println("Enter Your Regular Hours/Day");
		double y=input.nextDouble();
		System.out.println("Enter Your Overtime Hours/Total");
		double z=input.nextDouble();
		salclass n1=new salclass(x, y, z);
		n1.calculate();
		n1.OverTime();
	}

}
