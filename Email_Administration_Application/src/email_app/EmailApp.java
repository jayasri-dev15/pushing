package email_app;

import java.util.Scanner;

/* Email Application
Scenario: You are an IT Support Administrator Specialist and are
charged with the task of creating email accounts for new hires.
Your application should do the following:
 Generate an email with the following syntax: firstname.lastname@department.company.com
 Determine the department (sales, development, accounting), if none leave blank
 Generate a random String for a password
 Have set methods to change the password, set the mailbox capacity, and define an alternate
email address
 Have get methods to display the name, email, and mailbox capacity
 */

public class EmailApp 

{
  private String firstname;
  private String lastname;
  private String department;
  private String randomPassword;
  private int capacity=500;
  private String alternateEmail;
  public int defaultPasswordLength=10;
  public String companySuffix="ABCCompany.com";
  public String email;

  
  
  //constructor to receive the first name and last name (Step 1)
  
  public EmailApp(String firstname, String lastname) 
  
    {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.department=setDepartment(); //call the method here to return the department
		//System.out.println("EMAIL CREATED: "+this.firstname+"."+this.lastname);
		this.randomPassword=setPassword(defaultPasswordLength);//call the method to random passsword
		//System.out.println("Your password is: "+this.password);
		
		//Combine elements to generate email
		
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department +"."+ companySuffix;
		System.out.println("Your Email is "+email);
	}
	  

//ASk for the department (Step 2)
  
  private String setDepartment() 
  
  {
	System.out.println("DEPARTMENT CODES: \n1:Sales \n2:Development \n3:Coding \n0: None \nEnter the department code: ");
	int deptChoice;
	Scanner scan=new Scanner(System.in);
	deptChoice=scan.nextInt();
	if(deptChoice==1)
	{
		return "Sales";
	}
	else if(deptChoice==2)
	{
		return "Development";
	}
	else if(deptChoice==3)
	{
		return "Coding";
	}
	else
	{
		return "";
	}
  }
  
  
  //Generate a password random (Step 3)
  

  private String setPassword(int length) 
  {
	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%^&*!";
	char[] password=new char[length];
	for(int i=0;i<length;i++)
	{
		int rand=(int) (Math.random()* passwordSet.length());
		password[i]=passwordSet.charAt(rand);
	}
	
	return new String(password);
}
  
  //set the mailbox capacity
  
  public void setCapacity(int storageLimit)
  {
	  this.capacity=storageLimit;
  }
  
  //define an alternate email address
  public void setAlternateEmail(String alternateEmail) 
  {
		this.alternateEmail = alternateEmail;
	}
  
  //change the password
  public void setActualPassword(String randomPassword)
  {
	  this.randomPassword=randomPassword;
  }
  
  //get the capacity,password,alternate email
  
  public int getCapacity()
  {
	return capacity;
	  
  }
  
  public String getAlternateEmail()
  {
	return alternateEmail;
	   
  }
  
  public String getActualPassword()
  {
	return randomPassword ;
	  
  }
  
  public String showInfo()
  {
	return "Name Of the Worker : "+firstname+" "+lastname+
			"\nComapany Email : "+email+
			"\nMailBox capacity : "+capacity;
			
	  
  }
}
