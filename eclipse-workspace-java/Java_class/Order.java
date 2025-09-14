package programs;

import java.util.Scanner;

class OrderItem {
	protected String n;
	protected int num;
	protected int q;
	protected double p;
	protected double tp=0;
	public OrderItem(String n1, int num1, int q1, double p1) {
		n=n1;
		num=num1;
		q=q1;
		p=p1;
		ComputePrice();
	}  
	public void ComputePrice() {
		tp=tp+(q*p);
	}   
	public void Print() {
		System.out.println("Name: "+n);
		System.out.println("Number: "+num);
		System.out.println("Quantity: "+q);
		System.out.println("Unit Price: $"+String.format("%.2f", p));
		System.out.println("Total Price: $"+String.format("%.2f", tp-4));
	} 
}
class ShippingOrder extends OrderItem {
	public ShippingOrder(String n1, int num1, int q1, double p1) {
		super(n1, num1, q1, p1);
		super.Print();
		ComputePrice();
	}  
	public void ComputePrice() {
		tp=4;
		super.ComputePrice();
	}   
	public void Print() {
		System.out.println("Total Price After Shipping: $"+String.format("%.2f", tp));
	} 
}
public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exit="";
		for (int num=(int) (Math.random()*Integer.MAX_VALUE); !exit.contains("y"); num++) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter Your Name.");
			String n=input.nextLine();
			System.out.println("Enter The Quantity");
			int q=Integer.parseInt(input.nextLine().replace(" ", ""));
			System.out.println("Enter The Unit Price");
			int p=Integer.parseInt(input.nextLine().replace(" ", ""));
			ShippingOrder s1=new ShippingOrder(n, num, q, p);
			s1.Print();
			System.out.println("Done. Yes/No");
			exit=input.nextLine().replace(" ", "").toLowerCase();
		}
	}

}
