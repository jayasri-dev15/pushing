import java.lang.*;
import java.util.Arrays;


public class PassingObjects 

{
    static void arrayUpdate(int arr[],int index,int value)
	{
		arr[index]=value;
	}

	public static void main(String[] args) 
	
	{
		int arr[]= {1,2,3,4,5};
		arrayUpdate(arr, 2, 15);
		
		for(Object o:arr)
		{
			System.out.println(o);
		}
		
	}

}
