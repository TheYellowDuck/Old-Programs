package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram_String {
	public static void main(String[] args) throws IOException {
		BufferedReader input1=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter a any String.");
	    String str1=input1.readLine();
	    String x=str1.toLowerCase().replaceAll("\\s+","");
	    System.out.println("Enter a any String.");
	    String str2=input1.readLine();
        String y=str2.toLowerCase().replaceAll("\\s+","");
        if (x.length()==y.length()) {
	        int [] ch=new int[x.length()];
	        int [] ch2=new int[y.length()];
	        for (int i=0; i<x.length(); i++) {
	        	ch[i]=(int) x.charAt(i);
	        	ch2[i]=(int) y.charAt(i);
	        }
	        int l=0;
			boolean flag=true;
			while (flag) {
				flag=false;
			    for (int r=0; r<ch.length-1; r++) {
				    if (ch[r]>ch[r+1]) {
			    	    l=ch[r+1];
					    ch[r+1]=ch[r];
		                ch[r]=l;
		                flag=true;
				    }
				    if (ch2[r]>ch2[r+1]) {
			    	    l=ch2[r+1];
					    ch2[r+1]=ch2[r];
		                ch2[r]=l;
		                flag=true;
				    }
			    }
			}
			System.out.println(String.valueOf(ch)+" "+ch2);
	        int n=0;
		    while (n<ch.length-1) {
			    if (ch[n]==ch2[n]) {
			        while (n<ch.length-1) {
				        n++;
			        }
			    }
			    else {
				    System.out.println(str1+" and "+str2+" Are Not Anagrams");
				    return;
			    }
		    }
		    if (ch[n]==ch2[n]) {
		        System.out.println(str1+" and "+str2+" Are Anagrams");
		        return;
		    }
        }
        else {
			System.out.println(str1+" and "+str2+" Are Not Anagrams");
			return;
		}
	}
}
