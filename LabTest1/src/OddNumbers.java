
public class OddNumbers {

	public static void main(String[] args) {
		//create object to call printOddNum method in main method
		OddNumbers a=new OddNumbers();
		a.printOddNum();  
	}
	     // create a method to print odd numbers
    public void printOddNum()
    {
    	System.out.println("Odd Numbers between 1 to 20 :");
    	for (int i=1;i<=20;i++)  // to iterate 1 to 20
    	{
    		if (i%2 !=0)      // to check odd or not
    		{
    			System.out.println(i);   //to print
    		}
    	}
    	
    }

}
