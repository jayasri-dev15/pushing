import java.lang.*;


class Cylinder

{
	public double radius;
	
	public double height;
	
	public double areaOfCylinder()
	{
		return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
		
	}
	
	public double volumeOfCylinder()
	{
		return Math.PI*radius*radius*height;
		
	}
}


public class Challenge2

{

	public static void main(String[] args) 
	
	{
		Cylinder c=new Cylinder();
		
		c.radius=2;      // we can eradicate it by using the getter setter method i.e: data hiding refer to Challenge2 Data hiding
		
		c.height=6;
		
		System.out.println("The area of cylinder is "+c.areaOfCylinder());
		
		System.out.println("The volume of the cylinder is "+c.volumeOfCylinder());

	}

}
