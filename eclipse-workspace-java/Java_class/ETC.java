package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ETC {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your Start Time: ");
		double start=Double.parseDouble(input.readLine().replace(":", "."));
		System.out.print("Enter Am/Pm: ");
		String ap=input.readLine().toLowerCase();
		System.out.print("Enter The Hours Elapsed: ");
		double elapse=Double.parseDouble(input.readLine().toLowerCase().replace(":", "."));
		double end=start;
		for (int i=0; i<(int)elapse; i++) {
			if (end<12)
				end+=1;
			else {
				end=1+end%1;
				if (ap.contentEquals("am"))
					ap="pm";
				else
					ap="am";
			}
		}
		end+=elapse%1;
		if (end%1>=0.6) {
			end+=1;
			end-=0.6;
		}
		System.out.println("The Time Is: "+String.format("%.2f", end).replace(".", ":")+" "+ap);
	}

}
