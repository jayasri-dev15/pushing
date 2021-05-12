import java.lang.*;
import java.util.Scanner;


public class Addition 

{

	static int add(int a,int b)
	{
		int result=a+b;
		return result;
	}
	
	public static void main(String[] args) 
	
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the a value : ");
		
		int a=scan.nextInt();
		
		System.out.println("Enter the b value : ");
		
		int b=scan.nextInt();
		
		System.out.println("The result is "+add(a, b));

	}

}
