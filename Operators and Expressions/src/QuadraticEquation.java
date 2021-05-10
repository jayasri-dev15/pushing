import java.lang.*;
import java.util.Scanner;



public class QuadraticEquation 

{

	public static void main(String[] args)
	
	{
        Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter the A coefficient value : ");
		
		float a=scan.nextFloat();
		
		System.out.println("Enter the B coefficient value : ");
		
		float b=scan.nextFloat();
		
        System.out.println("Enter the C coefficient value : ");
		
		float c=scan.nextFloat();
		
		
		//ax2+bx+c=0
		//(x+r1)(x+r2)=0
		//r1=-b+/-sqrt(b2-4ac)/2a
		
		double r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		
		double r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		
		System.out.println("The roots are "+r1+ ", "+r2);
		
		

	}

}
