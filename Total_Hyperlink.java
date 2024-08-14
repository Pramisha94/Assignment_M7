package com.assignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_Hyperlink {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pramish Vijoy\\Desktop\\Automation\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		List<WebElement> a =driver.findElements(By.tagName("a"));
		System.out.println("Total no.of Hyperlinks "+a.size());
						
			
		driver.close();
	}
}
