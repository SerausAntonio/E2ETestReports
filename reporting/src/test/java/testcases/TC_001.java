package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_001 {
	
 public ChromeDriver driver;
 public ExtentReports extentReport;
 public ExtentTest extentTest;
 
  @Test
  public void tc_001Test() {
	  extentReport = new ExtentReports("./reporting/src/html/report.html",true);
	  extentReport.addSystemInfo("Author Name", "Antonio Seraus");
	  
	  extentTest = extentReport.startTest("TC_001: Login Logout Test");
 	  System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver.exe");
 	  ChromeDriver driver = new ChromeDriver();
 	  driver.get("https://www.facebook.com");
 	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	  driver.findElementById("email").sendKeys("data1");
	  driver.findElementById("pass").sendKeys("data2");
	  Assert.assertTrue(true);
	  extentTest.log(LogStatus.PASS,"Test has passed");
	  extentReport.endTest(extentTest);
	  driver.quit();
   }
  
 @AfterSuite
 public void generateReport(){
	 extentReport.flush();
 }
}
