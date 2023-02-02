
public class Person {
	
	//instance variable data type declaration
	String name;
	int age;
	String address;
	String mobNum;
	
	//default constructor
	Person()
	{
		name="";
		age=0;
		address="";
		mobNum="";
	}
	
	//parameterized constructor
	public Person(String name, int age, String address, String mobNum) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobNum = mobNum;
	}
	
	//Create a method to display the values of instance variable
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
		System.out.println("Mobile Number : "+mobNum);
	}
	

}
