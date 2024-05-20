package PageObjects;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;
import context.Constants;

public class Manageslider extends PageActions{

	 WebDriver driver;
	
	 public Manageslider(WebDriver driver) {
		 super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@class='col-sm-12']/a[1]")
	 WebElement newbtn;
	 @FindBy(xpath="//*[@id='main_img']")
	 WebElement imageupload;
	 @FindBy(xpath="//*[@class='form-control']")
	 WebElement linkbtn;
	 @FindBy(css="[name='create']")
	 WebElement savebtn;
	 
	 public void manageSlider() throws AWTException, InterruptedException{
		 clickElement(newbtn);
		 Thread.sleep(1000);
		 uploadImage(imageupload,Constants.IMAGEPATH);
		 setTextBox(linkbtn,"https://groceryapp.uniqassosiates.com/admin/login");
		 clickElement(savebtn);
	 }
	
	
}
