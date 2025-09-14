package programs;

import java.util.Scanner;

public class Fifteen_To_Twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Number.");
	    int num1=input1.nextInt();
	    System.out.println("Enter a any Number.");
	    int num2=input1.nextInt();
	    if ((num1+num2)>=15 && (num1+num2)<=20) {
	    	System.out.println("20");
	    }
	    else {
	    	System.out.println(num1+num2);
	    }
	}

}
