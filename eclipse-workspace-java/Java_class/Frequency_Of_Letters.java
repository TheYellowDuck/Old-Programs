package programs;

import java.util.Scanner;

public class Frequency_Of_Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    num1=num1.toLowerCase();
	    char [] str=new char[num1.length()];
	    for (int m=0; m<num1.length(); m++) {
	    	str[m]=num1.charAt(m);
	    }
	    char l=0;
		boolean repeat=true;
		while (repeat) {
			repeat=false;
		    for (int r=0; r<str.length-1; r++) {
			    if (str[r]>str[r+1]) {
		    	    l=str[r+1];
				    str[r+1]=str[r];
	                str[r]=l;
	                repeat=true;
			    }
		    }
		}
		int stop[]=new int[256];
	    int count[]=new int[256]; 
        for (int i=0; i<str.length; i++) {
        	count[str[i]]++; 
        }
        for (int i=0; i<str.length; i++) {
        	if (stop[str[i]]==0) {
        		System.out.println(str[i]+": "+count[str[i]]);
        		stop[str[i]]++;
        	}
        }
	}

}
