package programs;

import java.util.Scanner;

public class Sub_Array_with_Sum_of_GivenNumber {
	public static void main(String[] args){
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter the Number of Numbers In The Array.");
	    int num1=input1.nextInt();
		int [] array1=new int[num1];
		System.out.println("Enter All The Numbers In The Array");
		for (int n=0; n<num1; n++) {
			array1[n]=input1.nextInt();
		}
		System.out.println("Enter The Desired Sum");
	    int num2=input1.nextInt();
	    int m=0;
	    boolean output=true;
	    if (output) {
	    	output=false;
	        for (int i=0; i<array1.length-3; i++) {
                m=array1[i]+array1[i+1]+array1[i+2];
            	if (m==num2) {
            		System.out.println(array1[i]+", "+array1[i+1]+", "+array1[i+2]);
            		output=true;
            	}
            }
	    }
	}
}
