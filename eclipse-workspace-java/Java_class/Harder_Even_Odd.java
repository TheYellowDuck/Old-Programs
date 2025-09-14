package programs;

import java.util.Scanner;

public class Harder_Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter any Integer.");
	    int num1=input1.nextInt();
	    System.out.println("0 Neither Even or Odd");
	    for (int i=1; i<=num1; i++) {
	    	if (i%2==0) {
	    		System.out.println(i+" Even");
	    	}
	    	else {
	    		System.out.println(i+" Odd");
	    	}
	    }
	}
}
