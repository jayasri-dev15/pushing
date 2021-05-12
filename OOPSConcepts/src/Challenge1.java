import java.lang.*;

class Rectangle

{
	public double length;
	
	public double breadth;   // there are 2 properties
	
	public double areaOfRectangle()
	{
		return length*breadth;
		
	}
	
	public double PerimeterOfRectangle()
	{
		return 2*(length+breadth);
		
	}
}


public class Challenge1 

{

	public static void main(String[] args) 
	
	{
	Rectangle r=new Rectangle();
	
	r.length=2;
	
	r.breadth=4;
	
	System.out.println("The area of the rectangle is "+r.areaOfRectangle());
	
	System.out.println("The perimeter of the rectangle is "+r.PerimeterOfRectangle());
	}

}
