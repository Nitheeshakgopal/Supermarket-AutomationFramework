package com.supermartket.test;

import java.io.IOException;

import org.testng.annotations.Test;

public class LoginTestCase extends BaseTest {
	@Test(groups="sanity")
  public void manageExpense() throws IOException {
		
	  lp.login();
	  
  }
	
     
	

}
