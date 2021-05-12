import java.lang.*;



public class MethodOverloading 

{
	int max(int a,int b)      // I method
	{
		if(a>b)
		{
			return a;
		}
		return b;
	}
	
	int max(int a,int b,int c)     // II method with additional one parameter
	{
		if((a>b) && (a>c))
		{
			return a;
		}
		else if((b>a) && (b>c))
		{
			return b;
		}
		return c;
	}


	public static void main(String[] args) 
	
	{
		MethodOverloading object=new MethodOverloading();  // instead of using static in method create an object for the class
		
		System.out.println("The maximum of two numbers is "+object.max(10,20));
		
		System.out.println("The maximum of three numbers is "+object.max(10, 20, 30));
	}

}


// writing more than one method having same name
//int add(int a,int b)
//int add(int a,int b,int c) same method with extra parameter