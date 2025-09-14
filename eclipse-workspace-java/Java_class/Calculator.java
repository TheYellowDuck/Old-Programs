package programs;

import java.util.Scanner;

class Calculatorclass {
	static double add(double x, double y) {
		return x+y;
	}
	static double minus(double x, double y) {
		return x-y;
	}
	static double multiply(double x, double y) {
		return x*y;
	}
	static double divide(double x, double y) {
		return x/y;
	}
	static double pwr(double x, double y) {
		return Math.pow(x, y);
	}
	public double A, B;

    private static String[] operators = new String[] {"\\-","\\+","\\/","\\*","\\x","\\^","\\X"};
	public static String findSymbol(String nums) {

        for (String operator : operators) {
            if (nums.contains(operator)) {
                return operator;
            }
        }
        return "invalid input";
    }
	public static void input(String nums){
        String operator = findSymbol(nums);
        if (operator == null){
            System.out.println("Invalid input");

        }
        String[] split = nums.split(operator);
        int x=Integer.parseInt(split[0]);
        int y=Integer.parseInt((split[1]));
        String result="";

        switch (operator){

            case "+":
                result = Double.toString(add(x, y));
                break;
            case "-":
                result = Double.toString(minus(x, y));
                break;
            case "*":
            case "x":
            case "X":
                result = Double.toString(multiply(x, y));
                break;
            case "/":
                result =  Double.toString(divide(x, y));
                break;
            case "^":
                result =  Double.toString(pwr(x, y));
                break;
            default:
                System.out.println("Invalid Operator");
        }
        System.out.println(result);
        return;
    }
}
public class Calculator {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorclass Obj=new Calculatorclass();
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired Equation.");
	    String n=input1.nextLine();
	    n=n.replace(" ", "");
	    Obj.input(n);
    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Calculatorclass Obj=new Calculatorclass();
//		Scanner input1=new Scanner(System.in);
//	    System.out.println("Please Enter Your Desired Equation.");
//	    String n=input1.nextLine();
//	    n=n.replace(" ", "");
//	    String[] array=n.split("*");
//	    String[] array2={"*|/|+|-"};
////	    for (int i=0; i<array.length; i++) {
////	    	array2[i]=array[i].split("/");
////	    }
//	    for (int i=0; i<array2.length; i++) {
//	    	//for (int j=0; j<array2[i].length; j++) {
//		    	System.out.println(array2[i]);
//		    //}
//	    }
////	    String[][][][] array4=n.split("*", "/", "+", "-");
////	    int x;
////	    int y;
////	    int i;
////	    String sub;
////	    String sub2;
////	    String sub3;
////	    if (n.contains("*")) {
////	    	x=Integer.parseInt(n.substring(n.indexOf("*")-1, n.indexOf("*")));
////	    	y=Integer.parseInt(n.substring(n.indexOf("*")+1, n.indexOf("*")+2));
////	    	sub=n.substring(0, n.indexOf("*")-1);
////	    	sub2=n.substring(n.indexOf("*")+2, n.length());
////	    	n=sub.concat(sub3.concat(sub2));
////	    }
////	    if (n.contains("/")) {
////	    	x=Integer.parseInt(n.substring(n.indexOf("/")-1, n.indexOf("/")));
////	    	y=Integer.parseInt(n.substring(n.indexOf("/")+1, n.indexOf("/")+2));
////	    	sub=n.substring(0, n.indexOf("/")-1);
////	    	sub2=n.substring(n.indexOf("/")+2, n.length());
////	    	n=sub.concat(sub3.concat(sub2));
////	    }
////	    if (n.contains("+")) {
////	    	x=Integer.parseInt(n.substring(n.indexOf("+")-1, n.indexOf("+")));
////	    	y=Integer.parseInt(n.substring(n.indexOf("+")+1, n.indexOf("+")+2));
////	    	sub=n.substring(0, n.indexOf("+")-1);
////	    	sub2=n.substring(n.indexOf("+")+2, n.length());
////	    	n=sub.concat(sub3.concat(sub2));
////	    }
////	    if (n.contains("-")) {
////	    	x=Integer.parseInt(n.substring(n.indexOf("-")-1, n.indexOf("-")));
////	    	y=Integer.parseInt(n.substring(n.indexOf("-")+1, n.indexOf("-")+2));
////	    	sub=n.substring(0, n.indexOf("-")-1);
////	    	sub2=n.substring(n.indexOf("-")+2, n.length());
////	    	n=sub.concat(sub3.concat(sub2));
////	    }
////	    System.out.println(n);
//	}

}
