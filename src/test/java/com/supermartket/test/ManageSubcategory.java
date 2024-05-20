package com.supermartket.test;

import org.testng.annotations.Test;

public class ManageSubcategory extends BaseTest{
@Test
	public void verifyManageSubcategory() throws Exception {
		lp.login();
		hp.navigateToSubcategory();
		mscp.managesubcategory();
	}
	
	
}
