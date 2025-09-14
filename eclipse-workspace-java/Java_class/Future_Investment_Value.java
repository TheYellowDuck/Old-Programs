package programs;

import java.util.Scanner;

public class Future_Investment_Value {
	static double myMethod(double num1, double num2, int num3) {
		num2=(num2/100)+1;
	    for (int i=0; i<num3; i++) {
	    	num1=num1*num2;
	    }
	    return num1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Amount Of Money.");
	    double num1=input1.nextInt();
	    System.out.println("Enter a any Intrest Rate.");
	    double num2=input1.nextInt();
	    System.out.println("Enter a any Number of Years.");
	    int num3=input1.nextInt();
	    double output=myMethod(num1, num2, num3);
	    System.out.println(output);
	}

}
