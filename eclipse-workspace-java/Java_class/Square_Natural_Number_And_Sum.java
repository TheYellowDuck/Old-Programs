package programs;

import java.util.Scanner;
import java.math.*;

public class Square_Natural_Number_And_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    int square=0;
	    int sum=0;
	    for (int i=1; i<=num1; i++) {
	    	square=(int) Math.pow(i, 2);
	    	sum=sum+square;
	    	System.out.println(square);
	    }
	    System.out.println(sum);
	}

}
