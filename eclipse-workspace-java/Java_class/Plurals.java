package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plurals {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your String: ");
		String str=input.readLine().toLowerCase();
		if (str.substring(str.length()-1).contentEquals("s") || str.substring(str.length()-2).contentEquals("ie"))
			System.out.println("Plural");
		else
			System.out.println("Singular");
	}

}
