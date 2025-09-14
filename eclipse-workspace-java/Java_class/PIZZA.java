package programs;

import java.util.ArrayList;
import java.util.Scanner;

class PIZclass {
	private int x;
	private String y;
	private double z;
	private double ans;
	ArrayList<String> toppings=new ArrayList<String>();
	ArrayList<Double> price=new ArrayList<Double>();
	ArrayList<Integer> size=new ArrayList<Integer>();
	ArrayList<Double> price2=new ArrayList<Double>();
	public PIZclass(int x1, String y1) {
		x=x1;
		y=y1;
		size.add(4);
		size.add(6);
		size.add(8);
		size.add(10);
		size.add(12);
		size.add(14);
		size.add(15);
		price2.add(10.99);
		price2.add(12.99);
		price2.add(14.99);
		price2.add(16.99);
		price2.add(18.99);
		price2.add(20.99);
		price2.add(21.99);
		toppings.add("pepperoni");
		toppings.add("mushroom");
		toppings.add("onion");
		toppings.add("sausage");
		toppings.add("bacon");
		toppings.add("olive");
		toppings.add("pineapple");
		toppings.add("spinich");
		price.add(5.99);
		price.add(2.99);
		price.add(3.99);
		price.add(7.99);
		price.add(9.99);
		price.add(3.99);
		price.add(4.99);
		price.add(5.99);
	}
	public void calculate() {
		for (int i=0; i<size.size(); i++) {
			if (x==size.get(i)) {
				ans=price2.get(i);
			}
		}
		for (int i=0; i<toppings.size(); i++) {
			if (y.contains(toppings.get(i))) {
				ans=ans+price.get(i);
			}
		}
		String total=String.format("%.2f", ans);
		System.out.println("Price: $"+total);
	}
	public void TIP(double tip1) {
		double tip=(tip1/100);
		String tipa=String.format("%.2f", ans*tip);
		String total=String.format("%.2f", ans+(ans*tip));
		System.out.println("Tip: $"+tipa);
		System.out.println("Total Price: $"+total);
	}
}
public class PIZZA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PIZclass m1=new PIZclass(0, "");
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Enter The Size Of Your Pizza"+m1.size);
		int x=input.nextInt();
		String y="";
		String sub="";
		while (!sub.contains("done")) {
			Scanner input1=new Scanner(System.in); //ScannerInput
			System.out.println("Enter Your Toppings"+m1.toppings+" If Done, Enter done");
			sub=input1.nextLine();
			sub=sub.toLowerCase();
			if (!sub.contains("done")) {
				y=y.concat(sub);
			}
		}
		PIZclass n1=new PIZclass(x, y);
		n1.calculate();
		Scanner input1=new Scanner(System.in);
		System.out.println("Enter Your Tip (percentage)");
		String tip=input1.nextLine();
		n1.TIP(Double.parseDouble(tip.replace(" ", "").replace("%", "")));
	}

}
