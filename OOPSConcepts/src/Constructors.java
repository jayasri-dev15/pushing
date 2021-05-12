import java.lang.*;

class Car
{
	public int modelYear;
	public String modelName;
	
	
	public Car(int modelYear, String modelName) {
		super();
		this.modelYear = modelYear;
		this.modelName = modelName;
	}
	
	
	
}


public class Constructors 

{

	public static void main(String[] args)
	
	{
		Car c=new Car(1223, "Ferrari");
		
		System.out.println("The car model name is "+c.modelName+" and the year is "+c.modelYear);
		
	}

}


//Note
//1. constructor will have the same name has the class name
//2. constructor method has no return type
//3. In every class there is a defualt constructor