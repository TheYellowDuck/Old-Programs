package programs;

import java.util.Scanner;

public class First_Smaller_Number {
	static int myMethod(int x, int y) {
		boolean test=false;
		boolean contains=false;
		int i=0;
		int j=0;
		int n=0;
		for (i=x; test==false; i--) {
			j=i;
			test=true;
			contains=false;
			while (j>0) {
				n=j%10;
				j=j/10;
				if (n==y) {
					contains=true;
					test=false;
					break;
				}
			}
			if (contains==false) {
				test=true;
				break;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Number.");
	    int x=input1.nextInt();
	    System.out.println("Please Enter Your Number.");
	    int y=input1.nextInt();
	    int output=myMethod(x, y);
	    System.out.println(output);
	}

}
