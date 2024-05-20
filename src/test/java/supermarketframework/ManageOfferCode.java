package supermarketframework;

import org.testng.annotations.Test;

public class ManageOfferCode extends BaseTest {
     @Test
	public void verifyMaanageOffercodePage() throws Exception {
		lp.login();
		hp.navigateToManageOfferCodePage();
		moc.manageOfferCodePage();
		
		
		
		
	}
	
	
	
}
