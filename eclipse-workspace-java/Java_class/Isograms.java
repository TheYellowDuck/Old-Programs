package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Isograms {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your String: ");
		String[] str=input.readLine().replace(" ", "").toLowerCase().split("");
		for (int i=0; i<str.length; i++) {
			for (int j=i+1; j<str.length; j++) {
				if (str[i].contentEquals(str[j])) {
					System.out.println(false);
					System.exit(1);
				}
			}
		}
		System.out.println(true);
	}

}
