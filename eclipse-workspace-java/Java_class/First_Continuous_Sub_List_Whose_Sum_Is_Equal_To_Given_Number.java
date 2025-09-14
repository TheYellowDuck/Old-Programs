package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class First_Continuous_Sub_List_Whose_Sum_Is_Equal_To_Given_Number {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist1=new ArrayList<Integer>();
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your List");
	    String x=input1.nextLine();
	    System.out.println("Please Enter Your Number");
	    int y=input1.nextInt();
	    x=x.replaceAll(" ", "");
	    int add=0;
	    boolean flag=false;
	    String str[]=x.split(",");
	    List<String> al=Arrays.asList(str);
	    for(String stringValue : al) {
            try {
                arraylist1.add(Integer.parseInt(stringValue));
            } 
            catch(NumberFormatException nfe) {
            	System.out.println("NumberFormatException: " + nfe.getMessage());
            } 
        }
		for (int i=0, j=1; i<j && j<=arraylist1.size();) {
			List<Integer> sub=arraylist1.subList(i, j);
			add=0;
			for (int n=0; n<sub.size(); n++) {
				add=add+sub.get(n);
			}
			if (add==y) {
				flag=true;
				System.out.println(sub);
				break;
			}
			if (add<y) {
				j++;
			}
			if (add>y) {
				i++;
			}
		}
		if (flag==false) {
			System.out.println("List Cannot Be Found");
		}
	}

}
