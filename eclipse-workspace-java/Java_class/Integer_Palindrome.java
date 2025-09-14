package programs;

import java.util.Scanner;

public class Integer_Palindrome {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    input1.close();
	    int a=0;
	    int num3=num1;
	    while (num3>0){
	      int num2=num3%10;
	      num3=num3/10;
	      a=(a*10)+num2;
	    }
	    if (num1==a) {
	    	System.out.println(num1+" is a Palindrome");
	    }
	    else {
	    	System.out.println(num1+" is not a Palindrome");
	    }
	}
}
