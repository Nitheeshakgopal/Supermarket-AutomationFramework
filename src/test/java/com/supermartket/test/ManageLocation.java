package com.supermartket.test;

import org.testng.annotations.Test;

public class ManageLocation extends BaseTest{
	@Test
	public void verifyManageLocation() throws Exception{
		lp.login();
		hp.navigateToManageLocation();
		ml.manageLocation();
		
		
	}

}
