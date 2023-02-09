package labTest2;

//creating implemented class of Shape interface
public class Area implements Shape {

	//giving definition of rectangleArea method
	public double rectangleArea(double length, double width) {
		
		return (length*width);
	}

	//giving definition of squareArea method
	@Override
	public double squareArea(double side) {
		
		return (side*side);
	}

	//giving definition of circleArea method
	@Override
	public double circleArea(double radius) {
		
		double PI=3.14;
		return (PI*radius*radius);
	}

}
