package context;

import org.openqa.selenium.WebDriver;

public class DriverManager {

private static ThreadLocal<WebDriver> driverInstance= new ThreadLocal<WebDriver>();
	//this method used for parallel execution//
//we already stamp the driver in listeners class here we tell to the browser that if the driver instance is null get exception and if the driver 
//has the value return the value as driverInstance.get//
	
   public static WebDriver getDriver() {
		if(driverInstance.get()==null) {
		throw new IllegalArgumentException("Webdriver is null");
		}
		else { 
			return  driverInstance.get();
		}
	
	}
	
	public static void setDriver(WebDriver driver) {
		driverInstance.set(driver);
	}
	
	
}
