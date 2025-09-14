package programs;

class UEmployeeClass{ //this is the super class
	protected String name;
	protected double salary;
	public void Print(String name1, double salary1) {
		name=name1;
		salary=salary1;
		System.out.println(name+": "+salary);
	}   
}
class Faculty extends UEmployeeClass { //this is the sub class
	private String department;
	public void Print(String department1) {
		department=department1;
		System.out.println("Department: "+department);
	} 
}
class Staff extends UEmployeeClass { //this is the sub class
	private String job;
	public void Print(String job1) {
		job=job1;
		System.out.println("Job Title: "+job);
	}  
}
public class UEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="John George";
		double salary=139.99;
		String department="Education";
		String job="Teacher";
		UEmployeeClass e1= new UEmployeeClass();
		e1.Print(name, salary);
		Staff s1=new Staff();
		s1.Print(department);
		Faculty f1=new Faculty();
		f1.Print(job);
	}

}
