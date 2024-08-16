package com.assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Gmail {

	@Before
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pramish Vijoy\\Desktop\\Automation\\Selenium\\chromedriver-win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  //Thread.sleep(2000);
		  driver.manage().window().maximize();
		  driver.findElement(By.id("email")).sendKeys("pramisha94");
		  Thread.sleep(2000);
		  driver.findElement(By.id("pass")).sendKeys("123456");
		  Thread.sleep(2000);
		  driver.findElement(By.name("login")).click();
		  Thread.sleep(2000);
	}

}
