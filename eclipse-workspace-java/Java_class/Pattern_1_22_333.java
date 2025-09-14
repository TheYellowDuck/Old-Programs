package programs;

import java.util.Scanner;

public class Pattern_1_22_333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    input1.close();
	    for (int i=1; i<=num1; i++){
	        for (int ii=1; ii<=i; ii++){
	        	System.out.print(i+" ");
	        }
	        System.out.println();
	    }
	}

}
