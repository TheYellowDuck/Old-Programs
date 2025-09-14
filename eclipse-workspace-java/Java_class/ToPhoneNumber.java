package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToPhoneNumber {
	public static String[] num;
	public static int[] array=new int[10];
	public static void input() throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Numbers: ");
		num=input.readLine().replace(" ", "").split(",");
		int i=0;
		for (String s:num) {
			if (s.length()==1)
				array[i++]=Integer.parseInt(s);
			else 
				input();
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		input();
		for (int a=0; a<array.length; a++) {
			switch (a) {
			case 0:
				System.out.print("(");
				break;
			case 3:
				System.out.print(") ");
				break;
			case 6:
				System.out.print("-");
				break;
			}
			System.out.print(array[a]);
		}
		System.out.println();
	}

}
