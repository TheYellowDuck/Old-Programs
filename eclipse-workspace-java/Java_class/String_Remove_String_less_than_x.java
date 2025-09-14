package programs;

import java.util.ArrayList;
import java.util.Scanner;

class SRSclass {
	private String[] array1;
	private int y;
	ArrayList<String> list=new ArrayList<String>();
	private String str;
	public SRSclass(String x1, int y1) {
		array1=x1.split(" ");
		y=y1;
	}
	public void calculate() {
		for (int i=0; i<array1.length; i++) {
			if (array1[i].length()>y) {
				list.add(array1[i]);
			}
		}
		str=String.join(" ", list);
		str=str.replace("[", "").replace("]", "");
		System.out.println(str);
	}
}
public class String_Remove_String_less_than_x {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Enter Your String");
		String x=input.nextLine();
		System.out.println("Enter Your String Length Limit");
		int y=input.nextInt();
		SRSclass n1=new SRSclass(x, y);
		n1.calculate();
	}

}