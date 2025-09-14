package programs;

class testmethods {
	private int x;
	private int y;
	public testmethods(int x1, int y1) {
		x=x1;
		y=y1;
	}
	public void displayIt() {
		System.out.println("Original: \n"+x+"\n"+y);
		return;
	}
	public void displayItTimesTwo() {
		System.out.println("Multiplied by 2: \n"+x*2+"\n"+y*2);
		return;
	}
	public void displayItPlusOneHundred() {
		System.out.println("Plus by 100: \n"+(x+100)+"\n"+(y+100));
		return;
	}
}
public class Test_Methods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		testmethods m1=new testmethods(x, y);
		m1.displayIt();
		m1.displayItTimesTwo();
		m1.displayItPlusOneHundred();
	}

}
