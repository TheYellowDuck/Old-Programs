package programs;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.Timer;

public class Time {
	static int days=31, day, month, year;
	static int second, minute, hour, check=0;
	static GregorianCalendar date=new GregorianCalendar();
	static ActionListener s=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			second++;
		}    
	};
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str1=input.readLine();
		Timer timer=new Timer(999, s);
		timer.stop();
		year=date.get(Calendar.YEAR);
		month=date.get(Calendar.MONTH);
		day=date.get(Calendar.DATE);
		minute=date.get(Calendar.MINUTE);
		hour=date.get(Calendar.HOUR);
		minute=date.get(Calendar.MINUTE);
		second=date.get(Calendar.SECOND);
		while (year>0) {
			String str="Current date is:  "+String.format("%02d", day)+"/"+String.format("%02d", month+1)+"/"+String.format("%02d", year)+"	Current time is  "+String.format("%02d", hour)+":"+String.format("%02d", minute)+":"+String.format("%02d", second);
			System.out.println(str);
			if (check!=second) {
				check=second;
				timer.restart();
			}
			if (second==60) {
				second=0;
				minute++;
			}
			if (second==60) {
				minute=0;
				hour++;
			}
			if (hour==24) {
				hour=0;
				day++;
			}
			switch (month){
		    case 0:
		    case 2:
		    case 4:
		    case 6:
		    case 7:
		    case 9:
		    case 11:
			    days=31;
			    break;
		    case 3:
		    case 5:
		    case 8:
		    case 10:
		    	days=30;
		        break;
		    case 1:
			    if ((year%4==0)&&(year%100!=0)||(year%400==0)){
			    	days=29;
			    }
			    else{
			    	days=28;
			    }
			    break;
		    }
			if (day==days+1) {
				day=1;
				month++;
			}
			if (month==12) {
				year=date.get(Calendar.YEAR);
				month=date.get(Calendar.MONTH);
				day=date.get(Calendar.DATE);
				minute=date.get(Calendar.MINUTE);
				hour=date.get(Calendar.HOUR);
				minute=date.get(Calendar.MINUTE);
				second=date.get(Calendar.SECOND);
				month=0;
				year++;
			}
			System.out.print("\033[H\033[2J");  
		    System.out.flush();
		}
	}
	
}
