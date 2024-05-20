package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;
import Utils.UniqueGenerator;

public class ManageLocationPage extends PageActions{

	WebDriver driver;
	
	 public ManageLocationPage(WebDriver driver) {
		 super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	 }
		
		@FindBy(xpath="//*[@class='col-sm-12']/a[1]")
		 WebElement newbtn;
		@FindBy(css="[name='country_id']")
		 WebElement countryBtn;
		
		@FindBy(xpath="//*[@id='st_id']")
		 WebElement stateBtn;
		
		@FindBy(css="[name='location']")
		 WebElement locationBtn;
		
		@FindBy(css="[name='delivery']")
		 WebElement deliverychargeBtn;
		
		@FindBy(xpath="//*[contains(text(),'Save')]")
		 WebElement saveBtn;
		
		
		public void manageLocation() throws InterruptedException {
			 clickElement(newbtn);
			 handleStaticDropdown(countryBtn,"United Kingdom");
			 Thread.sleep(1000);
			 handleStaticDropdown(stateBtn,"Northern Ireland");
			 Thread.sleep(1000);
			 setTextBox(locationBtn,"Australia");
			 Thread.sleep(1000);
			 setTextBox(deliverychargeBtn,UniqueGenerator.getRandomNumber());
			 scrollToBottomofPage();
			 shortWait(); 
			 clickElement(saveBtn);
			
		}
		
		
	
}
