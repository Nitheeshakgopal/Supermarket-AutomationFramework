package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;
import Utils.UniqueGenerator;

public class NewsPage  extends PageActions{
	private WebDriver driver;
	
	public NewsPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#news")
	private WebElement newsInput;
	
	@FindBy(css = "[name='create']")
	protected WebElement saveBtn;
	
	@FindBy(xpath= "//*[@class='content']/div[1]/a[1]")
	protected WebElement newbtns;
	
	public String validateNewsIsCreated() {
		clickElement(newbtns);
		setTextBox(newsInput, UniqueGenerator.getCurrentDateTime().toString());
		clickElement(saveBtn);
		String alertText=alertMsg.getText();
		System.out.println(alertText);
		return splitStringMSG(alertText);
		
	}
	

}
