package com.sample;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.drools.core.impl.InternalKnowledgeBase;
import org.drools.core.impl.KnowledgeBaseFactory;
import org.drools.core.marshalling.impl.ProtobufMessages.KnowledgeBase;
import org.junit.Test;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

public class Testing {

	@Test
	 public void testRules() {

	 @SuppressWarnings("restriction")
	StatefulKnowledgeSession session = null;
	 try {
	 @SuppressWarnings("restriction")
	KnowledgeBuilder builder = KnowledgeBuilderFactory.newKnowledgeBuilder();
	 builder.add(ResourceFactory.newClassPathResource("discount.drl"), ResourceType.DRL);
	 if (builder.hasErrors()) {
	 throw new RuntimeException(builder.getErrors().toString());
	 }

	 @SuppressWarnings("restriction")
	InternalKnowledgeBase knowledgeBase = KnowledgeBaseFactory.
	newKnowledgeBase();
	 knowledgeBase.addPackages(builder.getKnowledgePackages());

	 session = (StatefulKnowledgeSession) knowledgeBase.newStatelessKieSession();

	 // purchase > $15 and <= $25
	 Cart firstPurchase = new Cart(new BigDecimal("16"), false,
	1);
	 FactHandle purchaseFact = session.insert(firstPurchase);
	 session.fireAllRules();

	 System.out.println("----------------");

	 // purchase > $25
	 firstPurchase = new Cart(new BigDecimal("26"), false, 1);
	 session.update(purchaseFact, firstPurchase);
	 session.fireAllRules();
	 System.out.println("----------------");

	 // combo purchase containing 3 tacos and a drink
	 firstPurchase = new Cart(new BigDecimal("26"), true, 3);
	 session.update(purchaseFact, firstPurchase);
	 session.fireAllRules();
	 } catch(Throwable t) {
	 t.printStackTrace();
	 } finally {
	 if (session != null) {
	 session.dispose();
	 }
	 }

}
}
