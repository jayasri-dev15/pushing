import java.lang.*;
import java.util.Scanner;


public class AreaofTriangle


{

	public static void main(String[] args) 
	
	
	{
		Scanner scan=new Scanner(System.in);
		
		
		
		System.out.println("Enter the base value of a triangle : ");
		
		float base=scan.nextFloat();
		
		System.out.println("Enter the height value of a triangle : ");
		
		float height=scan.nextFloat();
		// Area of triangle=1/2*base*height
		
		float area=(base*height)/2;
		
		System.out.println("The area of the triangle is "+area);

	}

}
