package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class TC_003 extends TestBase {
 
  
  @Test
  public void tc_003() {
	  driver.findElement(By.id("email")).sendKeys("data1");
	  driver.findElement(By.id("pass")).sendKeys("data2");
	  Assert.assertTrue(false);
	  
   }

}
