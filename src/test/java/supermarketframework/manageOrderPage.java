package supermarketframework;

import java.io.IOException;

import org.testng.annotations.Test;

import com.supermartket.test.BaseTest;

public class manageOrderPage extends BaseTest {
	@Test
	public void verifyManageOrderPage() throws IOException, InterruptedException {
		lp.login();
		hp.navigateToManageOrders();
		mo.searchListOrders();
	}
	
	

}
