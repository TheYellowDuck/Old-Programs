package programs;
import java.util.Scanner;
public class Armstrong_number {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a End.");
	    int num1=input1.nextInt();
	    input1.close();
	    int i, j, l=0;
	    int m=0;
	    for (i=0; i<=num1; i++){
	      j=i;
	      int sum=0;
	      while (j!=0){
	        l=j%10;
	        sum=sum+(l*l*l);
	        j=j/10;
	      }
	      if (i==sum){
	        if (m==0){
	          System.out.println("Armstrong numbers from 0 to "+num1);
	        }
	        System.out.println(i);
	        m++;
	      }
	    }
	  }
}
