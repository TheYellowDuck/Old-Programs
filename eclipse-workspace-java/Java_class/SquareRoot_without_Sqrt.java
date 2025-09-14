package programs;
import java.util.Scanner;
public class SquareRoot_without_Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter any Number.");
	    double num1=input1.nextDouble();
	    double a=0;
	    for (a=0; a<=num1; a++) {
	    	if (num1/a==a) {
	    		System.out.println("The Square Root of "+num1+"~="+"\n"+a);
	    		if (num1/(-a)==-a) {
	    			System.out.println(-a);
	    		}
	    		break;
	    	}
	    }
	}

}
