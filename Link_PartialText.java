package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_PartialText {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pramish Vijoy\\Desktop\\Automation\\Selenium\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://phptravels.com/demo/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Pricing")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("De")).click();
	Thread.sleep(2000);
	
	driver.close();
}
}
