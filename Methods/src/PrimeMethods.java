import java.lang.*;

public class PrimeMethods 

{
	static boolean isPrime(int a)
	{
		for(int i=2;i<=a/2;i++)     // prime starts from 2 
		{
			if(a%i==0)
			return false;
		}
		return true;
	}

	public static void main(String[] args)
	
	{
		System.out.println(isPrime(15));

	}

}
