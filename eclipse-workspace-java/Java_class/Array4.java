package programs;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args){
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a Number");
	    double num1=input1.nextDouble();
	    int r=0;
	    double l=0;
		double [] array1= {4,2,1,3,5,7,6,8,9};
		for (r=0; r<array1.length; r++) {
			l=array1[r];
			if (array1[r]==num1) {
				System.out.println(num1+" is in this Array at Index "+r);
				break;
			}
			
		}
		if (l!=num1) {
			System.out.println(num1+" is not in this Array");
		}
	}
}