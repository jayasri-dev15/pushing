
import java.lang.*;
import java.util.Scanner;


public class OverloadMethodToCalculateAreas 

{
	double area(double length,double breadth)  // for area of rectangle
	{
		return length*breadth;
	}
	
	double area(double radius)      // for area of circle
	{
		return (22/7)*radius*radius;
	}

	public static void main(String[] args)
	
	{
		OverloadMethodToCalculateAreas object=new OverloadMethodToCalculateAreas();
		
		System.out.println("The area of circle is "+object.area(2));
		
		System.out.println("The area of rectangle is "+object.area(10, 20));

	}

}
