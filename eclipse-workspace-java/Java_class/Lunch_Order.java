package programs;

import java.util.Arrays;
import java.util.Scanner;

class Lunclass {
	private int w;
	private int x;
	private int y;
	private int z;
	public double hp=1.85;
	public int hfa=9;
	public int hc=33;
	public int hfi=1;
	public double sap=2.00;
	public int safa=1;
	public int sac=11;
	public int safi=5;
	public double fp=1.30;
	public int ffa=11;
	public int fc=36;
	public int ffi=4;
	public double sop=0.95;
	public int sofa=0;
	public int soc=38;
	public int sofi=0;
	String[][] table=new String[][] {{"Item", "            Price", "    Fat(g)", "    Carbohydrates(g)", "    Fiber(g)"}, {"Hamburger", "       $1.85", "     9", "             33", "               1"}, {"Salad", "           $2.00", "     1", "             11", "               5"}, {"French Fries", "    $1.30", "     11", "            36", "               4"}, {"Soda", "            $0.95", "     0", "             38", "               0"}};
	private double ans;
	public Lunclass(int w1, int x1, int y1, int z1) {
		w=w1;
		x=x1;
		y=y1;
		z=z1;
	}
	public void calculate() {
		ans=(w*hp)+(x*sap)+(y*fp)+(z*sop);
		String total=String.format("%.2f", ans);
		System.out.println(w+" Hamburger(s): $"+String.format("%.2f", w*hp));
		System.out.println(x+" Salad(s): $"+String.format("%.2f", x*sap));
		System.out.println(y+" French Fries Packet(s): $"+String.format("%.2f", y*fp));
		System.out.println(z+" Soda(s): $"+String.format("%.2f", z*sop));
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
public class Lunch_Order {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lunclass m1=new Lunclass(0, 0, 0, 0);
		System.out.println(Arrays.deepToString(m1.table).replace("[", "").replace("], ", "\n").replace("]", "").replace(",", ""));
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.print("Enter Number of Hamburgers: ");
		int w=input.nextInt();
		System.out.println("Each Hamburger is $"+m1.hp+" and has "+m1.hfa+"g of Fat, "+m1.hc+"g of Carbs, and "+m1.hfi+"g of Fiber");
		System.out.println(w+" Hamburger(s) is $"+String.format("%.2f", w*m1.hp)+" and has "+w*m1.hfa+"g of Fat, "+w*m1.hc+"g of Carbs, and "+w*m1.hfi+"g of Fiber");
		System.out.print("Enter Number of Salads: ");
		int x=input.nextInt();
		System.out.println("Each Salad is $"+m1.sap+" and has "+m1.safa+"g of Fat, "+m1.sac+"g of Carbs, and "+m1.safi+"g of Fiber");
		System.out.println(x+" Salad(s) is $"+String.format("%.2f", x*m1.sap)+" and has "+x*m1.safa+"g of Fat, "+x*m1.sac+"g of Carbs, and "+x*m1.safi+"g of Fiber");
		System.out.print("Enter Number of French Fries: ");
		int y=input.nextInt();
		System.out.println("Each French Fries Packet is $"+m1.fp+" and has "+m1.ffa+"g of Fat, "+m1.fc+"g of Carbs, and "+m1.ffi+"g of Fiber");
		System.out.println(y+" French Fries Packet(s) is $"+String.format("%.2f", y*m1.fp)+" and has "+y*m1.ffa+"g of Fat, "+y*m1.fc+"g of Carbs, and "+y*m1.ffi+"g of Fiber");
		System.out.print("Enter Number of Sodas: ");
		int z=input.nextInt();
		System.out.println("Each Soda is $"+m1.sop+" and has "+m1.sofa+"g of Fat, "+m1.soc+"g of Carbs, and "+m1.sofi+"g of Fiber");
		System.out.println(z+" Soda(s) is $"+String.format("%.2f", z*m1.sop)+" and has "+z*m1.sofa+"g of Fat, "+z*m1.soc+"g of Carbs, and "+z*m1.sofi+"g of Fiber");
		Lunclass n1=new Lunclass(w, x, y, z);
		n1.calculate();
		Scanner input1=new Scanner(System.in); //ScannerInput
		System.out.println("Enter Your Tip (percentage)");
		String tip=input1.nextLine();
		n1.TIP(Double.parseDouble(tip.replace(" ", "").replace("%", "")));
	}

}