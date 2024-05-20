package com.supermartket.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class AddExpense extends BaseTest {
	
	
	@Test
	public void verufyUserIsAbleToAddExpense() throws InterruptedException, AWTException, IOException {
	lp.login();
	hp.navigateToAddExpense();
	lep.addExpense();
    boolean  photoDisplayed=lep.isUploadedPhotoExist();
    System.out.println(photoDisplayed);
	
	
	
	
	
	}
	
	
	

}
