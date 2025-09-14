package programs;

import java.util.Scanner;

public class Find_Number_In_2DArray {

	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a Number");
	    double num1=input1.nextDouble();
	    double l=0;
	    int r=0;
	    int i=0;
		double [][] array1= {{4,2,1},{3,5,7},{6,8,9}};
		for (r=0; r<array1.length;r++)
	    {
	   	    for(i=0;i<array1[r].length;i++) 
			{				 
	   	    	if (array1[r][i]==num1) {
					System.out.println(num1+" is in this Array at Index "+r+", "+i);
					l=array1[r][i];
					break;
				}
		    } 
		}
		if (l!=num1) {
			System.out.println(num1+" is not in this Array");
		}

	}

}
