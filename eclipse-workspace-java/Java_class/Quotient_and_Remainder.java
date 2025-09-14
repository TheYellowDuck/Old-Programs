package programs;

import java.util.Scanner;

public class Quotient_and_Remainder {
	public static void main(String[]  args) {
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter the Number.");
	    int num1=input1.nextInt();
		System.out.println("Enter the Divisor.");
	    int num2=input1.nextInt();
	    int quotient=num1/num2;
	    int remainder=num1%num2;
	    System.out.println("Value of quotient is "+quotient);
	    System.out.println("Value of remainder is "+remainder);
	  }
}
