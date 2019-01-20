package base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class TestBase {
 
	
  public ChromeDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver.exe");
 	  ChromeDriver driver = new ChromeDriver();
   	 driver.get("https://www.facebook.com");
 	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @AfterSuite
  public void afterSuite() {
	  
	  
  }

}
