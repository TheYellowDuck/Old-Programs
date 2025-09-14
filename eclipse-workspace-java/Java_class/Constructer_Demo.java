package programs;

//class myclass1 {
//	int x;
//	public myclass1() {
//		x=5;
//	}
//
//}
//public class Constructer_Demo {
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		myclass1 Obj=new myclass1();
//		System.out.println(Obj.x);
//	}
//
//}
class myclass1 {
	int x;
	public myclass1(int y) {
		x=y;
	}

}
public class Constructer_Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclass1 Obj=new myclass1(5);
		System.out.println(Obj.x);
	}

}
