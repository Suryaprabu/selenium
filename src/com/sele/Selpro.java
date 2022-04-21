package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selpro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sprab\\eclipse-workspace\\project\\SELENIUM\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		WebElement userName=driver.findElement(By.name("email"));
		userName.sendKeys("suryachella");
		WebElement passWord = driver.findElement(By.name("pass"));
		passWord.sendKeys("jayasurya");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		
	}

}
