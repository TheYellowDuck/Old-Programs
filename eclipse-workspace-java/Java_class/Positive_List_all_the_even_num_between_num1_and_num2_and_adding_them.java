package programs;
import java.util.Scanner;
public class Positive_List_all_the_even_num_between_num1_and_num2_and_adding_them {
	public static void main(String[] args) {
	  int num1=-1;
	  int num2=0;
	  while (num1<0 || num2<num1){
	    Scanner input1=new Scanner(System.in);
        System.out.println("Enter Positve Integer.");
        num1=input1.nextInt();
        Scanner input2=new Scanner(System.in);
        System.out.println("Enter a larger Integer.");
        num2=input2.nextInt();
        if (num1>=0 && num2>num1){
          break;
        }
        System.out.println("That is Not What Was Asked");
      }
      if (num1>=0 && num2>num1){
        System.out.println("Answers Are Valid");
      }
      int i=num1;
      int j=0;
      int sum=0;    
      while (i<=num2){
        j=i%2;
        if (j==0){
          System.out.println(i);
          sum=sum+i;
        }
        i++;
      }
      System.out.println("="+sum);
    }
  }