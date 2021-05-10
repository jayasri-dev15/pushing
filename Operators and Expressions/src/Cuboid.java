
import java.lang.*;
import java.util.Scanner;


public class Cuboid 
{

	public static void main(String[] args)
	{
        Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter the length of a cuboid : ");
		
		float a=scan.nextFloat();
		
		System.out.println("Enter the breadth of a cuboid : ");
		
		float b=scan.nextFloat();
		
        System.out.println("Enter the height of a cuboid : ");
		
		float c=scan.nextFloat();
		
		
		//to calculate total area 
		//front=length*height
		//bottom=length*breadth
		//right=breadth*height
		
		//volume=length*breadth*height
		
		float area=2*(a*b+a*c+b*c);
		
		float volume=a*b*c;
		
		System.out.println("The TSA of cuboid is "+area);
		
		System.out.println("The volume of cuboid is "+volume);

	}

}
