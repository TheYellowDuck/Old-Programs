package programs;

import java.util.Scanner;

public class Least_Common_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter any Integer.");
	    int num1=input1.nextInt();
	    System.out.println("Enter any Integer.");
	    int num2=input1.nextInt();
	    int ans=0;
	    int b=0;
	    if (num1>num2) {
	    	int a=num1%num2;
	    	while(a!=0) {
	    		b=a;
	    		a=num1%a;
	    	}
	    	ans=(num1*num2)/b;
		    System.out.println("LCM="+ans);
	    }
	    else if (num1==num2) {
	    	System.out.println("LCM="+num1);
	    }
	    else {
	    	int a=num2%num1;
	    	while(a!=0) {
	    		b=a;
	    		a=num1%a;
	    	}
	    	ans=(num1*num2)/b;
	    	System.out.println("LCM="+ans);
	    }
	}
}
