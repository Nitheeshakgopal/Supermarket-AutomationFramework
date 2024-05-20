package supermarketframework;

import java.io.IOException;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import PageObjects.AdminUsersPage;
import PageObjects.CategoryMainPage;
import PageObjects.CreateDeliveryPage;
import PageObjects.ExpenseCategoryPage;
import PageObjects.HomePage;
import PageObjects.ListExpensePage;
import PageObjects.LoginPage;
import PageObjects.ManageContent;
import PageObjects.ManageLocationPage;
import PageObjects.ManageOfferCodePage;
import PageObjects.ManageOrderPage;
import PageObjects.ManagePaymentPages;
import PageObjects.ManageSubcategoryPage;
import PageObjects.Manageslider;
import PageObjects.MobileSliderPage;
import PageObjects.NewsPage;
import PageObjects.PushNotificationPage;
import Utils.TestProperties;
import context.DriverManager;

public class BaseTest {
	//creating driver reference//
	 
	WebDriver driver=null;
	
	 @BeforeMethod(alwaysRun=true)
	 @Parameters({"browserName"})
	public void initialization(@Optional String browserName)  throws IOException{
		 
		 Properties prop = TestProperties.getProperties();
			if(browserName==null || browserName.isEmpty()) {
				browserName=prop.getProperty("browserName");
			}
		 
		//Properties prop=TestProperties.getProperties();
		//String browser=prop.getProperty("browserName");
		String env=prop.getProperty("Environment");
		String URL=prop.getProperty(env);
		System.out.println("Executing tests :"+ env +"  Envrionment");
		System.out.println(URL);
		
		// here we can enter different browser name
		
	
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			
		}
		DriverManager.setDriver(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		initPages();
	}
	public LoginPage lp;
	public HomePage hp;
	public ExpenseCategoryPage ecp;
	public CreateDeliveryPage dboy;
	public  ManagePaymentPages mpp;
	public PushNotificationPage pn;
	public ListExpensePage lep;
	public ManageContent mcp;
	public NewsPage news;
	public  MobileSliderPage ms;
	public  AdminUsersPage admin;
	public CategoryMainPage mc;
	public Manageslider msp;
	public  ManageLocationPage  ml;
	public  ManageOrderPage mo;
	public ManageSubcategoryPage mscp;
	public  ManageOfferCodePage moc;
	public void initPages() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		ecp= new ExpenseCategoryPage(driver);
		dboy=new CreateDeliveryPage(driver);
		mpp=new ManagePaymentPages(driver);
		 pn=new PushNotificationPage(driver);
		 lep=new ListExpensePage(driver);
		 mcp=new ManageContent(driver);
		 news=new NewsPage (driver);
		 ms=new  MobileSliderPage(driver);
		admin=new AdminUsersPage(driver);
		mc=new CategoryMainPage(driver);
		msp=new Manageslider(driver);
		ml=new ManageLocationPage(driver);
		mo=new  ManageOrderPage(driver);
		mscp=new ManageSubcategoryPage(driver);
		moc=new  ManageOfferCodePage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		System.out.println("After method");	
	    driver.quit();
	}
}
	


