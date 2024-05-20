package com.supermartket.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class ManagePage extends BaseTest {
      @Test
	public void verifyManagePage() throws AWTException, InterruptedException, IOException {
		lp.login();
		hp.navigateToManageContent();
		mcp.addManagePage();
	}
	
	
	
	
}
