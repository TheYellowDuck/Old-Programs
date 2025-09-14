package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive_Length {
	public static int i=-1;
	public static int length(String str) {
		i++;
		if (str.length()!=0)
			return length(str.substring(1));
		else
			return i;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your String: ");
		String str=input.readLine();
		System.out.println("Length: "+length(str));
	}

}
