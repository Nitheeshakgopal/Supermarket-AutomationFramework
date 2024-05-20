package com.supermartket.test;

import java.io.IOException;

import org.testng.annotations.Test;

public class ManagePayment extends BaseTest {
	@Test
	public void managePaymentVerification() throws InterruptedException, IOException {
		lp.login();
		hp.navigateToManagePayment();
		Thread.sleep(1000);
		mpp.navigateToManagePayment();
	
		
	}
	
	

}
