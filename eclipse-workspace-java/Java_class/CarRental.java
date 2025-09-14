package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CarType {
	static boolean c=false;
	static String n;
	static String zip;
	static String type;
	static double cost;
	static int day;
	static int extra=0;
	static double total;
	static String chauffeur="";
	static void calculate() {
		switch (type) {
		case "economy":
			cost=29.99;
			break;
		case "business":
			cost=38.99;
			break;
		case "firstclass":
			cost=43.50;
			break;
		case "private":
			cost=79.99;
			break;
		}
		total=cost*day+extra;
		print();
	}
	static void print() {
		System.out.println("Name: "+n);
		System.out.println("Zip Code: "+zip);
		System.out.println("Type: "+type);
		System.out.println("Cost/Day: "+cost);
		System.out.println("Days: "+day);
		System.out.println("Chauffeur: "+c);
		System.out.println("Chauffeur Cost: $"+extra);
		System.out.println("Total: $"+String.format("%.2f", total));
	}
}

class Luxury extends CarType {
	static void check() throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Chauffeur?: Yes, No");
		chauffeur=input.readLine().toLowerCase();
		if (chauffeur.contentEquals("yes")) {
			chauffeur=" Chauffeur";
			extra=200;
			c=true;
		}
	}
}

public class CarRental {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Luxury car=new Luxury();
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Full Name Please:");
		car.n=input.readLine();
		System.out.println("Enter Your Zip Code Please:");
		car.zip=input.readLine();
		System.out.println("Enter Your Size Please:");
		System.out.println("	•	Economy: $29.99/day");
		System.out.println("	•	Business: $38.99/day");
		System.out.println("	•	First Class: $43.50/day");
		System.out.println("	•	Private: $79.99/day");
		car.type=input.readLine().replace(" ", "").toLowerCase();
		if (car.type.contentEquals("private"))
		car.check();
		System.out.println("Enter Your How Many Days You Want Our "+car.type+car.chauffeur+" Car Please:");
		car.day=Integer.parseInt(input.readLine());
		car.calculate();
	}

}
