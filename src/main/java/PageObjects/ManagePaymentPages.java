package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;

public class ManagePaymentPages extends PageActions {
	
WebDriver driver;
	
	public ManagePaymentPages(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//table//tbody/tr[1]/td[4]/a")
	WebElement editPage;
	
	@FindBy(xpath="//*[@id='name']")
	WebElement title;
	
	@FindBy(css="[id='limit']")
	WebElement payLimit;
	@FindBy(css="[name='Update']")
	WebElement update;
	@FindBy(xpath="//table//tbody/tr[1]")
	WebElement display;
	
	@FindBy(xpath="//*[@class='alert alert-success alert-dismissible']")
	WebElement alertMsg;
	
	public String navigateToManagePayment() throws InterruptedException {
		clickElement(editPage);
		Thread.sleep(1000);
		title.clear();
		setTextBox(title,"NewPayment");
		payLimit.clear();
		setTextBox(payLimit,"10001");
		clickElement(update);
		String alertText=alertMsg.getText();
		System.out.println(alertText);
		boolean displayed=display.isDisplayed();
		System.out.println(displayed);
		return splitStringMSG(alertText);
		
	}
	
}
