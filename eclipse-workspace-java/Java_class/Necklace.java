package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Necklace {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your First Number: ");
		int a=Integer.parseInt(input.readLine());
		System.out.print("Enter Your Second Number: ");
		int b=Integer.parseInt(input.readLine());
		String check="";
		int i;
		int x=a;
		int y=b;
		String str=String.valueOf(a).concat(" ".concat(String.valueOf(b)));
		System.out.print(str);
		for (i=0; !check.contentEquals(str); i++) {
			int z=(x+y)%10;
			x=y;
			y=z;
			System.out.print(" "+y);
			check=String.valueOf(x).concat(" ".concat(String.valueOf(y)));
		}
		System.out.println("\nRotation Completed In "+i+" Step(s)");
	}

}
