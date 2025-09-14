package programs;
import java.util.Scanner;
public class A_to_the_power_of_B {
	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter A Number");
	    int num1=input1.nextInt();
	    Scanner input2=new Scanner(System.in);
	    System.out.println("Enter Another Number");
	    int num2=input2.nextInt();
	    int i=0;
	    int sum=1;
	    while (i<num2){
	      sum=sum*num1;
	      i++;
	     }
	    System.out.println(sum);
	}
}
