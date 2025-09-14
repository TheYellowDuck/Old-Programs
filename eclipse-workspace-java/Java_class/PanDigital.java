package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PanDigital {
	public static void check(String num) {
		if (num.contains("1") && num.contains("2") && num.contains("3") && num.contains("4") && num.contains("5") && num.contains("6") && num.contains("7") && num.contains("8") && num.contains("9") && num.contains("0")) {
			System.out.println(true);
			System.exit(1);
		}
		System.out.println(false);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Number: ");
		String num=input.readLine().replace(" ", "");
		check(num);
	}

}
