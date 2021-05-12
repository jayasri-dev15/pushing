import java.lang.*;
import java.util.Scanner;

public class IncDec 

{

	static int Inc(int a) // static methods
	{
		a++;
		return a;
	}
	public static void main(String[] args) 
	
	{
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the a value : ");
		
		int a=scan.nextInt();
		
		System.out.println("The incremented value is "+Inc(a));  // the main function will call only static methods

	}

}
