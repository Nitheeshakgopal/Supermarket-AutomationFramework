package supermarketframework;

import java.io.IOException;

import org.testng.annotations.Test;

import com.supermartket.test.BaseTest;

public class LoginTestCase extends BaseTest {
	@Test(groups="sanity")
  public void manageExpense() throws IOException {
		
	  lp.login();
	  
  }
	
     
	

}
