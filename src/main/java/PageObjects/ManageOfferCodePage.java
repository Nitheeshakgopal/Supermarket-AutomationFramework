package PageObjects;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;
import context.Constants;

public class ManageOfferCodePage extends PageActions {
	
	WebDriver driver;
	public ManageOfferCodePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@class='col-sm-12']/a[1]")
	WebElement newBtn;
	
	@FindBy(xpath="//*[@id='offer_code']")
	WebElement offercodeBtn;
	
	@FindBy(xpath="//*[@id='form']/div/div[2]/label[2]")
	WebElement orderuserBtn;
	
	@FindBy(xpath="//*[@id='offer_per']")
	WebElement percentageBtn;
	
	@FindBy(xpath="//*[@id='offer_price']")
	WebElement amountBtn;
	
	@FindBy(xpath="//*[@id='form']/div/div[5]/div/div/div[3]/div[2]")
	WebElement description;
	
	@FindBy(id="main_img")
	WebElement imageupload;
	
	@FindBy(xpath="//*[@name='create']")
	WebElement saveBtn;
	  
	
 public void manageOfferCodePage() throws AWTException {
	 clickElement(newBtn);
	 setTextBox( offercodeBtn,"ABCD");
	 clickElement(orderuserBtn);
	 setTextBox( percentageBtn,"80%");
	 setTextBox( amountBtn,"1000");
	 setTextBox( description,"Descriptions");
	 uploadImage(imageupload,Constants.IMAGEFILE);
	 scrollToBottomofPage();
	 shortWait();
	 scrollToBottomofPage();
	 shortWait();
	 clickElement(saveBtn);
 }
	  
}
