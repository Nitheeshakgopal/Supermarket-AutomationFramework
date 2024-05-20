package com.supermartket.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class ManageSliderPage extends BaseTest{
     @Test  
	public void manageSliderPage() throws IOException, AWTException, InterruptedException {
	lp.login();
	hp.navigateToManageslider();
	msp.manageSlider();
		
	}
	
	
	
}
