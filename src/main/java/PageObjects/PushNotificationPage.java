package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utils.PageActions;

public class PushNotificationPage extends PageActions {
  
	WebDriver driver;
	
	public PushNotificationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(css="[id='title']")
	WebElement title;
	@FindBy(css="[id='description']")
	WebElement description;
	@FindBy(css="[name='create']")
    WebElement send;
	
	@FindBy(xpath="//*[@class='alert alert-success alert-dismissible']")
	WebElement alertMsg;
	
	
	@Test
	public String navigateToPushnotification() {
		
		setTextBox(title,"PracticeTime");
		setTextBox(description,"First Time Practice");
		clickElement(send);
		String alertText=alertMsg.getText();
		System.out.println(alertText);
		return splitStringMSG(alertText);
	
	}
	
}
