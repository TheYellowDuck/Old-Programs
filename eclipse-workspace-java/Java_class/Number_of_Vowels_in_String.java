package programs;

import java.util.Scanner;

public class Number_of_Vowels_in_String {

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
	    int count[] = new int[256]; 
        int len = str.length; 
        for (int i = 0; i < len; i++) {
        	if (str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u') {	
        		count[str[i]]++; 
        	}
        }
        for (int i = 0; i < len; i++) { 
        	if (str[i]=='a' && stop[str[i]]<1) {
          		System.out.println("a "+count[str[i]]);
          		stop[str[i]]++;
        	}
          	if (str[i]=='e' && stop[str[i]]<1) {
              	System.out.println("e "+count[str[i]]);
              	stop[str[i]]++;
          	}
          	if (str[i]=='i' && stop[str[i]]<1) {
              	System.out.println("i "+count[str[i]]);
              	stop[str[i]]++;
          	}
          	if (str[i]=='o' && stop[str[i]]<1) {
              	System.out.println("o "+count[str[i]]);
              	stop[str[i]]++;
          	}
          	if (str[i]=='u' && stop[str[i]]<1) {
               	System.out.println("u "+count[str[i]]);
               	stop[str[i]]++;
          	}
        }
	}

}
