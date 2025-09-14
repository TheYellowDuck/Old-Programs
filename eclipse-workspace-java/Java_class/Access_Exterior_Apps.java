package programs;

import java.io.IOException;
import java.util.Scanner;

public class Access_Exterior_Apps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime runtime=Runtime.getRuntime();
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Command.");
	    String x=input1.nextLine();
	    x=x.toLowerCase();
	    x=x.concat(" ");
	    if (x.contains("google")) {
	    	String[] s=new String[] {"C:\\Users\\kd333\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe", "https://www.google.ca/search?rlz=1C1SQJL_enCA853CA853&sxsrf=ALeKk02BAtCNlx-XCFUvwuGe2jW_q0Lqsg%3A1587778583574&ei=F5SjXsLUIsTa-gTttpKgAg&q=".concat(x.substring(x.indexOf("google")+6, x.indexOf(" ", x.indexOf("google")+6)))};
	    	try {
	            runtime.exec(s);
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    if (x.contains("note")) {
	        try {
	            runtime.exec("notepad.exe");
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    if (x.contains("youtube")) {
	    	String[] s=new String[] {"C:\\Users\\kd333\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe", "https://www.youtube.com/results?search_query=".concat(x.substring(x.indexOf("youtube")+7, x.indexOf(" ", x.indexOf("youtube")+7)))};
	    	try {
	            runtime.exec(s);
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    if (x.contains("zoom")) {
	    	String[] s=new String[] {"C:\\Users\\kd333\\AppData\\Roaming\\Zoom\\bin\\zoom.exe"};
	    	try {
	            runtime.exec(s);
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

}
