package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utils.PageActions;

public class HomePage extends PageActions {
	 WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	//paths for expense and manage expense//
	@FindBy(xpath="(//*[contains(text(),'Manage Expense')])[1]")
	WebElement manageExpsene;
	
	
	@FindBy(xpath="//p[contains(text(),'Expense Category')]")
	WebElement expenseCategory;
	
	@FindBy(xpath="(//*[contains(text(),'Manage Expense')])[2]")
	WebElement manageExpenseBtn;
	
	
	@FindBy(css="[class='brand-text font-weight-light']")
	WebElement brandname;
	
	@FindBy(xpath="//*[contains(text(),'Manage Delivery Boy')]")
	WebElement manageDeleveryBoy;
	
	@FindBy(xpath="//*[@class='nav nav-pills nav-sidebar flex-column']/li[14]")
	WebElement managePayment;
	
	@FindBy(xpath="//*[@class='nav nav-pills nav-sidebar flex-column']/li[6]/a")
	WebElement pushnotification;
	
	@FindBy(xpath="//*[@class='nav nav-pills nav-sidebar flex-column']/li[5]/a")
	WebElement manageContent;
	
	@FindBy(xpath="//*[@class='nav nav-pills nav-sidebar flex-column']//li[7]/ul[1]/li/a/p")
	WebElement managePage;
	
	@FindBy(xpath="//*[contains(text(),'Manage News')]")
	private WebElement manageNews;
	
	@FindBy(xpath="//*[@class='nav nav-pills nav-sidebar flex-column']/li[10]/a")
	private WebElement mobileSlider;
	
	@FindBy(xpath="//*[@class='nav nav-pills nav-sidebar flex-column']/li[1]/a")
	WebElement dashboard;
	
	@FindBy(xpath="//*[@class='row']/div[2]//div/a")
	WebElement moreInfo;
	
	@FindBy(xpath="//*[@class='row']/div[4]//div/a")
	WebElement moreInfoCategoty;
	
	@FindBy(xpath="//*[@class='nav nav-pills nav-sidebar flex-column']/li[7]")
	WebElement manageSlidder;
	
	@FindBy(xpath="//*[@class='nav nav-pills nav-sidebar flex-column']/li[6]")
	WebElement manageLocation;
	
	@FindBy(xpath="//*[@class='nav nav-pills nav-sidebar flex-column']/li[2]/a")
	WebElement manageOrders;
	

	@FindBy(xpath="//*[@class='nav nav-pills nav-sidebar flex-column']/li[8]/a")
	WebElement manageCategory;
	  
	@FindBy(xpath="//*[@class='nav-item has-treeview menu-open']/ul[2]/li[1]/a")
	WebElement manageSubCategory;
	
	@FindBy(xpath="//*[@class='row']/div[6]//div/a")
	WebElement manageOfferCode;
	
	
	//*[@class='row']/div[6]//div/a
	@Test
	public String getBrandName() {
		
		return brandname.getText();
		
	}
	@Test
	public void navigateToExpenseCategory() {
		//firstly we use this method,then modity it bt wrapping this in pageaction class and use it here(below mehods)
		 //manageExpsene.click();
		//expenseCategory.click();
		// we create a method in pageaction class, then use that method clickElement for clicking manage button and expense button//
		clickElement(manageExpsene);
		clickElement(expenseCategory);
	}
	public void navigateToManageDeilveryBoy() {
		clickElement(manageDeleveryBoy);
	}
	public void navigateToManagePayment() {
		clickElement(managePayment);
	}
	public void navigateToPushnotification() {
		clickElement(pushnotification);
	}
	public void navigateToAddExpense() {
		clickElement( manageExpsene);
		clickElement(manageExpenseBtn);
	}
	public void navigateToManageContent() {
		clickElement( manageContent);
		clickElement( managePage);
	}
	public void navigateToNewsPage() {
		clickElement(manageContent);
		clickElement(manageNews);
		
	}
	public void navigateToManageSlider() {
		clickElement(mobileSlider);
	}
	public void navigateToAddUsers() {
		clickElement(dashboard);
		clickElement(moreInfo);
	}
	public void  navigateTocategoryPage() {
		clickElement(dashboard);
		clickElement( moreInfoCategoty);
	}
	public void  navigateToManageslider() {
		clickElement(manageSlidder);
		
	}
	public void  navigateToManageLocation() {
		clickElement(manageLocation);
	}
	public void  navigateToManageOrders() {
		clickElement(dashboard);
		clickElement(manageOrders);
	}
	public void  navigateToSubcategory() throws Exception {
		clickElement(manageCategory);
		Thread.sleep(1000);
		clickElement(manageSubCategory);
	}
	public void  navigateToManageOfferCodePage() throws Exception {
		clickElement(dashboard);
		Thread.sleep(1000);
		clickElement(manageOfferCode);
	}
}
