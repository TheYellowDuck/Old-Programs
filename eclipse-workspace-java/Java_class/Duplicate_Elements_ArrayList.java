package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate_Elements_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> arraylist1=new ArrayList<Character>();
		Scanner input1=new Scanner(System.in);
        System.out.println("Enter a String");
        String num1=input1.nextLine();
        num1=num1.toLowerCase();
        int[] count=new int[256];
        for(int i=0; i<num1.length(); i++) {
            count[num1.charAt(i)]++;
        } 
        for (int i=0; i<num1.length(); i++) {
        	if(count[num1.charAt(i)]==1) {
        		System.out.print(num1.charAt(i));
        	}
        	count[num1.charAt(i)]++;
        } 
        for(int i=0; i<arraylist1.size(); i++) {
            System.out.print(arraylist1.get(i));
        } 
	}

}
