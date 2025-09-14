package programs;

import java.util.Scanner;

public class Decimal_To_Binary_Octal_Hexadecimal {
	static String myMethod(int x) {
		int b=x;
		int o=x;
		int h=x;
		int br=0;
		int or=0;
		String hr="";
		int bcount=1;
		int ocount=1;
		int hh=0;
		String hhh=null;
		while (b>0) {
			br=br+((b%2)*bcount);
		    b=b/2;
		    bcount=bcount*10;
		}
		while (o>0) {
			or=or+((o%8)*ocount);
		    o=o/8;
		    ocount=ocount*10;
		}
		while (h>0) {
			hh=h%16;
			switch (hh) {
			case 0:
				hhh="0";
				break;
			case 1:
				hhh="1";
				break;
			case 2:
				hhh="2";
				break;
			case 3:
				hhh="3";
				break;
			case 4:
				hhh="4";
				break;
			case 5:
				hhh="5";
				break;
			case 6:
				hhh="6";
				break;
			case 7:
				hhh="7";
				break;
			case 8:
				hhh="8";
				break;
			case 9:
				hhh="9";
				break;
			case 10:
				hhh="A";
				break;
			case 11:
				hhh="B";
				break;
			case 12:
				hhh="C";
				break;
			case 13:
				hhh="D";
				break;
			case 14:
				hhh="E";
				break;
			case 15:
				hhh="F";
				break;
			}
			hr=hhh.concat(hr);
		    h=h/16;
		}
		return "Binary: "+br+"\nOctal: "+or+"\nHexadecimal: "+hr;
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
