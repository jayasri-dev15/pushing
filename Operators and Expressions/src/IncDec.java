import java.lang.*;

public class IncDec 
{

	public static void main(String[] args) 
	{
		int a=5;
		
		a++;
		
		System.out.println(a);
		//-------------------------
		
		int b=5,c;
		
		c=++b;
		
		System.out.println(c+","+b);
		
		//----------------------------
		
		int x=5,y=4,z;
		
		z=2 * x++ +3 * ++y;
		
	 //z = 2*5 +3*5 =10+15=25
		
		System.out.println(z);
		

	}

}
