import java.lang.*;

import java.util.*;   // all the scanner sources are present in the utility package




public class KeyboardRead

{

	public static void main(String[] args) 
	
	{
		Scanner scan = new Scanner(System.in);  // Getting the input from the keybord that is user
		
		int a;
		int b;
		int c;
		
		System.out.println("Enter the input values \n");
		
		a=scan.nextInt();                     // accept the two values in form of integer type
		b=scan.nextInt();
	
		c=a+b;
		
		System.out.println("The sum is "+c);  //print the output
		

	}

}

//NOTE

//Various scanner sources are
//nextInt() ===================== Integer
//nextFloat()
//nextDouble()
//next() ===================== word
//nextLine() =================== read sentence
//nextByte()
//nextShort()
//nextLong()
//nextBoolean()
//hasNextInt() ================= returns true or false (check next number is whether integer or not)
//hasNextFloat() =============== 
