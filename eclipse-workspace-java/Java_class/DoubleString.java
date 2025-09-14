package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your String: ");
		String[] str=input.readLine().split("");
		for (String s:str) {
			System.out.print(s+""+s);
		}
		System.out.println();
	}

}
