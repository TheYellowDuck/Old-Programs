package programs;
import java.util.Scanner;
public class Convert_Negative_to_positive {
	public static void main(String[] args) {
	    int num1=1;
        while (num1>0) {
    	    Scanner input1=new Scanner(System.in);
            System.out.println("enter a negative number");
            num1=input1.nextInt();
            if (num1<0) {
        	    break;
            }
    	    System.out.println("This is Not What Was Asked.");
        }
        int num2=num1*-1;
        System.out.println(num2);
	}
}
