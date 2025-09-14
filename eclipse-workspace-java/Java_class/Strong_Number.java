package programs;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Integer.");
	    int num1=input1.nextInt();
	    int num2=num1;
	    int num3=num1;
	    int l=0;
	    for (l=0; num2>0; l++) {
	    	num2=num2/10;
	    }
	    int[] array1=new int[l];
	    for (int i=array1.length-1; i>=0; i--) {
	    	array1[i]=num3%10;
	    	num3=num3/10;
	    }
	    int ans=0;
	    int sum[]=new int[256];
	    for (int i=0; i<array1.length; i++) {
	    	sum[array1[i]]=1;
	    	for (int j=1; j<=array1[i]; j++) {
	    		sum[array1[i]]=sum[array1[i]]*j;
	    	}
	    	ans=ans+sum[array1[i]];
	    }
	    if (num1==ans) {
	    	System.out.println(num1+" Is a Strong Number");
	    }
	    else {
	    	System.out.println(num1+" Is Not a Strong Number");
	    }
	}

}
