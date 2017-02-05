package org.pradeep.javaperks.Credit;

import java.util.Date;

public class CreditCard {
	
	int cardNbr;
	String cardName;
	CardHolderInfo cardHolderInfo;
	Date expDate;
	int securityCode;
	
	public CreditCard(int cardNbr, String cardName, CardHolderInfo cardHolderInfo, Date expDate, int securityCode){
		this.cardName = cardName;
		this.cardNbr = cardNbr;
		this.cardHolderInfo = cardHolderInfo;
		this.expDate = expDate;
		this.securityCode = securityCode;  
		
	}

}
