package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Room {
	protected static int room;
	protected static int extra=0;
	protected static double price;
	Room(int room) {
		this.room=room;
	}
	public static void calculate() {
		if (room<300) {
			price=extra+69.95;
		}
		else {
			price=extra+89.95;
		}
		print();
	}
	public static void print() {
		System.out.println("Your Total is $"+String.format("%.2f", price));
	}
}

class Suite extends Room {

	Suite(int room, int check) {
		super(room);
		if (check==1)
			super.extra=40;
		super.calculate();
	}
	
}

public class Hotel {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Room Number: ");
		int room=Integer.parseInt(input.readLine().replace(" ", ""));
		System.out.println("Suite?: Yes/No");
		int check=((input.readLine().replace(" ", "").toLowerCase().substring(0, 1)).equalsIgnoreCase("y")?1:0);
		Suite s=new Suite(room, check);
	}

}
