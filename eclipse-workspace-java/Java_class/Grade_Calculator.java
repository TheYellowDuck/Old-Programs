package programs;
import java.util.Scanner;
public class Grade_Calculator {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter Your Quiz Score Percentage.");
	    double num1=input1.nextDouble();
	    Scanner input2=new Scanner(System.in);
	    System.out.println("Enter Your Mid-Term Score Percentage.");
	    double num2=input2.nextDouble();
	    Scanner input3=new Scanner(System.in);
	    System.out.println("Enter Your Final Score Percentage.");
	    double num3=input3.nextDouble();
	    input1.close();
	    input2.close();
	    input3.close();
	    double grade=(num1+num2+num3)/3;
	    if (grade>=100){
	      System.out.println("A+");
	    }
	    else if (grade>=90 && grade<100){
	      System.out.println("A");
	    }
	    else if (grade>=70 && grade<90){
	      System.out.println("B");
	    }
	    else if (grade>=50 && grade<70){
	      System.out.println("C");
	    }
	    else{
	      System.out.println("F");
	    }
	  }
}
