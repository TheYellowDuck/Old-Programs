package programs;

import java.util.Scanner;

public class Without_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    String num2=num1;
	    num1=num1.toLowerCase();
	    char [] str=new char[num1.length()];
	    for (int m=0; m<num1.length(); m++) {
	    	str[m]=num1.charAt(m);
	    }
	    char [] str2=new char[num2.length()];
	    for (int m=0; m<num2.length(); m++) {
	    	str2[m]=num2.charAt(m);
	    }
	    int count[] = new int[256]; 
        int len = str.length; 
        for (int i = 0; i < len; i++) {
        	if(count[str[i]]==0) {
        		System.out.print(str2[i]);
        	}
        	count[str[i]]++;
        }     
	}
}
