import java.lang.*;


public class ValidateNameAge 

{
	
	boolean validate(String name)
	{
		return name.matches("[a-zA-Z\\s]+");  // allows only small letters, capital letters and spaces
	}
	
	boolean validate(int age)
	{
		return age>=18 && age<=50;
	}

	public static void main(String[] args) 
	
	{
		 ValidateNameAge object=new  ValidateNameAge();
		 
		 System.out.println("The name is "+object.validate("Raju"));
		 
		 System.out.println("The age is "+object.validate(22));

	}

}
