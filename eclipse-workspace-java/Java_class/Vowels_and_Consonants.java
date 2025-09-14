package programs;

import java.util.Scanner;

public class Vowels_and_Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    String num=num1;
	    num1=num1.toUpperCase();
	    int [] str=new int[num1.length()];
	    int [] ascii=new int[num1.length()];
	    for (int m=0; m<num1.length(); m++) {
	    	ascii[m]=num1.charAt(m);
	    	str[m]=(int)ascii[m];
	    }
	    int l=0;
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
	    int count=0;
	    int count2=0;
        int len = str.length; 
        for (int i = 0; i < len; i++) {
        	if (str[i]==65 || str[i]==69 || str[i]==73 || str[i]==79 || str[i]==85) {	
        		count++; 
        	}
        	else if ((str[i]>=0 && str[i]<=44) || (str[i]>=58 && str[i]<=64) || str[i]>=91) {
        		count2++;
        	}
        }
        int num2=num.length()-count2-count;
        System.out.println("There are "+count+" vowels and "+num2+" consonants in "+num);
	}

}
