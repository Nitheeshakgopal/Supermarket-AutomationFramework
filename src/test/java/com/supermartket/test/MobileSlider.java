package com.supermartket.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class MobileSlider extends BaseTest{
	@Test
	public void verifyMobileSlider() throws AWTException, InterruptedException, IOException {
	lp.login();
	hp.navigateToManageSlider();
	Thread.sleep(2000);
	ms.mobileSlider();
	}
	
}
