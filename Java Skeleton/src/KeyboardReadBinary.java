import java.lang.*;

import java.util.*;


public class KeyboardReadBinary


{

	public static void main(String[] args) 
	
	
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the x \n");
		
		scan.useRadix(2);       // the use of this radix is to accept only binary inputs from the keyboard
		
		int x=scan.nextInt();
		
		System.out.println("Display x value : "+x);

	}

}
