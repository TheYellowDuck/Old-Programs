package programs;

import java.util.Scanner;

class eggs1 {
	private int x;
	public eggs1(int x1) {
		x=x1;
	}
	public void Dozen() {
		System.out.println(x/12+" Dozens and "+x%12+" eggs");
	}
}
public class Eggs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Enter Number of Eggs");
		int x=input.nextInt();
		eggs1 n1=new eggs1(x);
		n1.Dozen();
	}

}
