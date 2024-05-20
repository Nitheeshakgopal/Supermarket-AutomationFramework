package PageObjects;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;
import Utils.UniqueGenerator;
import context.Constants;

public class ManageContent extends PageActions {
	
	WebDriver driver;
	
	 public ManageContent(WebDriver driver) {
		 super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@class='content']/div/a[1]")
	 WebElement newbtnContent;
	 
	 @FindBy(css="[name='title']")
	 WebElement titleFieldt;
	 
	 @FindBy(xpath="//*[@class='note-editable card-block']")
	 WebElement description;
	 
	 @FindBy(xpath="//*[@id='main_img'] ")
	 WebElement uploadFile;
	 
	 @FindBy(xpath="//*[@class='btn btn-danger']")
	 WebElement savebt;
	 
	 @FindBy(xpath="//*[@id='page']")
	 WebElement pageNumber;
	
	public void addManagePage() throws AWTException, InterruptedException {
		clickElement( newbtnContent);
		setTextBox(titleFieldt,"managepayment");
		setTextBox(description,"Nitheesha");
		setTextBox(pageNumber,UniqueGenerator.getRandomNumber());
		scrollToBottomofPage();
		uploadImage(uploadFile,Constants.IMAGEFILE);
		Thread.sleep(1000);
		clickElement(savebt);
	}
		 
	 

}
