package org.pradeep.javaperks.Credit;

public interface CreditCardInterface {
	
	boolean storeCardInfo(CreditCard card);
	
	boolean getCardDetails(int cardNbr);
	
	double getAvailableBalanceToPurchase(int cardNbr);
	
}
