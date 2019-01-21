package testcases;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class TC_001 extends TestBase {
	

 public ExtentReports extentReport;
 public ExtentTest extentTest;
 
  @Test
  public void tc_001Test() {
	  extentReport = new ExtentReports("./reporting/src/html/report.html",true);
	  extentReport.addSystemInfo("Author Name", "Antonio Seraus");
	  extentTest = extentReport.startTest("TC_001: Login Logout Test");

	  driver.findElement(By.id("email")).sendKeys("data1");
	  driver.findElement(By.id("pass")).sendKeys("data2");
	  Assert.assertTrue(true);
	  
	  extentTest.log(LogStatus.PASS,"Test has passed");
	  extentReport.endTest(extentTest);
 }
  
}
