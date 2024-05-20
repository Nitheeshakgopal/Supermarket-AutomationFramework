package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;

public class ManageOrderPage extends PageActions{
	WebDriver driver;
	public ManageOrderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@class='col-sm-12']/a[1]")
	WebElement searchBtn;
	
	@FindBy(css="[id='od']")
	WebElement orderId;
	
	@FindBy(css="[id='um']")
	WebElement userId;
	
	@FindBy(css="[id='sd']")
	WebElement startDate;
	
	@FindBy(css="[id='ed']")
	WebElement endtDate;
	
	@FindBy(css="[id='pt']")
	WebElement paymentMethod;
	
	@FindBy(css="[id='st']")
	WebElement status;
	
	@FindBy(css="[name='Search']")
	WebElement saveBtn;
	
	
	public void searchListOrders() throws InterruptedException {
		clickElement(searchBtn);
		setTextBox(orderId,"111");
		Thread.sleep(1000);
		setTextBox(startDate,"15-10-2020");
		Thread.sleep(2000);
		setTextBox(endtDate,"15-10-2024");
		 handleStaticDropdown( paymentMethod,"COD");
		 handleStaticDropdown( status,"Delivered");
		 //clickElement(saveBtn);
	}

	
		
	

}
