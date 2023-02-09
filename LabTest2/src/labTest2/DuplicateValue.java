package labTest2;

public class DuplicateValue {
	  public static void main(String[] args) {
		  
		  //initializing string array
	String[] arr={"bcd", "abd", "jde", "bcd", "oiu", "gzw", "oiu","abc","bde","abc"};
	 
	//iterating array elements using array length and for loops
    for (int i = 0; i < arr.length; i++)
    {
        for (int j = i+1; j < arr.length; j++)
        {
            if( (arr[i].equals(arr[j])) && (i != j) )  			//using  .equals method to check that elements are same or not
            {
                System.out.println("Duplicate Element is : "+arr[j]);     //printing the same elements
            }
        }
    }
}
}

