package programs;

import java.util.Scanner;

public class Reverse_Words_Of_String {
	static String[] myMethod(String x) {
		String[] str=x.split(" ");
		for (int a=0; a<str.length; a++) {
			char [] array1=new char[str[a].length()];
		    for (int n=0; n<str[a].length(); n++) {
				array1[n]=str[a].charAt(n);
			}
		    int n=0;
		    char m=0;
		    int i=array1.length-1;
		    int j=0;
		    while (n<str[a].length()/2) {
		    	m=array1[j];
				array1[j]=array1[i];
				array1[i]=m;
				n++;
				j++;
				i--;
		    }
		    StringBuffer sb = new StringBuffer();
		      for(int f=0; f<array1.length; f++) {
		         sb.append(array1[f]);
		      }
		      String toreturn=sb.toString();
		      str[a]=toreturn;
		}
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your String.");
	    String x=input1.nextLine();
	    String[] output=myMethod(x);
	    for (int i=0; i<output.length; i++) {
			System.out.print(output[i]+" ");
		}
	}

}
