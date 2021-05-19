package com.sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class LargeOrderDiscountTest 


{
	KieServices ks = KieServices.Factory.get();
    KieContainer kContainer = ks.getKieClasspathContainer();
	KieSession kSession = kContainer.newKieSession("ksession-rules");
	@Test
	public void testLargeOrderDiscount_over1000() 
	
	{
	      // Add facts to working memory
	      Order order = new Order();
	     
	}
}
