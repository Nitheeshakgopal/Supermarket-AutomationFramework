package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.PageActions;

public class ExpenseCategoryPage extends PageActions {
         
    WebDriver driver;
	
	public ExpenseCategoryPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='btn btn-rounded btn-danger']")
	WebElement newbtn;
	
	@FindBy(xpath="//*[@id='name']")
	WebElement titleInput;
	
	@FindBy(css="[name='Create']")
	WebElement saveBtn;
	
	@FindBy(xpath="//*[@class='alert alert-success alert-dismissible']")
	WebElement alertMsg;
	
	
	@FindBy(xpath="//*[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[2]/a[2]")
	WebElement deletetMsg;
	
	
	
	public String createExpense(String uniqueExpense) {
		
		/*newbtn.click();
		 titleInput.sendKeys("Client");
		 saveBtn.click();
		 String alertText=alertMsg.getText();
		 System.out.println(alertText);
		 //normally we use this kind of actions.this one is also true we can use this mrthod.But better to use below method.
		 */
		    clickElement(newbtn);
			setTextBox(titleInput,uniqueExpense);
			clickElement(saveBtn);
			
			String alertText=alertMsg.getText();
			
			return splitStringMSG(alertText);
	}
	
	public String deleteExpense() {
	    clickElement(deletetMsg);
	    acceptAlert();
	    String alertText = alertMsg.getText();
	    System.out.println(alertText);
	    return splitStringMSG(alertText);
	   
	    

	}    
}

    








