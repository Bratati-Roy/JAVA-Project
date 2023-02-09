package labTest2;

//Creating main class
public class BankMain {

	//main method
	public static void main(String[] args) {
		
		//creating object for each class
		BankA a=new BankA();
		BankB b= new BankB();
		BankC c= new BankC();
		
		//calling same methods for every class using their object to get particular class-wise return
		System.out.println("The Boy Deposited in Bank A : "+ a.getBalance());
		System.out.println("The Boy Deposited in Bank B : "+ b.getBalance());
		System.out.println("The Boy Deposited in Bank C : "+ c.getBalance());

	}

}
