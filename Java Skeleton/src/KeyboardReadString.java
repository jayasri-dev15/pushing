import java.lang.*;

import java.util.*;   // all the scanner sources are present in the utility package


public class KeyboardReadString

{

	public static void main(String[] args) 
	
	{
		Scanner scan = new Scanner(System.in);  // Getting the input from the keybord that is user
		
		String name;
		
		System.out.println("What's your name please?");
		
		//name=scan.next();   //read word 
		
		name=scan.nextLine();  //to read full name with spaces and initials 
		
		System.out.println("My name is Mr/Mrs/Ms."+name);

	}

}
