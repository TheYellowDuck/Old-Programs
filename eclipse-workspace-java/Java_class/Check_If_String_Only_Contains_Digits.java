package programs;

import java.util.Scanner;

public class Check_If_String_Only_Contains_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    byte[] array1 = new byte[num1.length()];
	    for (int i = 0; i < array1.length; i++) {
	        array1[i] = (byte) num1.charAt(i);
	    }
	    boolean flag=false;
	    for (int m=0; m<num1.length(); m++) {
	    	flag=false;
	    	if (array1[m]<=57 && array1[m]>=44) {
	    		flag=true;
	   		}
	    	if (flag==false) {
	    		System.out.println(num1+" Does Not Contain Only Digits");
	    		break;
	    	}
	    }
	    if (flag==true) {
	    	System.out.println(num1+" Contains Only Digits");
	    }
	}

}
