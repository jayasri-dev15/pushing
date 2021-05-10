import java.lang.*;

public class OutputSamples

{

	public static void main(String[] args) 
	
	{
		String str="Hi";
		
		String str1="Hello everyone";
		
		String str2="Thank you for your visit";
		
		System.out.printf(str, args);
		
		System.out.print(str1);
		System.out.println(str2);
		
		System.out.println(str2);
		System.out.println(str1);
		
		String out=str2.toUpperCase();
		
		System.out.println(out);
		
		String str3="Hi";
		
		String str4="Hi";
		
		boolean isString = str3==str4;
		
		System.out.println(isString);
		
		String str5="$Rggh^*@hgGHy";
		
		System.out.println(str5.replaceAll(str2, "XXXX"));
		System.out.println(str5.substring(1, 5));
		
		
		
		
	}

}
