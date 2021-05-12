import java.lang.*;


public class VariableArguments

{

	void show(int ...a)
	{
		for (int x:a)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args)
	
	{
		VariableArguments object=new VariableArguments();
		object.show(10);
		object.show(10,20,30);
		object.show(new int[] {1,2,3,4,5});

	}

}

//call by value === parameter passing is used by java