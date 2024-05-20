package supermarketframework;

import org.testng.annotations.Test;

import com.supermartket.test.BaseTest;

public class ManageSubcategory extends BaseTest{
@Test
	public void verifyManageSubcategory() throws Exception {
		lp.login();
		hp.navigateToSubcategory();
		mscp.managesubcategory();
	}
	
	
}
