package programs;

//class MyClass {
//	int x=5;
//	/*final */String y="Str";
//}
//public class Class_And_Objects_Demo {
//	public static void main(String[] args) {
//		MyClass myObj=new MyClass();
//		MyClass myObj2=new MyClass();
//		myObj.x=006;
//		myObj2.y="string";
//		System.out.println(myObj.x);
//		System.out.println(myObj2.y);
//		System.out.println(myObj2.x);
//		System.out.println(myObj.y);
//	}
//}
//class Person {
//	String fname="John";
//	/*final */String lname="Doe";
//	int age=24;
//}
//public class Class_And_Objects_Demo {
//	public static void main(String[] args) {
//		Person myObj=new Person();
//		System.out.println("Name: "+myObj.fname+" "+myObj.lname);
//		System.out.println("Age: "+myObj.age);
//	}
//}
//class MyClass {
//	static void myMethod() {
//		System.out.println("Hello World!");
//	}
//}
//public class Class_And_Objects_Demo {
//	public static void main(String[] args) {
//		MyClass myObj=new MyClass();
//		myObj.myMethod();
//	}
//}
class MyClass {
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}
	public void myPublicMethod() {
		System.out.println("Public methods can be called by creating objects");
	}
}
public class Class_And_Objects_Demo {
	public static void main(String[] args) {
		MyClass myObj=new MyClass();
		//myStaticMethod();
		myObj.myPublicMethod();
	}
}