package programs;

import java.util.Scanner;

public class Duplicate_and_Count {

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
	    boolean flag=false;
	    int stop[]=new int[256];
	    int count[] = new int[256]; 
        int len = str.length; 
        for (int i = 0; i < len; i++) 
            count[str[i]]++; 
        for (int i = 0; i < len; i++) { 
            if (count[str[i]]>1 && stop[str[i]]==0) {
                System.out.println(num2.charAt(i)+": "+count[str[i]]);
                stop[str[i]]++;
                flag=true;
            }
        }
        if (flag==false) {
        	System.out.println("The String Does Not Have a Duplicate");
        }
	}

}
