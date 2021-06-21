package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolTest {

	public static void main(String[] args) 
	{
		try {
		      // Load the knowledge base:
		      KieServices ks = KieServices.Factory.get();
		      KieContainer kContainer = ks.getKieClasspathContainer();
		      KieSession kSession = kContainer.newKieSession("ksession-rules");

		      // Go!
		      DepositRequest p = new  DepositRequest();
		      p.setName("Raju");
		      p.setLoanType("Savings");
		      p.setDurationInYear(5);
		      p.setAge(72);

		      kSession.insert(p);
		      kSession.fireAllRules();
		    }

		    catch (Throwable t) {
		      t.printStackTrace();
		    }
}
}
