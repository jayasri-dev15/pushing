import java.lang.*;


class Student

{
	// Properties
	
	public int rollNo;
	
	public String name;
	
	public String course;
	
	public int m1,m2,m3;
	
	//methods
	
	public int total()
	
	{
		return m1+m2+m3;
	}
	
	public float average()
	{
		return total()/3;
	}
	
	public char grade()
	{
		if(average()>=50)
		{
			return 'A';
		}
		return 'E';
	}

}


public class Challenge3 

{

	public static void main(String[] args) 
	
	{
		Student s=new Student();
		
		s.rollNo=001;
		s.name="Raju";
		s.course="Second";
		s.m1=50;
		s.m2=90;
		s.m3=92;
		
		System.out.println("The total of the student "+s.name+" is "+s.total());
		
		System.out.println("Average is "+s.average());
		
		System.out.println("Grade is "+s.grade());

	}

}
