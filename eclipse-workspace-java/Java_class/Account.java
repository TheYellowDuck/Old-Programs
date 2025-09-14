package programs;

import java.util.Scanner;

class accountclass{ //this is the super class
	protected double balance;
	protected double withdraw;
	public void Print(double balance1) {
		balance=balance1;
		System.out.println("Your Current Balance is: $"+String.format("%.2f", balance));
	}   
	public void check(double withdraw1) {
		withdraw=withdraw1;
		balance=balance-withdraw;
		System.out.println("You Withdrawed: $"+String.format("%.2f", withdraw)+"\nYour Current Balance is: $"+String.format("%.2f", balance));
	}   
}
class privatea extends accountclass { //this is the sub class
	public void Print(double balance1, double withdraw1) {
		balance=balance1;
		withdraw=withdraw1;
		if (balance<100) {
			balance=balance-withdraw-2;
			System.out.println("You Withdrawed: $"+String.format("%.2f", withdraw)+"\nYour Current Balance is: $"+String.format("%.2f", balance));
		}
		else {
			check(withdraw);
		}
	} 
}
class business extends accountclass { //this is the sub class
	public void Print(double balance1, double withdraw1) {
		balance=balance1;
		withdraw=withdraw1;
		if (balance<500) {
			balance=balance-withdraw-100;
			System.out.println("You Withdrawed: $"+String.format("%.2f", withdraw)+"\nYour Current Balance is: $"+String.format("%.2f", balance));
		}
		else {
			check(withdraw);
		}
	} 
}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter Your Account Type. Personal/Business");
	    String account=input1.nextLine().replace(" ", "").toLowerCase();
	    System.out.println("Enter Your Balance");
	    double balance=input1.nextDouble();
	    System.out.println("Enter Your Withdraw Amount");
	    double withdraw=input1.nextDouble();
		accountclass a1= new accountclass();
		a1.Print(balance);
		switch (account) {
		default:
			privatea p1=new privatea();
			p1.Print(balance, withdraw);
			break;
		case "business":
			business b1=new business();
			b1.Print(balance, withdraw);
			break;
		}
		
		
	}

}