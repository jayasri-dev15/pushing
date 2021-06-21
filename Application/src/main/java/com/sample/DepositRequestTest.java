package com.sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Results;

public class DepositRequestTest 

{

	@Test
	public void Fixed_Deposit_Test() 
	
	{
		String drl="package com.sample.rules\n"+
	               "import com.sample.DepositRequest\n"+
				   "rule \"Intrest rate for fixed deposit\"\n"+
	               "when \n"+
				   "d:DepositRequest  (loanType == \"Fixed\" && (durationInYear >= 1 || durationInYear <= 2) && age < 60)\n"+
	               "then \n"+
				   "d.setInterestRate(3); \n"+
	               "System.out.println(\"The name of the applicant is \"+d.getName()+\" the interest is of \"+d.getInterestRate()); \n"+
	               "end\n";
		
		KieServices ks = KieServices.Factory.get();
	   KieFileSystem kfs = ks.newKieFileSystem().write( "src/main/resources/analysis.drl", drl );
	   Results results = ks.newKieBuilder( kfs ).buildAll().getResults();
	    DepositRequest d=new DepositRequest();
	    d.setName("Raju");
	    d.setLoanType("Fixed");
	    d.setDurationInYear(1);
	    d.setAge(22);
	    
	    assertEquals("The name of the applicant is Raju the interest is of 3", "The name of the applicant is "+d.getName()+" the interest is of "+d.getInterestRate());
	    
	    //assertFalse( results.getMessages().isEmpty() );
	   // assertTrue(drl, true);
	    
	   // assertFalse(drl, false);
	}

}
