package com.supermartket.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.UniqueGenerator;

public class ManageExpense extends BaseTest{
	
	@Test
	public void verifyLogin() throws IOException {
		
		
		lp.login();
		hp.navigateToExpenseCategory();
		
		String actualBrandName=hp.getBrandName();
		//HomePage hp1=new HomePage(driver);
		//creating object for calling method in home page//
		//hp1.navigateToExpenseCategory();
		System.out.println(actualBrandName);
		//ExpenseCategoryPage obj=new ExpenseCategoryPage(driver);
		//obj.createExpense();
		
        String uniqueName= UniqueGenerator.getUniqueString("Client");
	     
	     String actualCreationAlertMsg=ecp.createExpense(uniqueName);
	     System.out.println(actualCreationAlertMsg);
	    
	     //Assertion for alert creation
	     Assert.assertEquals(actualCreationAlertMsg, "Expense Category Created Successfully");
	     
	     
	     ecp.deleteExpense();
	     System.out.println( ecp.deleteExpense());
	     
	     
	   
	     
		
		
	}
	
	

}
