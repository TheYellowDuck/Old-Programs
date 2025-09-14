package programs;

class numbers1 {
	private int x;
	private int y;
	public numbers1(int x1, int y1) {
		x=x1;
		y=y1;
	}
	public void Sum() {
		System.out.println("Sum: \n"+(x+y));
		return;
	}
	public void Difference() {
		if (x>y) {
			System.out.println("Difference: \n"+(x-y));
		}
		else {
			System.out.println("Difference: \n"+(y-x));
		}
		return;
	}
	public String Product() {
		return "Product: \n"+(x*y);
	}
	public String Quotient() {
		if (x>y) {
			return "Quotient: \n"+(x/y);
		}
		else {
			return "Quotient: \n"+(y/x);
		}
	}
}
public class Numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=19;
		numbers1 n1=new numbers1(x, y);
		n1.Sum();
		n1.Difference();
		System.out.println(n1.Product());
		System.out.println(n1.Quotient());
	}

}