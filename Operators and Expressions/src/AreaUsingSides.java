
import java.lang.*;
import java.util.Scanner;





public class AreaUsingSides

{

	public static void main(String[] args) 
	
	
	{
        Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter the first side value of a triangle : ");
		
		float a=scan.nextFloat();
		
		System.out.println("Enter the second side value of a triangle : ");
		
		float b=scan.nextFloat();
		
        System.out.println("Enter the third side value of a triangle : ");
		
		float c=scan.nextFloat();
		
		float sides=(a+b+c)/2f;
		
		System.out.println("The sides of the triangle is "+sides);
		
		double area=Math.sqrt(sides*(sides-a)*(sides-b)*(sides-c));
		
		System.out.println("The area of the triangle is "+area);

	}

}
