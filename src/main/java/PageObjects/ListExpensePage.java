package PageObjects;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;
import Utils.UniqueGenerator;
import context.Constants;

public class ListExpensePage extends PageActions{
	  WebDriver driver;
	
	 public ListExpensePage(WebDriver driver) {
		 super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	 @FindBy(id = "user_id")
		private WebElement userDropdown;
		
		@FindBy(id = "ex_type")
		private WebElement expenseDropdown;

		@FindBy(id = "amount")
		private WebElement amountInput;
		
		@FindBy(css = "[name='userfile']")
		private WebElement chooseFile;
		
		@FindBy(css = "[name='create']")
		private WebElement saveBtn;
		
		@FindBy(xpath="(//*[contains(text(),'Manage Expense')])[2]")
		WebElement manageExpseneBtn;
		
		@FindBy(xpath="//table/tbody/tr[1]/td[8]/div/a/i")
		WebElement imageOpenArrow;
		
		@FindBy(xpath = "//table/tbody/tr[2]/td/div/div/span/a")
		private WebElement uploadedPhoto;
		
	// public void moveToexpense() {
		 //clickElement( newBtn);
	 //}
	 
	public String  addExpense() throws InterruptedException, AWTException {
		clickElement(newBtn);
		handleStaticDropdown(userDropdown,"Admin(Admin)");
		handleStaticDropdown(expenseDropdown,"Credit Bank");
		setTextBox(amountInput,UniqueGenerator.getRandomNumber());
		scrollToBottomofPage();
		Thread.sleep(1000);
		uploadImage(chooseFile,Constants.IMAGEPATH);
		Thread.sleep(1000);
		clickElement(saveBtn);
		String alertText = alertMsg.getText();
		return splitStringMSG(alertText);
	}
	public boolean isUploadedPhotoExist() {
		clickElement(manageExpseneBtn);
		clickElement(imageOpenArrow);
		clickElement(uploadedPhoto);
		waitUntilVisible(uploadedPhoto);
		return 	isElementDisplayed(uploadedPhoto);
		
	}

}
