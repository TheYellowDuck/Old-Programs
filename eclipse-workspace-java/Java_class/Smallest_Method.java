package programs;

import java.util.Scanner;

public class Smallest_Method {
	static double myMethod(double x, double y, double z) {
	    if (x<y && x<z){
	    	return x;
	    }
	    else if (y<x && y<z){
	    	return y;
		}
	    else {
	    	return z;
		}
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
	    System.out.println(output);
	}

}
