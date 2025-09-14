package programs;

import java.util.Scanner;

public class Reverse_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    String[] num2=num1.split(" ");
	    for (int r=num2.length-1; r>=0; r--) {
	    	System.out.print(num2[r]+" ");
        }
	}

}
