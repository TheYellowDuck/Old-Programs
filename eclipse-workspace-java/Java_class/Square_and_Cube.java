package programs;

import java.util.Scanner;

class Square {
	protected double h;
	protected double w;
	protected double sa=1;
	public Square(double h1, double w1) {
		h=h1;
		w=w1;
	}  
	public void ComputeSurfaceArea() {
		sa=sa*h*w;
	}   
	public void Print() {
		System.out.println("The Surface Area Of Your Square Is "+sa+" Units Squared");
	} 
}
class Cube extends Square {
	protected double d;
	public Cube(double h1, double w1, double d1) {
		super(h1, w1);
		d=d1;
	}  
	public void ComputeSurfaceArea() {
		super.ComputeSurfaceArea();
		super.Print();
		sa=d;
		super.ComputeSurfaceArea();
	}   
	public void Print() {
		System.out.println("The Volume Of Your Cube Is "+sa+" Units Cubed");
	} 
}
public class Square_and_Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The Height Of Your Object.");
		double h=Double.parseDouble(input.nextLine().replace(" ", ""));
		System.out.println("Enter The Width Of Your Object.");
		double w=Double.parseDouble(input.nextLine().replace(" ", ""));
		System.out.println("Enter The Depth Of Your Object.");
		double d=Double.parseDouble(input.nextLine().replace(" ", ""));
		Cube c1=new Cube(h, w, d);
		c1.ComputeSurfaceArea();
		c1.Print();
		}

}
