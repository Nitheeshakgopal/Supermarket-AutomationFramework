package com.supermartket.test;

import java.io.IOException;

import org.testng.annotations.Test;

public class manageOrderPage extends BaseTest {
	@Test
	public void verifyManageOrderPage() throws IOException, InterruptedException {
		lp.login();
		hp.navigateToManageOrders();
		mo.searchListOrders();
	}
	
	

}
