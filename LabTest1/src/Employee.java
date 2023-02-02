
public class Employee extends Person {
	// instance variable
	int eid;
	String dept;
	float salary;
	
	//default constructor
	Employee(){
		eid=0;
		dept="";
		salary=0;
	}
	
	//parameterized constructor
	Employee(int eid, String dept,float  salary) {
		this.eid = eid;
		this.dept = dept;
		this.salary = salary;
	}
    
	//Create a method to display the values of instance variable
		public void displayEmp()
		{
			System.out.println("Employee id : "+eid);
			System.out.println("Department Name : "+dept);
			System.out.println("Salary : "+salary);
		}
}
