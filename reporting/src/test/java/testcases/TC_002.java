package testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TC_002 {
	public ChromeDriver driver;

  @Test
  public void tc_002Test (){
 	  System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver.exe");
 	  ChromeDriver driver = new ChromeDriver();
 	  driver.get("https://www.facebook.com");
 	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	  driver.findElementById("email").sendKeys("data1");
	  driver.findElementById("pass").sendKeys("data2");
	  Assert.assertTrue(true);
	  
	  driver.quit();
 }
  @AfterSuite
  public void generateReport(){
 	 
  }

}
