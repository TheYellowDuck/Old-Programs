package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Binary_Or_Not {
	static String myMethod(int x) {
		ArrayList<Integer> chart=new ArrayList<Integer>();
		boolean binary=true;
		int n=x;
		int m=0;
		int j=1;
		int count=1;
		int count2=0;
		int ans=x;
		int length=0;
		while (n>0) {
			binary=false;
			m=n%10;
			n=n/10;
			if (m==0 || m==1) {
				binary=true;
				length++;
			}
		}
		n=x;
		m=0;
		if (binary==true) {
			ans=0;
			while (count<=length) {
				chart.add(j);
				j=j*2;
				count++;
			}
			while (n>0) {
				m=n%10;
				n=n/10;
				if (m==1) {
					ans=ans+chart.get(count2);
				}
				count2++;
			}
		}
		return binary+" "+ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Number.");
	    int x=input1.nextInt();
	    String output=myMethod(x);
	    System.out.println(output);
	}

}
