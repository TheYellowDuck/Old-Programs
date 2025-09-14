package programs;

import java.util.Scanner;

public class Perfect_Numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input1=new Scanner(System.in);
	    System.out.println("Enter any Integer.");
	    int num1=input1.nextInt();*/
	    for (int num1=0;;num1++) {
	    	int sum=0;
			for(int i=1; i<num1; i++) {
				if (num1%i==0) {
					sum=sum+i;
				}
			}
			if (sum==num1) {
				System.out.println(num1+" is a Perfect Number");
			}
			/*else {
				System.out.println(num1+" is a Not Perfect Number");
			}*/
	    }
	}
}
