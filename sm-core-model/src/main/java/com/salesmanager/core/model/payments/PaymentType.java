package com.salesmanager.core.model.payments;

public enum PaymentType {
	
	
	
	CREDITCARD("creditcard"), FREE("creditcard"), COD("creditcard"), MONEYORDER("creditcard"), PAYPAL("creditcard"), STRIPE("creditcard"), WEPAY("creditcard");

	
	private String paymentType;
	
	PaymentType(String type) {
		paymentType = type;
	}
	
    public static PaymentType fromString(String text) {
		    if (text != null) {
		      for (PaymentType b : PaymentType.values()) {
		    	String payemntType = text.toUpperCase(); 
		        if (payemntType.equalsIgnoreCase(b.name())) {
		          return b;
		        }
		      }
		    }
		    return null;
	}
}
