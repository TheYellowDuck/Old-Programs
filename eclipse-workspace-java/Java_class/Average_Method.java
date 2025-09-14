package programs;

import java.util.Scanner;

public class Average_Method {
	static double myMethod(double x, double y, double z) {
	    return (x+y+z)/3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your First Number.");
	    double x=input1.nextDouble();
	    System.out.println("Please Enter Your Second Number.");
	    double y=input1.nextDouble();
	    System.out.println("Please Enter Your Third Number.");
	    double z=input1.nextDouble();
	    double output=myMethod(x, y, z);
	    System.out.println("The Average is: "+output);
	}

}
