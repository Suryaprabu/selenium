package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class FlipKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sprab\\eclipse-workspace\\project\\SELENIUM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");
		WebElement uName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		uName.sendKeys("gokul");
		WebElement pName = driver.findElement(By.xpath("//input[@type='password']"));
		pName.sendKeys("9894424989");
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));	
		login.click();
		Thread.sleep(5000);
		 driver.close();
	}

}
