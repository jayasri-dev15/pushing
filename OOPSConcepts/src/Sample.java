import java.lang.*;


class Circle                 // class
{
	public double radius;   // Property
	
	public double area()
	{
		return Math.PI*radius*radius;
		
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double circumference()
	{
		return perimeter();
	}
	
}

public class Sample    // Tester class

{

	public static void main(String[] args) 
	
	{
		Circle c=new Circle();
		
		c.radius=5;
		
        System.out.println("The area is "+c.area());
        System.out.println("The perimeter is "+c.perimeter());
        System.out.println("The circumference is "+c.circumference());
        
        
        Circle c1=new Circle();
		
		c1.radius=2;
		
		System.out.println("===========================================");
        System.out.println("The area is "+c1.area());
        System.out.println("The perimeter is "+c1.perimeter());
        System.out.println("The circumference is "+c1.circumference());
	}

}

//Note 

//OOPS Principles

//1.Abstraction ==showing only the needed details and hiding the internal functionalities. EX: TV --- if we press ON button it will on. Volume button helps to increase the volume. Other than that we don't want the internal circuitry work.
//2.Inheritance == (Specialization) Already having a old TV and after adding additional features releasing a new model. It inherits the behaviour from old TV only added features are new here. (Code reusablity)
//3.Polymorphism == (generalization == belongs to one group) TV - Samsung, sony ,LG EX: Red light will stop all . One message is enough to communicate to all.
//4.Encapsulation == showing only the buttons in TV and encapsulates the all circuits in a single box.