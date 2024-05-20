package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;

public class CreateDeliveryPage extends PageActions {

	
WebDriver driver;
	
	public CreateDeliveryPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	

	
	@FindBy(xpath="//*[@id='name']")
	WebElement name;
	
	@FindBy(xpath="//*[@id='username']")
	WebElement userName;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	@FindBy(css = "[name='create']")
	protected WebElement saveBtn;
	
	@FindBy(css = ".alert-success.alert-dismissible")
	protected WebElement alertMsg;
	
	
	public String  navigateToDeliveryBoyPage(String nameVal, String usernameVal,  String passwordVal) throws InterruptedException {
		
		clickElement(newBtn);
		setTextBox(name,nameVal);
		setTextBox(userName,usernameVal);
		setTextBox(password,passwordVal);
		scrollToBottomofPage();
		Thread.sleep(1000);
		clickElement(saveBtn);
		String alertText =alertMsg.getText();
		return splitStringMSG(alertText);
	}
	
	
	
	
	
}
