package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

abstract class BookClass {
	protected String name;
	protected String type;
	protected double price;
	static ArrayList<String> names=new ArrayList<String>();
	static ArrayList<String> types=new ArrayList<String>();
	static ArrayList<String> prices=new ArrayList<String>();
	static ArrayList<String> namesf=new ArrayList<String>();
	static ArrayList<String> typesf=new ArrayList<String>();
	static ArrayList<String> pricesf=new ArrayList<String>();
	static ArrayList<String> namesn=new ArrayList<String>();
	static ArrayList<String> typesn=new ArrayList<String>();
	static ArrayList<String> pricesn=new ArrayList<String>();
	BookClass(String name, String type) {
		this.name=name;
		this.type=type;
	}
	public abstract void SetPrice() throws NumberFormatException, IOException;
	public void printn() {
		System.out.println(name);
		System.out.println(type);
		printp();
	}
	public void printp() {
		System.out.println("$"+String.format("%.2f", price));
		names.add(name);
		types.add(type);
		prices.add("$"+String.format("%.2f", price));
	}
	public static void printa() throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Display: ");
		System.out.println("	•	All ");
		System.out.println("	•	Fiction ");
		System.out.println("	•	NonFiction ");
		String display=input.readLine().toLowerCase();
		switch (display) {
		case "fiction":
			for (int i=0; i<namesf.size(); i++) {
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(namesf.get(i));
				System.out.println(typesf.get(i));
				System.out.println(pricesf.get(i));
			}
			break;
		case "nonfiction":
			for (int i=0; i<namesn.size(); i++) {
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(namesn.get(i));
				System.out.println(typesn.get(i));
				System.out.println(pricesn.get(i));
			}
			break;
		default:
			for (int i=0; i<names.size(); i++) {
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(names.get(i));
				System.out.println(types.get(i));
				System.out.println(prices.get(i));
			}
			break;
		}
	}
	
}

class Fiction extends BookClass {
	Fiction(String name, String type) throws NumberFormatException, IOException {
		super(name, type);
		price=24.99;
		SetPrice();
	}
	public void SetPrice() throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Change Price From "+price+"?: Yes, No");
		String str=input.readLine().toLowerCase();
		if (str.contentEquals("yes")) {
			System.out.println("Enter Your New Price");
			price=Double.parseDouble(input.readLine());
		}
		namesf.add(name);
		typesf.add(type);
		pricesf.add("$"+String.format("%.2f", price));
		printn();
	}
	
}

class NonFiction extends BookClass {
	NonFiction(String name, String type) throws NumberFormatException, IOException {
		super(name, type);
		price=37.99;
		SetPrice();
	}
	public void SetPrice() throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Change Price From "+price+"?: Yes, No");
		String str=input.readLine().toLowerCase();
		if (str.contentEquals("yes")) {
			System.out.println("Enter Your New Price");
			price=Double.parseDouble(input.readLine());
		}
		namesn.add(name);
		typesn.add(type);
		pricesn.add("$"+String.format("%.2f", price));
		printn();
	}
	
}

public class Books {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Number Of Books: ");
		int num=Integer.parseInt(input.readLine());
		for (int i=0; i<num; i++) {
			System.out.println("Enter Your Book Name: ");
			String name=input.readLine();
			System.out.println("Enter Your Book Type: ");
			String type=input.readLine().toLowerCase();
			type=type.substring(0, 1).toUpperCase().concat(type.substring(1));
			switch (type) {
			case "Fiction":
				Fiction f=new Fiction(name, type);
				break;
			default:
				NonFiction n=new NonFiction(name, type);
				break;
			}
		}
		BookClass.printa();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

}
