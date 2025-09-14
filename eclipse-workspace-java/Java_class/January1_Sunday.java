package programs;

import java.time.*;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class January1_Sunday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Year. Else Enter Your Day. (1=Monday)");
	    int x=input1.nextInt();
	    System.out.println("Please Enter Your Month.");
	    int y=input1.nextInt();
	    System.out.println("Please Enter Your Date.");
	    int z=input1.nextInt();
	    GregorianCalendar date1 = new GregorianCalendar();
	    boolean check=false;
	    if (x==1 || x==2 || x==3 || x==4 || x==5 || x==6 || x==7) {
	    	int a=x;
	    	for (x=date1.get(Calendar.YEAR); check==false; x--) {
	    		LocalDate datec = LocalDate.of(x, y, z);
	    		DayOfWeek dayc = DayOfWeek.from(datec);
	    		if (dayc.getValue()==a) {
	    			check=true;
	    			break;
	    		}
	    	}
	    }
		LocalDate localDate = LocalDate.of(x, y, z);
		int original=x;
		DayOfWeek dayofweek = DayOfWeek.from(localDate);
		boolean flag=false;
		for (x++; flag==false; x++) {
			LocalDate date = LocalDate.of(x, y, z);
			DayOfWeek day = DayOfWeek.from(date);
			if (dayofweek==day) {
				flag=true;
				break;
			}
		}
		System.out.println(original+" "+dayofweek.name());
		System.out.println(x+" "+dayofweek.name());
	}

}
