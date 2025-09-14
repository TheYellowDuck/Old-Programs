package programs;

import java.util.Scanner;

class CZAclass {
	private int x;
	private int r;
	public static String[] colours=new String[] {"Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Brown", "Magenta", "Tan", "Cyan", "Olive", "Maroon", "Navy", "Aquamarine", "Turquoise", "Silver", "Lime", "Teal", "Indigo", "Violet", "Pink", "Black", "White", "Gray"};
	public CZAclass(int x1) {
		x=x1;
		r=x%12;
	}
	public void calculate() {
		switch (r) {
		case 0:
			System.out.println("Your Chinese Zodiac Animal Is A Monkey");
			break;
		case 1:
			System.out.println("Your Chinese Zodiac Animal Is A Rooster");
			break;
		case 2:
			System.out.println("Your Chinese Zodiac Animal Is A Dog");
			break;
		case 3:
			System.out.println("Your Chinese Zodiac Animal Is A Pig");
			break;
		case 4:
			System.out.println("Your Chinese Zodiac Animal Is A Rat");
			break;
		case 5:
			System.out.println("Your Chinese Zodiac Animal Is An Ox");
			break;
		case 6:
			System.out.println("Your Chinese Zodiac Animal Is A Tiger");
			break;
		case 7:
			System.out.println("Your Chinese Zodiac Animal Is A Rabbit");
			break;
		case 8:
			System.out.println("Your Chinese Zodiac Animal Is A Dragon");
			break;
		case 9:
			System.out.println("Your Chinese Zodiac Animal Is A Snake");
			break;
		case 10:
			System.out.println("Your Chinese Zodiac Animal Is A Horse");
			break;
		case 11:
			System.out.println("Your Chinese Zodiac Animal Is A Sheep");
			break;
		}
		System.out.println("Your Lucky Number This Year Would Be "+((int) (Math.random()*9)+1));
		System.out.println("Your Lucky Colour This Year Would Be "+colours[(int) (Math.random()*25)]);
	}
}
public class Chinese_Zodiac_Animals {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Enter Your Desired Year");
		int x=input.nextInt();
		CZAclass n1=new CZAclass(x);
		n1.calculate();
	}

}