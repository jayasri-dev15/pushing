package com.sample;

import java.math.BigDecimal;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

public class DroolsTest

{

	public static void main(String[] args) 
	
	{
		KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
        try {
            Cart c=new Cart(new BigDecimal("16"), false,1);
            FactHandle fact=kSession.insert(c);
            kSession.fireAllRules();
            
            System.out.println("=================================");
            
            c = new Cart(new BigDecimal("26"), false, 1);
       	    kSession.update(fact, c);
    	    kSession.fireAllRules();
    	    System.out.println("=================================");
            
    	    c = new Cart(new BigDecimal("26"), true, 3);
    	    kSession.update(fact, c);
    	    kSession.fireAllRules();
            
            
        }catch (Throwable t) {
            t.printStackTrace();
        }
    }
}


