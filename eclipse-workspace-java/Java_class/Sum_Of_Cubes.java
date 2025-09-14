package programs;
import java.util.Scanner;
import java.lang.Math.*;
public class Sum_Of_Cubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Number.");
	    int a=input1.nextInt();
	    int ans=0;
	    for (int i=a-1; i>0; i--) {
	    	ans=(int) (ans+Math.pow(i, 3));
	    }
	    System.out.println(ans);
	}

}
