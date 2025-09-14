package programs;

import java.util.Scanner;

public class Sort_Array {
	public static void main(String[] args){
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter the Number of Numbers In The Array.");
	    int num1=input1.nextInt();
		int [] array1=new int[num1];
		System.out.println("Enter All The Numbers In The Array");
		for (int n=0; n<num1; n++) {
			array1[n]=input1.nextInt();
		}
		int l=0;
		boolean flag=true;
		while (flag) {
			flag=false;
		    for (int r=0; r<array1.length-1; r++) {
			    if (array1[r]>array1[r+1]) {
		    	    l=array1[r+1];
				    array1[r+1]=array1[r];
	                array1[r]=l;
	                flag=true;
			    }
		    }
		}
		for (int i:array1) {
			System.out.println(i);
		}
	}
}
