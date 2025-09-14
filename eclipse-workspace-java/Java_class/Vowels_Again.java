package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Vowels_Again {
	static String myMethod(String num1) {
	    int[] count=new int[256];
	    num1=num1.toLowerCase();
	    ArrayList<Character> str=new ArrayList<Character>();
	    str.add('a');
	    str.add('e');
	    str.add('i');
	    str.add('o');
	    str.add('u');
	    for (int i=0; i<str.size(); i++) {
	    	if (num1.charAt(i)=='a' || num1.charAt(i)=='e' || num1.charAt(i)=='i' || num1.charAt(i)=='o' || num1.charAt(i)=='u') {
	    		count[str.get(str.indexOf(num1.charAt(i)))]++; 
	    	}
        }
	    return str.get(0)+": "+count[str.get(0)]+"\n"+str.get(1)+": "+count[str.get(1)]+"\n"+str.get(2)+": "+count[str.get(2)]+"\n"+str.get(3)+": "+count[str.get(3)]+"\n"+str.get(4)+": "+count[str.get(4)];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    String output=myMethod(num1);
	    System.out.println(output);
	}

}
