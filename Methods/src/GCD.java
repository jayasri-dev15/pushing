import java.lang.*;


public class GCD 

{
   static int gcd(int a,int b)
    {
    	if(a!=b)
    	{
    		if(a>b)
    		{
    			a=a-b;
    		}
    		else
    		{
    			b=b-a;
    		}
    	}
    	return a;
    }
	public static void main(String[] args)
	
	{
		
    System.out.println(gcd(25, 10));
		
	}

}

//GCD Calculation
//25      ------------------ 10
//25 is largest
// 25        =====    10
// 25-10=15  ======   10 -5=15  (- starts from largest number)
// So GCD is 15
//
//
//WE can avoid using static instead create object of that class
//