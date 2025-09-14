package programs;

import java.util.Scanner;

public class Move_All_0_To_End_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Integer.");
	    String num1=input1.nextLine();
	    String[] arr=new String[num1.length()];
	    int z=arr.length-1;
	    String m="0";
	    arr=num1.split("");
	    for (int r=0; r<num1.length() && z>0; r++) {
	    	if (arr[r].contentEquals(m)) {
	    		{for (int i=r; i<arr.length-1; i++) {
	    			arr[i]=arr[i+1];
	    		}
	    		arr[z]=m;}
	    	}
		}
	    for (int x=0; x<num1.length(); x++) {
			System.out.print(arr[x]);
		}
	}

}
