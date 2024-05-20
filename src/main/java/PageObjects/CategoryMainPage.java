package PageObjects;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;
import Utils.UniqueGenerator;
import context.Constants;

public class CategoryMainPage extends PageActions {
	
	WebDriver driver;
	
	public CategoryMainPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@class='content']/div/a[1]")
	WebElement newbtn;
	
	@FindBy(css="[name='category']")
	WebElement category;
	
	@FindBy(xpath="//*[@class='ms-container']/div[1]/ul")
	WebElement selectGroup;
	
	@FindBy(xpath=" //*[@id=\"form\"]/div/div[4]/div[1]/label[2]/input")
	WebElement showtype;
	
	@FindBy(xpath="//*[@id='main_img']")
	WebElement upload;
	
	@FindBy(xpath="//*[@id='form']/div/div[5]/button")
	WebElement saveBtn;
	
	public void addCategoryMainPage() throws AWTException {
		clickElement(newbtn);
		setTextBox(category,UniqueGenerator.getCurrentDateTime());
		clickElement(selectGroup);
		scrollToBottomofPage();
		uploadImage(upload,Constants.IMAGEFILE);
		clickElement(showtype);
		clickElement(saveBtn);
	}
}
