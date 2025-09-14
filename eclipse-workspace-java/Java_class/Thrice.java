package programs;

import java.util.Scanner;

public class Thrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Number.");
	    int num1=input1.nextInt();
	    System.out.println("Enter a any Number.");
	    int num2=input1.nextInt();
	    System.out.println("Enter a any Number.");
	    int num3=input1.nextInt();
	    if (num1==num2 && num2==num3) {
	    	System.out.println(num1*9);
	    }
	    else {
	    	System.out.println(num1+num2+num3);
	    }
	}

}
