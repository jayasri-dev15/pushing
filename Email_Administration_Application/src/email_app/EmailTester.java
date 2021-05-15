package email_app;

public class EmailTester 

{

	public static void main(String[] args) 
	
	{
		EmailApp email=new EmailApp("Jayasri", "Rajasundaram");
		
       // email.setAlternateEmail("Jai@gmail.com");
      //  System.out.println(email.getAlternateEmail());
        
        System.out.println(email.showInfo());
	}

}
