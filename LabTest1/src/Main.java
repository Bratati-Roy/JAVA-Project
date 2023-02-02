
public class Main {

	public static void main(String[] args) {
		
		//creating object of child class
		Employee emp1=new Employee();
		
		//setting the value 
		emp1.name="Bratati Roy";
		emp1.age=23;
		emp1.address="Barasat,WB";
		emp1.mobNum="9804297988";
		emp1.eid=8504;
		emp1.dept="Testing";
		emp1.salary=28500.53f;
		
		//to display all the value
		emp1.display();
		emp1.displayEmp();

	}

}
