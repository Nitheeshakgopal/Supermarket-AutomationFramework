package PageObjects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utils.PageActions;
import Utils.TestProperties;

public class LoginPage extends PageActions {
	WebDriver driver;
	//creating constructor//
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//*[@name='username']")
    WebElement user;
	@FindBy(css="[name='password']")
	WebElement pass;
	@FindBy(css="[type='submit']")
	WebElement submit;
	
	@Test
	public void login() throws IOException {
		System.out.println("ERROR");
		Properties prop = TestProperties.getProperties();
		setTextBox( user, prop.getProperty("username"));
		setTextBox(pass, prop.getProperty("password"));
		clickElement(submit);
		
	}
	
}
