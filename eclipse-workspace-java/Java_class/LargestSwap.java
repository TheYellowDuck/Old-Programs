package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestSwap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Numbers: ");
		char[] num=input.readLine().replace(" ", "").toCharArray();
		int n=num[0]-'0', m=num[1]-'0';
		System.out.println(n>=m);
	}

}
