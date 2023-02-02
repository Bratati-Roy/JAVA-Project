
public class Array {
	
	//declaring arrays
	int[] arr1 = { 1, 2, 3, 4, 5,6,7,8,9,10 };
	int[]arr2=new int[arr1.length];

	public static void main(String[] args) 
		{
		
		//creating object and calling method
		Array s=new Array();
		 s.sumOfStoreAlter();
		}

	//creating method to store alter elements of 1st array into 2nd array and determine sum of elements of 2nd array
	public void sumOfStoreAlter()
	{
	    // storing alter elements(all odd position elements i.e. even index elements) of 1st array into 2nd array
	    for(int i = 0; i < arr1.length; i++)
	    {
	        if (i % 2 == 0)   
	        {
	            arr2[i]=arr1[i];
	        }
	    }
	    
	    //to determine sum of all elements of 2nd array
	    	int sum = 0;
	    	for(int i=0;i<arr2.length;i++) {
	    		sum = sum + arr2[i];
	    	}
	    	System.out.println("Sum of all elements of new stored-Array: "+sum);
	    }
	}
	


