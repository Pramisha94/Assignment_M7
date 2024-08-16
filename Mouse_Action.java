package com.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pramish Vijoy\\Desktop\\Automation\\Selenium\\chromedriver-win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://demo.guru99.com/test/newtours/");
		  Thread.sleep(2000);
		  WebElement element = driver.findElement(By.linkText("Home"));
		  Thread.sleep(2000);
		 		  
		  Actions action = new Actions(driver);
		  action.moveToElement(element).perform();
		  Thread.sleep(2000);
		  		  
		  driver.close();
		  
	}

}
