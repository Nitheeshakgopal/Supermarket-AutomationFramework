package PageObjects;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;
import context.Constants;

public class MobileSliderPage extends PageActions{

	WebDriver driver;
	
	 public  MobileSliderPage(WebDriver driver) {
		 super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@class='content']/div[1]/a[1]")
	 WebElement newicon;
	 
	 @FindBy(css="[name='cat_id']")
	 WebElement dropDown;
	 
	 @FindBy(css="#main_img")
	 WebElement uploadFile;
	 
	 @FindBy(xpath="//*[@class='btn btn-danger']")
	 WebElement save;
	 
	 public void mobileSlider() throws AWTException, InterruptedException {
		 clickElement(newicon);
		 handleStaticDropdown(dropDown,"Apple");
		 Thread.sleep(1000);
		 uploadImage(uploadFile,Constants.IMAGEPATH);
		 Thread.sleep(1000);
		 clickElement(save);
		 
	 }
	
	
	
}
