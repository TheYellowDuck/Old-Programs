package programs;
import java.util.Scanner;
public class Quadratic_Equation_Calculater {
	public static void main(String[] args){
		double num1=1; 
	    double num2=1; 
		double num3=1;
		while(num1!=0 || num2!=0 || num3!=0) {
	      System.out.println("X*num11*num11+Y*num11+Z");
	      Scanner input1=new Scanner(System.in);
	      System.out.println("enter a Number to Represent X");
	      num1=input1.nextDouble();
	      System.out.println("enter a Number to Represent Y");
	      num2=input1.nextDouble();
	      System.out.println("enter a Number to Represent Z");
	      num3=input1.nextDouble();
	      double num4=(num2*num2)+(-4*num1*num3);
	      if (num4<0){
	        double num12=-num4;
	        double num13=Math.sqrt(num12);
	        double num8=2*num1;
	        System.out.println("num11=");
	        System.out.println("(-"+num2+"+"+num13+"*i)/"+num8);
	        System.out.println("(-"+num2+"-"+num13+"*i)/"+num8);
	      }
	      if (num4>=0){ 
	        double num5=Math.sqrt(num4);
	        double num6=-num2+num5;
	        double num7=-num2-num5;
	        double num8=2*num1;
	        double num9=num6/num8;
	        double num10=num7/num8;
	        //num11 now equals both num9 and num10.
	        System.out.println("num11=");
	        System.out.println(num9);
	        System.out.println(num10); 
	        System.out.println("OR");
	        System.out.println(num6+"/"+num8);
	        System.out.println(num7+"/"+num8);
	      }
	    }
	}
}
