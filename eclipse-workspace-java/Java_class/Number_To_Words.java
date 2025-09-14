package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_To_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist1=new ArrayList<String>();
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Integer.");
	    String num1=input1.nextLine();
	    String[] array1=num1.split("");
	    String[] array2=new String[array1.length];
	    int j=0;
	    for (int i=array1.length-1; i>=0; i--) {
        	array2[j]=array1[i];
        	j++;
        }
	    boolean flag=false;
	    for (int i=array2.length-1; i>=0; i--) {
	    	if (flag==false) {
	    		switch (array2[i]) {
	    			case "1" :
	    				arraylist1.add("One ");
	    				break;
	    			case "2" :
	    				arraylist1.add("Two ");
	    				break;
	    			case "3" :
	    				arraylist1.add("Three ");
	    				break;
	    			case "4" :
	    				arraylist1.add("Four ");
	    				break;
	    			case "5" :
	    				arraylist1.add("Five ");
	    				break;
	    			case "6" :
	    				arraylist1.add("Six ");
	    				break;
	    			case "7" :
	    				arraylist1.add("Seven ");
	    				break;
	    			case "8" :
	    				arraylist1.add("Eight ");
	    				break;
	    			case "9" :
	    				arraylist1.add("Nine ");
	    				break;
	    			case "0" :
	    				arraylist1.add("Zero ");
	    				break;
	    		}
	    	}
	    	switch (i+1) {
	    		case 2 :
	    			switch (array2[i]) {
	    				case "1" :
	    					switch (array2[i+1]) {
	    						case "1" :
	    							arraylist1.add("Eleven ");
	    							break;
	    						case "2" :
	    							arraylist1.add("Twelve ");
	    							break;
	    						case "3" :
	    							arraylist1.add("Thirteen ");
	    							break;
	    						case "4" :
	    							arraylist1.add("Fourteen ");
	    							break;
	    						case "5" :
	    							arraylist1.add("Fifteen ");
	    							break;
	    						case "6" :
	    							arraylist1.add("Sixteen ");
	    							break;
	    						case "7" :
	    							arraylist1.add("Seventeen ");
	    							break;
	    						case "8" :
	    							arraylist1.add("Eighteen ");
	    							break;
	    						case "9" :
	    							arraylist1.add("Nineteen ");
	    							break;
	    						case "0" :
	    							arraylist1.add("Ten ");
	    							break;
	    					}
	    					flag=true;
	    					break;
	    				case "2" :
							arraylist1.add("Twenty ");
							flag=false;
							break;
						case "3" :
							arraylist1.add("Thirty ");
							flag=false;
							break;
						case "4" :
							arraylist1.add("Fourty ");
							flag=false;
							break;
						case "5" :
							arraylist1.add("Fifty ");
							flag=false;
							break;
						case "6" :
							arraylist1.add("Sixty ");
							flag=false;
							break;
						case "7" :
							arraylist1.add("Seventy ");
							flag=false;
							break;
						case "8" :
							arraylist1.add("Eighty ");
							flag=false;
							break;
						case "9" :
							arraylist1.add("Ninety ");
							flag=false;
							break;
						case "0" :
							flag=false;
							break;
	    			}
	    			break;
	    		case 3 :
	    			arraylist1.add("Hundred ");
	    			flag=true;
	    			break;
	    		case 4 :
	    			arraylist1.add("Thousand ");
	    			break;
	    		case 5 :
	    			arraylist1.add("Ten-Thousand ");
	    			break;
	    		case 6 :
	    			arraylist1.add("Hundred-Thousand ");
	    			break;
	    		case 7 :
	    			arraylist1.add("Million ");
	    			break;
	    		case 8 :
	    			arraylist1.add("Ten-Million ");
	    			break;
	    		case 9 :
	    			arraylist1.add("Hundred-Million ");
	    			break;
	    		case 10 :
	    			arraylist1.add("Billion ");
	    			break;
	    		case 11 :
	    			arraylist1.add("Ten-Billion ");
	    			break;
	    		case 12 :
	    			arraylist1.add("Hundred-Billion ");
	    			break;
	    		case 13 :
	    			arraylist1.add("Trillion ");
	    			break;
	    		case 14 :
	    			arraylist1.add("Ten-Trillion ");
	    			break;
	    		case 15 :
	    			arraylist1.add("Hundred-Trillion ");
	    			break;
	    		case 16 :
	    			arraylist1.add("Quadrillion ");
	    			break;
	    		case 17 :
	    			arraylist1.add("Ten-Quadrillion ");
	    			break;
	    		case 18 :
	    			arraylist1.add("Hundred-Quadrillion ");
	    			break;
	    		case 19 :
	    			arraylist1.add("Quintillion ");
	    			break;
	    		case 20 :
	    			arraylist1.add("Ten-Quintillion ");
	    			break;
	    		case 21 :
	    			arraylist1.add("Hundred-Quintillion ");
	    			break;
	    		case 22 :
	    			arraylist1.add("Sextillion ");
	    			break;
	    		case 23 :
	    			arraylist1.add("Ten-Sextillion ");
	    			break;
	    		case 24 :
	    			arraylist1.add("Hundred-Sextillion ");
	    			break;
	    		case 25 :
	    			arraylist1.add("Septillion ");
	    			break;
	    		case 26 :
	    			arraylist1.add("Ten-Septillion ");
	    			break;
	    		case 27 :
	    			arraylist1.add("Hundred-Septillion ");
	    			break;
	    		case 28 :
	    			arraylist1.add("Octillion ");
	    			break;
	    		case 29 :
	    			arraylist1.add("Ten-Octillion ");
	    			break;
	    		case 30 :
	    			arraylist1.add("Hundred-Octillion ");
	    			break;
	    		case 31 :
	    			arraylist1.add("Nonillion ");
	    			break;
	    		case 32 :
	    			arraylist1.add("Ten-Nonillion ");
	    			break;
	    		case 33 :
	    			arraylist1.add("Hundred-Nonillion ");
	    			break;
	    		case 34 :
	    			arraylist1.add("Decillion ");
	    			break;
	    		case 35 :
	    			arraylist1.add("Ten-Decillion ");
	    			break;
	    		case 36 :
	    			arraylist1.add("Hundred-Decillion ");
	    			break;
	    		case 37 :
	    			arraylist1.add("Undecillion ");
	    			break;
	    		case 38 :
	    			arraylist1.add("Ten-Undecillion ");
	    			break;
	    		case 39 :
	    			arraylist1.add("Hundred-Undecillion ");
	    			break;
	    		case 40 :
	    			arraylist1.add("Duodecillion ");
	    			break;
	    		case 41 :
	    			arraylist1.add("Ten-Duodecillion ");
	    			break;
	    		case 42 :
	    			arraylist1.add("Hundred-Duodecillion ");
	    			break;
	    		case 43 :
	    			arraylist1.add("Tredecillion ");
	    			break;
	    		case 44 :
	    			arraylist1.add("Ten-Tredecillion ");
	    			break;
	    		case 45 :
	    			arraylist1.add("Hundred-Tredecillion ");
	    			break;
	    		case 46 :
	    			arraylist1.add("Quattuordecillion ");
	    			break;
	    		case 47 :
	    			arraylist1.add("Ten-Quattuordecillion ");
	    			break;
	    		case 48 :
	    			arraylist1.add("Hundred-Quattuordecillion ");
	    			break;
	    		case 49 :
	    			arraylist1.add("Quindecillion ");
	    			break;
	    		case 50 :
	    			arraylist1.add("Ten-Quindecillion ");
	    			break;
	    		case 51 :
	    			arraylist1.add("Hundred-Quindecillion ");
	    			break;
	    		case 52 :
	    			arraylist1.add("Sexdecillion ");
	    			break;
	    		case 53 :
	    			arraylist1.add("Ten-Sexdecillion ");
	    			break;
	    		case 54 :
	    			arraylist1.add("Hundred-Sexdecillion ");
	    			break;
	    		case 55 :
	    			arraylist1.add("Septendecillion ");
	    			break;
	    		case 56 :
	    			arraylist1.add("Ten-Septendecillion ");
	    			break;
	    		case 57 :
	    			arraylist1.add("Hundred-Septendecillion ");
	    			break;
	    		case 58 :
	    			arraylist1.add("Octodecillion ");
	    			break;
	    		case 59 :
	    			arraylist1.add("Ten-Octodecillion ");
	    			break;
	    		case 60 :
	    			arraylist1.add("Hundred-Octodecillion ");
	    			break;
	    		case 61 :
	    			arraylist1.add("Novemdecillion ");
	    			break;
	    		case 62 :
	    			arraylist1.add("Ten-Novemdecillion ");
	    			break;
	    		case 63 :
	    			arraylist1.add("Hundred-Novemdecillion ");
	    			break;
	    		case 64 :
	    			arraylist1.add("Vigintillion ");
	    			break;
	    		case 65 :
	    			arraylist1.add("Ten-Vigintillion ");
	    			break;
	    		case 66 :
	    			arraylist1.add("Hundred-Vigintillion ");
	    			break;
	    		case 67 :
	    			arraylist1.add("Unvigintillion ");
	    			break;
	    		case 68 :
	    			arraylist1.add("Ten-Unvigintillion ");
	    			break;
	    		case 69 :
	    			arraylist1.add("Hundred-Unvigintillion ");
	    			break;
	    		case 70 :
	    			arraylist1.add("Duovigintillion ");
	    			break;
	    		case 71 :
	    			arraylist1.add("Ten-Duovigintillion ");
	    			break;
	    		case 72 :
	    			arraylist1.add("Hundred-Duovigintillion ");
	    			break;
	    		case 73 :
	    			arraylist1.add("Trevigintillion ");
	    			break;
	    		case 74 :
	    			arraylist1.add("Ten-Trevigintillion ");
	    			break;
	    		case 75 :
	    			arraylist1.add("Hundred-Trevigintillion ");
	    			break;
	    		case 76 :
	    			arraylist1.add("Quattuorvigintillion ");
	    			break;
	    		case 77 :
	    			arraylist1.add("Ten-Quattuorvigintillion ");
	    			break;
	    		case 78 :
	    			arraylist1.add("Hundred-Quattuorvigintillion ");
	    			break;
	    		case 79 :
	    			arraylist1.add("Quinvigintillion ");
	    			break;
	    		case 80 :
	    			arraylist1.add("Ten-Quinvigintillion ");
	    			break;
	    		case 81 :
	    			arraylist1.add("Hundred-Quinvigintillion ");
	    			break;
	    		case 82 :
	    			arraylist1.add("Sexvigintillion ");
	    			break;
	    		case 83 :
	    			arraylist1.add("Ten-Sexvigintillion ");
	    			break;
	    		case 84 :
	    			arraylist1.add("Hundred-Sexvigintillion ");
	    			break;
	    		case 85 :
	    			arraylist1.add("Septenvigintillion ");
	    			break;
	    		case 86 :
	    			arraylist1.add("Ten-Septenvigintillion ");
	    			break;
	    		case 87 :
	    			arraylist1.add("Hundred-Septenvigintillion ");
	    			break;
	    		case 88 :
	    			arraylist1.add("Octovigintillion ");
	    			break;
	    		case 89 :
	    			arraylist1.add("Ten-Octovigintillion ");
	    			break;
	    		case 90 :
	    			arraylist1.add("Hundred-Octovigintillion ");
	    			break;
	    		case 91 :
	    			arraylist1.add("Novemvigintillion ");
	    			break;
	    		case 92 :
	    			arraylist1.add("Ten-Novemvigintillion ");
	    			break;
	    		case 93 :
	    			arraylist1.add("Hundred-Novemvigintillion ");
	    			break;
	    		case 94 :
	    			arraylist1.add("Trigintillion ");
	    			break;
	    		case 95 :
	    			arraylist1.add("Ten-Trigintillion ");
	    			break;
	    		case 96 :
	    			arraylist1.add("Hundred-Trigintillion ");
	    			break;
	    		case 97 :
	    			arraylist1.add("Untrigintillion ");
	    			break;
	    		case 98 :
	    			arraylist1.add("Ten-Untrigintillion ");
	    			break;
	    		case 99 :
	    			arraylist1.add("Hundred-Untrigintillion ");
	    			break;
	    		case 100 :
	    			arraylist1.add("Duotrigintillion ");
	    			break;
	    		case 101 :
	    			arraylist1.add("Ten-Duotrigintillion ");
	    			break;
	    		case 102 :
	    			arraylist1.add("Hundred-Duotrigintillion ");
	    			break;
	    		case 103 :
	    			arraylist1.add("Googol ");
	    			break;
	    		case 104 :
	    			arraylist1.add("Ten-Googol ");
	    			break;
	    		case 105 :
	    			arraylist1.add("Hundred-Googol ");
	    			break;
	    	}
	    }
	    for (int i=0; i<arraylist1.size(); i++) {
        	System.out.print(arraylist1.get(i));
        }
	}

}
