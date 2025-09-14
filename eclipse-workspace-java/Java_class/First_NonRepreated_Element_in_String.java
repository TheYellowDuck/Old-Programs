package programs;

import java.util.Scanner;

public class First_NonRepreated_Element_in_String {

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
	    int count[] = new int[256]; 
        int len = str.length; 
        for (int i = 0; i < len; i++) 
            count[str[i]]++; 
        for (int i = 0; i < len; i++) { 
            if (count[str[i]]==1) {
                System.out.println(num2.charAt(i));
                flag=true;
                break;
            }
        }
        if (flag==false) {
        	System.out.println("All The Letters Have a Duplicate");
        }
	}
}
