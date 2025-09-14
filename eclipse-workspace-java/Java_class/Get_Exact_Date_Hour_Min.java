package programs;
import java.util.*;
public class Get_Exact_Date_Hour_Min {
	public static void main(String args[]){
	  int day, month, year;
	  int second, minute, hour;
	  GregorianCalendar date = new GregorianCalendar(); //Creating Date Object
	  day = date.get(Calendar.DATE);// Storing day of the Month
	  month = date.get(Calendar.MONTH);// Storing the month
	  year = date.get(Calendar.YEAR); // Storing the current Year
	  second = date.get(Calendar.SECOND); //Time in Seconds, Minutes and Hours
	  minute = date.get(Calendar.MINUTE);
	  hour = date.get(Calendar.HOUR);
	  System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year+"\n"+"Current time is  "+hour+":"+minute+":"+second);
	}
}
