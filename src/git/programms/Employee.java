package git.programms;

public class Employee 
{
	int Empid;
	String EmpName;
	double Salary;
	int EmpDeptNo;
	String Empjob;
	
	void Display() 
	{
		System.out.println(Empid);
		System.out.println(EmpName);
		System.out.println(Salary);
		System.out.println(EmpDeptNo);
		System.out.println(Empjob);
	}
	
	public static void main(String[] args) 
	{
		Employee Emp1= new Employee();// Creating The Object to The Class , We can Create any Number of objects within the class
		Emp1.Empid=10001;
		Emp1.EmpName="Chowdary";
		Emp1.Salary=50000.00;
		Emp1.EmpDeptNo=101;
		Emp1.Empjob="Software Tester";
		Emp1.Display();
		
		System.out.println("********************************");
		Employee Emp2= new Employee();
		Emp2.Empid=10002;
		Emp2.EmpName="Venkateswarlu";
		Emp2.Salary=50000.00;
		Emp2.EmpDeptNo=102;
		Emp2.Empjob="Software Engineer";
		Emp2.Display();
		
	}

}
