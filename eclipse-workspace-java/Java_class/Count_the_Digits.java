package programs;
import java.util.Scanner;
public class Count_the_Digits {
	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter A Number");
	    int num1=input1.nextInt();
	    int sum=0;
	    while (num1>0){
	      sum++;
	      num1=num1/10;
	    }
	    System.out.println(sum);
	  }
}
