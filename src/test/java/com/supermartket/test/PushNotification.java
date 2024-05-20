package com.supermartket.test;

import java.io.IOException;

import org.testng.annotations.Test;

public class PushNotification extends BaseTest {
     @Test
     
	public void managePaymentVerification() throws IOException {
		lp.login();
		hp.navigateToPushnotification();
		pn.navigateToPushnotification();
		
	}
	
	
}


