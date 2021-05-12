import java.lang.*;



public class ParameterPassing 

{
	/*static int multiply(int a,int b)
	{
		int output=a*b;
		return output;
	}

	public static void main(String[] args) 
	
	{
		System.out.println("The output is "+multiply(3,4));

	}

}*/

//=======================================another method

static int multiply(int a ,int b)
{
	return a*b;
}
public static void main(String[] args) 

{
	int c=multiply(10, 20);      // here c is the method call 
	
	System.out.println(c);

}

}