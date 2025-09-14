package programs;

import java.util.Scanner;

public class Method_Sum_Of_Digits {
	static int myMethod(int num1) {
		int sum=0;
	    while (num1>0){ 
	      sum=sum+num1%10;
	      num1=num1/10;
	    } 
	    return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    int num1=input1.nextInt();
	    int output=myMethod(num1);
	    System.out.println(output);
	}

}
