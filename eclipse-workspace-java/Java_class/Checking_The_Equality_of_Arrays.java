package programs;

import java.util.Scanner;

public class Checking_The_Equality_of_Arrays {
	public static void main(String[] args){
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter the Number of Numbers In The Array.");
	    int num1=input1.nextInt();
		int [] array1=new int[num1];
		System.out.println("Enter All The Numbers In The Array");
		for (int i=0; i<num1; i++) {
			array1[i]=input1.nextInt();
		}
		System.out.println("Enter the Number of Numbers In The Second Array.");
	    int num2=input1.nextInt();
		int [] array2=new int[num2];
		System.out.println("Enter All The Numbers In The Second Array");
		for (int j=0; j<num2; j++) {
			array2[j]=input1.nextInt();
		}
		int n=0;
		int m=0;
		if (array1.length==array2.length) {
		    while (n<array1.length-1) {
			    if (array1[n]==array2[m]) {
			        while (n<array1.length-1) {
				        n++;
				        m++;
			        }
			    }
			    else {
				    System.out.println("These Arrays Are Not Equal");
			    }
		    }
		    if (array1[n]==array2[m]) {
		        System.out.println("These Arrays Are Equal");
		    }
		}
		else {
			System.out.println("These Arrays Are Not Equal");
		}
	}
}
