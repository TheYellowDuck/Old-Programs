package programs;

import java.util.Scanner;

public class Cube_Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    System.out.println("Input the Number of Terms: "+num1);
	    int cube=0;
	    for (int i=1; i<=num1; i++) {
	    	cube=(int) Math.pow(i, 3);
	    	System.out.println("Number is: "+i+" and the cube of "+i+" is: "+cube);
	    }
	}

}
