package Utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import context.Constants;
import context.DriverManager;

public class PageActions {
 
       WebDriver driver;
       WebDriverWait wait;
	
	public PageActions(WebDriver driver) {
		
		this.driver=driver;
		 wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	}
	
	@FindBy(css = ".btn-rounded.btn-danger")
	protected WebElement newBtn;
	
	@FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']   ")
	protected WebElement alertMsg;
	
	@FindBy(css = "[name='Create']")
	protected WebElement saveBtn;

	public void clickElement(WebElement element) {
		
		element.click();
	}

	public void setTextBox(WebElement element, String value) {
		waitUntilVisible(element);
		element.sendKeys(value);
	}
	
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public String splitStringMSG(String alertText) {
		return alertText.split("Alert!")[1].trim();
		
	}	
	public void waitUntilVisible(WebElement element) {
		 wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitUntilClickable(WebElement element) {
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void scrollToBottomofPage() {
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public void handleStaticDropdown(WebElement dropdown,String visibleText) {
		Select staticDropdown=new Select(dropdown);
		staticDropdown.selectByVisibleText(visibleText);
	}
	public boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	public void javascriptClickElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	     
	}
	
	public void uploadImage(WebElement chooseFileBtn, String fileToUpload) throws AWTException {
		
		javascriptClickElement(chooseFileBtn);
		shortWait();
		StringSelection ss = new StringSelection(fileToUpload);
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

	     //imitate mouse events like ENTER, CTRL+C, CTRL+V
	     Robot robot = new Robot();
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void selectDate(WebElement element,String dateVal){
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);		
	}
	
	public static String getScreenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)DriverManager.getDriver();
	    File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String path = Constants.SCREENSHOTPATH;
	    File destFile = new File(path);
	    //FileUtils.moveFile(srcFile, destFile);
	    return path;
	}
	
	public void shortWait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	
	

