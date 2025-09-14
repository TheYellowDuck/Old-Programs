package programs;
import java.util.Scanner;
public class Prime_or_not{
	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter A Number(Can not be less than 2)");
	    int num1=input1.nextInt();
	    int i=1;
	    int num2=0;
	    while (i<num1){
	      if (num1==2) {
	    	  break;
	      }
	      num2=num1%i;
	      if (num2==0) {
	    	  break;
	      }
	      
	      i++;
	     }
	    if (num2!=0 || num1==2) {
	      System.out.println("This Is a Prime Number.");
	    }
	    if (num2==0) {
	      System.out.println("This is not a Prime Number");
	    }
	     
	}
}