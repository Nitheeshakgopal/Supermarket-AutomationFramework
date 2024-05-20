package supermarketframework;

import org.testng.annotations.Test;

import com.supermartket.test.BaseTest;

public class ManageOfferCode extends BaseTest {
     @Test
	public void verifyMaanageOffercodePage() throws Exception {
		lp.login();
		hp.navigateToManageOfferCodePage();
		moc.manageOfferCodePage();
		
		
		
		
	}
	
	
	
}
