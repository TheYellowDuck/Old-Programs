package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Library {
	protected static String[] title;
	protected static String[] author;
	protected static int[] page;
	protected static String type;
	Library(String[] title, String[] author, int page[], String type) {
		this.title=title;
		this.author=author;
		this.page=page;
		this.type=type.substring(0, 1);
		sort();
	}
	public static void sort() {
		String s;
		boolean flag=true;
		while (flag) {
			flag=false;
		    for (int i=0; i<title.length-1; i++) {
			    if ((int) title[i].charAt(0)>(int) title[i+1].charAt(0) && type.contentEquals("t")) {
		    	    s=title[i+1];
				    title[i+1]=title[i];
	                title[i]=s;
	                s=author[i+1];
				    author[i+1]=author[i];
	                author[i]=s;
	                Arrays.sort(page);
	                flag=true;
			    }
			    if ((int) author[i].charAt(0)>(int) author[i+1].charAt(0) && type.contentEquals("a")) {
			    	s=title[i+1];
				    title[i+1]=title[i];
	                title[i]=s;
	                s=author[i+1];
				    author[i+1]=author[i];
	                author[i]=s;
	                Arrays.sort(page);
	                flag=true;
			    }
			    if (type.contentEquals("p")) {
			    	s=title[i+1];
				    title[i+1]=title[i];
	                title[i]=s;
	                s=author[i+1];
				    author[i+1]=author[i];
	                author[i]=s;
	                Arrays.sort(page);
	                flag=true;
			    }
		    }
		}
		print();
	}
	public static void print() {
		for (int i=0; i<title.length; i++) {
			System.out.println("Title: "+title[i]);
			System.out.println("Author: "+author[i]);
			System.out.println("Page Count: "+page[i]);
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
	}
	
}

public class Library_Book {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Number of Books: ");
		int size=Integer.parseInt(input.readLine().replace(" ", ""));
		String[] title=new String[size];
		String[] author=new String[size];
		int[] page=new int[size];
		String type;
		for (int i=0; i<size; i++) {
			System.out.println("Enter Your Book Title: ");
			title[i]=input.readLine();
			System.out.println("Enter Your Book Author: ");
			author[i]=input.readLine();
			System.out.println("Enter Your Book Page Count: ");
			page[i]=Integer.parseInt(input.readLine().replace(" ", ""));
			System.out.println();
		}
		System.out.println("Sort By: ");
		System.out.println("	•	Title");
		System.out.println("	•	Author");
		System.out.println("	•	Page Count");
		type=input.readLine().toLowerCase();
		Library l=new Library(title, author, page, type);
	}

}
