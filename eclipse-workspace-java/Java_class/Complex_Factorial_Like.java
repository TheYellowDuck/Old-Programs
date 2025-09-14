package programs;

import java.util.Scanner;

public class Complex_Factorial_Like {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    int sum=0;
	    int chain=0;
	    for (int i=1; i<=num1; i++) {
	    	chain=(chain*10)+i;
	    	sum=sum+chain;
	    	System.out.println(chain);
	    }
	    System.out.println(sum);
	}

}
