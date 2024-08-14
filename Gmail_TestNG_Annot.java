package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail_TestNG_Annot 
{
	WebDriver driver=null;
	@BeforeTest
  public void beforetest() throws InterruptedException 
  {   
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pramish Vijoy\\Desktop\\Automation\\Selenium\\chromedriver-win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/intl/en-US/gmail/about/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
   }
  @Test
  public void login() throws InterruptedException
  {
	  driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("identifier")).sendKeys("pramisha94");
	  Thread.sleep(2000);
	  driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("Passwd")).sendKeys("Ta@123");
	  Thread.sleep(2000);
  }
  @AfterTest  
  public void logout() throws InterruptedException
	 { 
		Thread.sleep(2000);
		driver.close();
	 }
}
