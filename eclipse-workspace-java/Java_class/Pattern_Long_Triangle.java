package programs;

import java.util.Scanner;

public class Pattern_Long_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Number.");
	    int a=input1.nextInt();
	    int b=(a+1)/2;
	    int c=a-b;
	    for (int i=0; i<b; i++) {
	    	for (int j=0; j<=i; j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    int d=c;
	    for (int i=0; i<c; i++) {
	    	for (int j=d; j>0; j--) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	d--;
	    }
	}

}
