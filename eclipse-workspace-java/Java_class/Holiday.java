package programs;

class holiday1 {
	private String name;
	private int day;
	private String month;
	public holiday1(String n, int d, String m) {
		name=n; //Initialized
		day=d;
		month=m;
	}
	public void printholiday() {
		System.out.println(name+" "+day+"st of "+month);
		return;
	}
	public static boolean isSamemonth(holiday1 h3,holiday1 h4) {
		if (h3.month==h4.month) {
			return true;
		}
		else {
			return false;
		}
	}
}


public class Holiday {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Independence Day";
		int day=1;
		String month="July";
		holiday1 h1=new holiday1(name, day, month);
		holiday1 h2=new holiday1("Georgeday",3,"July");
		h1.printholiday();
		System.out.println(holiday1.isSamemonth(h1,h2));
		
	}

}
