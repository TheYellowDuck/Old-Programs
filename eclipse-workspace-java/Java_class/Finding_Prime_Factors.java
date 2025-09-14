package programs;
import java.util.Scanner;
public class Finding_Prime_Factors {
	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter A Number");
	    int num1=input1.nextInt();
	    while (num1%2==0) {
	      System.out.println(2);
	      num1=num1/2;
	    }
	    for (int i=3; i<=num1; i+=2) {
	    	while (num1%i==0) {
	    		System.out.println(i);
	    		num1/=i;
	    	}
	    }
	    if (num1>2) {
	    	System.out.println(num1);
	    }
     }
}