package programs;

import java.util.Scanner;

public class TwoDices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while (i==0){
			System.out.println("Enter any Number To Proceed");
			Scanner input1=new Scanner(System.in);
			double num1=input1.nextDouble();
			if (num1!=0) {
				System.out.println((int)(Math.random()*6)+1);
				System.out.println((int)(Math.random()*6)+1);
			}
		}
	}	
}

