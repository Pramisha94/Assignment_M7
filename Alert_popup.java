package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alert_popup 
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Pramish Vijoy\\Desktop\\Automation\\Selenium\\chromedriver-win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  driver.findElement(By.name("cusid")).sendKeys("123");
	  Thread.sleep(2000);
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
	  
	  Alert alert1 = driver.switchTo().alert();
	  String msg1= driver.switchTo().alert().getText();
	  System.out.println("Popup appeared "+msg1);
	  Thread.sleep(2000);
	  alert1.accept();
	  Thread.sleep(2000);
	  	  
	  driver.close();
}
}
