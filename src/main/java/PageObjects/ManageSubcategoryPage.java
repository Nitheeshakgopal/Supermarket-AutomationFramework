package PageObjects;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;
import context.Constants;

public class ManageSubcategoryPage extends PageActions {
	WebDriver driver;
	public ManageSubcategoryPage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@class='col-sm-12']/a[1]")
	WebElement newBtn;
	@FindBy(id="cat_id")
	WebElement category;
	
	@FindBy(id="subcategory")
	WebElement subCategory;
	
	@FindBy(id="main_img")
	WebElement imageUpload;
	
	@FindBy(xpath="//*[@id='form']/div/div[3]/button")
	WebElement saveBtn;

	
	public void managesubcategory() throws AWTException, Exception {
		 clickElement(newBtn);
		 handleStaticDropdown(category,"Small Leather Table");
		 setTextBox(subCategory,"Table");
		 uploadImage(imageUpload,Constants.IMAGEFILE);
		 shortWait();
		 scrollToBottomofPage();
		 shortWait();
		 clickElement(saveBtn);
		 
	}
	
	
	
	
	
}
