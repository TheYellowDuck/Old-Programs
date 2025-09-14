package programs;

import java.util.Scanner;

public class Reverse_String_in_Place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    char [] array1=new char[num1.length()];
	    for (int n=0; n<num1.length(); n++) {
			array1[n]=num1.charAt(n);
		}
	    int n=0;
	    char m=0;
	    int i=array1.length-1;
	    int j=0;
	    while (n<num1.length()/2) {
	    	m=array1[j];
			array1[j]=array1[i];
			array1[i]=m;
			n++;
			j++;
			i--;
	    }
	    for (int r=0; r<array1.length; r++) {
			System.out.print(array1[r]);
		}
	}

}
