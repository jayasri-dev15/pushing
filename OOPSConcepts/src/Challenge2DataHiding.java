import java.lang.*;

class Cylinders

{
	private double radius;
	
	private double height;
	
	
	public double getRadius() 
	{
		return radius;
	}


	public double getHeight() 
	{
		return height;
	}
	public void setRadius(double r) 
	
	{
		this.radius = r;
	}

	public void setHeight(double h) 
	
	{
		this.height = h;
	}

	// methods
	
	public double areaOfCylinder()
	{
		return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
		
	}
	
	public double volumeOfCylinder()
	{
		return Math.PI*radius*radius*height;
		
	}
}

public class Challenge2DataHiding 

{

	public static void main(String[] args) 
	
	{
		
        Cylinders c=new Cylinders();
		
		c.setRadius(2);
		
		c.setHeight(1.2);
		
		System.out.println("The area of cylinder is "+c.areaOfCylinder());
		
		System.out.println("The volume of the cylinder is "+c.volumeOfCylinder());
		
		System.out.println(c.getHeight());
		
		System.out.println(c.getRadius());
	}

}
