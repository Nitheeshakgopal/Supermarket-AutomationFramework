package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;

public class AdminUsersPage extends PageActions{
	
	WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='content']/div/a[1]")
	WebElement newbt;
	@FindBy(xpath="//*[@id='username']")
	WebElement username;
	@FindBy(xpath="//*[@id='password']")
	WebElement Password;
	@FindBy(xpath="//*[@id='user_type']")
	WebElement UsertypeDropdown;
	
	@FindBy(css="[name='Create']")
	WebElement savebtn;
	
   public String createAdminUsers(String userName, String password, String userType) {
	   clickElement(newbt);
	   setTextBox(username,userName);
	   setTextBox(Password, password);
	   handleStaticDropdown(UsertypeDropdown,"Admin");
	   clickElement(savebtn);
	   String alertText=alertMsg.getText();
		System.out.println(alertText);
		return splitStringMSG(alertText);
		
	}
	

}
