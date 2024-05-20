package supermarketframework;

import org.testng.annotations.Test;

import com.supermartket.test.BaseTest;

public class ManageLocation extends BaseTest{
	@Test
	public void verifyManageLocation() throws Exception{
		lp.login();
		hp.navigateToManageLocation();
		ml.manageLocation();
		
		
	}

}
