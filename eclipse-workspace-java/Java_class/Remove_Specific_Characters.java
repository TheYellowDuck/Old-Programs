package programs;

import java.util.Scanner;
import java.util.ArrayList;

public class Remove_Specific_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist1=new ArrayList<String>();
		ArrayList<String> arraylist2=new ArrayList<String>();
		ArrayList<Integer> arraylist3=new ArrayList<Integer>();
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter Anything");
	    String num1=input1.nextLine();
	    String[] a=num1.split("");
	    for (int i=0; i<a.length; i++) {
	    	a[i]=a[i].toLowerCase();
	    	arraylist1.add(a[i]);
	    }
	    String[] b=num1.split("");
	    for (int i=0; i<b.length; i++) {
	    	arraylist2.add(b[i]);
	    }
	    System.out.println("Enter Anything");
	    String num2=input1.nextLine();
	    num2=num2.toLowerCase();
	    String[] array2=num2.split("");
	    for (int i=0; i<array2.length; i++) {
	    	for (int j=0; j<arraylist1.size(); j++) {
	    		if (array2[i].contentEquals(arraylist1.get(j))) {
	    			arraylist2.set(j, "");
	    		}
	    	}
	    }
	    for (int i=0; i<arraylist2.size(); i++) {
        	System.out.print(arraylist2.get(i));
        }
	}

}
