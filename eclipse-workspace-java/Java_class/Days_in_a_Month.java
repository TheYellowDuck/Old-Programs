package programs;
import java.util.Scanner;
public class Days_in_a_Month {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a Year.");
	    int year=input1.nextInt();
	    Scanner input2=new Scanner(System.in);
	    System.out.println("Enter a Month.");
	    String num1=input2.nextLine();
	    input1.close();
	    input2.close();
	    switch (num1){
	      case "january":
	      System.out.println("31");
	      break;
	      case "february":
	      if ((year%4==0)&&(year%100!=0)||(year%400==0)){
	        System.out.println("29");
	      }
	      else{
	        System.out.println("28");
	      }
	      break;
	      case "march":
	      System.out.println("31");
	      break;
	      case "april":
	      System.out.println("30");
	      break;
	      case "may":
	      System.out.println("31");
	      break;
	      case "june":
	      System.out.println("30");
	      break;
	      case "july":
	      System.out.println("31");
	      break;
	      case "august":
	      System.out.println("31");
	      break;
	      case "september":
	      System.out.println("30");
	      break;
	      case "october":
	      System.out.println("31");
	      break;
	      case "novemeber":
	      System.out.println("30");
	      break;
	      case "december":
	      System.out.println("31");
	      break;
	      case "January":
	      System.out.println("31");
	      break;
	      case "February":
	      if ((year%4==0)&&(year%100!=0)||(year%400==0)){
	        System.out.println("29");
	      }
	      else{
	        System.out.println("28");
	      }
	      break;
	      case "March":
	      System.out.println("31");
	      break;
	      case "April":
	      System.out.println("30");
	      break;
	      case "May":
	      System.out.println("31");
	      break;
	      case "June":
	      System.out.println("30");
	      break;
	      case "July":
	      System.out.println("31");
	      break;
	      case "August":
	      System.out.println("31");
	      break;
	      case "September":
	      System.out.println("30");
	      break;
	      case "October":
	      System.out.println("31");
	      break;
	      case "Novemeber":
	      System.out.println("30");
	      break;
	      case "December":
	      System.out.println("31");
	      break;
	      case "1":
	      System.out.println("31");
	      break;
	      case "2":
	      if ((year%4==0)&&(year%100!=0)||(year%400==0)){
	        System.out.println("29");
	      }
	      else{
	        System.out.println("28");
	      }
	      break;
	      case "3":
	      System.out.println("31");
	      break;
	      case "4":
	      System.out.println("30");
	      break;
	      case "5":
	      System.out.println("31");
	      break;
	      case "6":
	      System.out.println("30");
	      break;
	      case "7":
	      System.out.println("31");
	      break;
	      case "8":
	      System.out.println("31");
	      break;
	      case "9":
	      System.out.println("30");
	      break;
	      case "10":
	      System.out.println("31");
	      break;
	      case "11":
	      System.out.println("30");
	      break;
	      case "12":
	      System.out.println("31");
	      break;
	      default:
	      System.out.println("Not Valid");
	    }
	  }
}
