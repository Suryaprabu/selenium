package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kubera {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sprab\\eclipse-workspace\\project\\SELENIUM\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		String a="https://www.instagram.com/accounts/login/";
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		//driver.navigate().back();
		//driver.navigate().forward();
		String b = driver.getCurrentUrl();
		//System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("wrong");
		}
		Thread.sleep(3000);
		WebElement uName = driver.findElement(By.name("username"));
		uName.sendKeys("suryachella");
		
		
	}

}
//https://www.instagram.com/accounts/login/