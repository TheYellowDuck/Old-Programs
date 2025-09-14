package programs;

import java.util.Scanner;

public class Nterms_of_1_11_111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    int sum=0;
	    int one=0;
	    for (int i=0; i<num1; i++) {
	    	one=(one*10)+1;
	    	sum=sum+one;
	    	System.out.println(one);
	    }
	    System.out.println(sum);
	}

}
