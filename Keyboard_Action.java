package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pramish Vijoy\\Desktop\\Automation\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement w =driver.findElement(By.id("email"));
		Actions action =new Actions(driver);
		action.moveToElement(w).click().keyDown(w, Keys.SHIFT).sendKeys(w, "hello").contextClick().build().perform();
		Thread.sleep(2000);
		
		
		driver.close();
	}

}
