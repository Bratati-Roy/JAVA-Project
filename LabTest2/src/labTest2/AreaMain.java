package labTest2;

//creating main method
public class AreaMain {
	public static void main(String[] args) {
		
		//creating  object of Area class
		Area a=new Area();
		
		//calling those different methods using created object
		System.out.println("Area of Rectangle: " + a.rectangleArea(50, 30.5));		//printing the return of rectangleArea method
		System.out.println("Area of Square : " + a.squareArea(20.5));						   //printing the return of squareArea method
	    System.out.println("Area of Circle : "  + a.circleArea(10));								  //printing the return of circleArea method
	}

}
