package programs;

import java.util.Scanner;

public class Finding_Leaders_In_Array {
	public static void main(String[] args){
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter the Number of Numbers In The Array.");
	    int num1=input1.nextInt();
		int [] array1=new int[num1];
		System.out.println("Enter All The Numbers In The Array");
		for (int n=0; n<num1; n++) {
			array1[n]=input1.nextInt();
		}
		int j=1;
		int i=2;
		int m=array1.length-1;
		int l=array1.length-2;
		System.out.println("The Leaders of This Array Are:"+"\n"+array1[m]);
		while (l>=0) {
			m=array1.length-j;
			l=array1.length-i;
		    if (array1[l]>array1[m]) {
		    	System.out.println(array1[l]);
		    	j++;
		    	i++;
		    }
		    m=l+1;
		    while (array1[l]<=array1[m] && i<array1.length-1) {
		    	m=array1.length-j;
				l=array1.length-i;
		    	i++;
		    }
		}
	}
}
