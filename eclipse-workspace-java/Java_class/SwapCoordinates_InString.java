package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapCoordinates_InString {
	             
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your String: ");
		String[] str=input.readLine().replace("(", "").replace(")", "").replace(" ", "").split(",");
		try {
			Integer.parseInt(String.join("", str));
		}
		catch (NumberFormatException nfe) {
			
		}
		if (Integer.parseInt(String.join("", str))==0)
	}

}
