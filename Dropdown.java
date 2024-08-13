package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws InterruptedException

{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pramish Vijoy\\Desktop\\Automation\\Selenium\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	Select s1=new Select(driver.findElement(By.name("country")));
	s1.selectByIndex(1);
	Thread.sleep(2000);
	s1.selectByValue("CHINA");
	Thread.sleep(2000);
	
	driver.close();
}
}
