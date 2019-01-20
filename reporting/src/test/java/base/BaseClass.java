package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	
	 public ChromeDriver driver;
	 @BeforeMethod
	  public void createDriver(){
	 	  System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver.exe");
	 	  ChromeDriver driver = new ChromeDriver();
	   	 driver.get("https://www.facebook.com");
	 	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	  }
	  
	 @AfterMethod
	  public void quitDriver(){
		 if (driver != null){
			 driver.quit();
		 }
	  }
	 @AfterSuite
	 public void generateReport(){
		 System.out.println("This is my report");
	 }
}
