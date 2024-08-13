package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Reg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pramish Vijoy\\Desktop\\Automation\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en/gmail/about/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/main/div[1]/div/div/div/div/div[1]/div[3]/div[1]/details/summary/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/main/div[1]/div/div/div/div/div[1]/div[3]/div[1]/details/div/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Pramisha");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Vijoy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//*[@id=\"month\"]/option[11]")).click();
		driver.findElement(By.id("day")).sendKeys("10");
		driver.findElement(By.id("year")).sendKeys("1990");
		driver.findElement(By.id("gender")).click();
		driver.findElement(By.xpath("//*[@id=\"gender\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("selectionc4")).click();
		driver.findElement(By.name("Username")).sendKeys("pramishavij90");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("Passwd")).sendKeys("PV@12345");
		driver.findElement(By.name("PasswdAgain")).sendKeys("PV@12345");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("phoneNumberId")).sendKeys("9408781121");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		
		
		driver.close();
	}
}
