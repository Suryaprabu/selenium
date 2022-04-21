package com.sele;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sprab\\eclipse-workspace\\project\\SELENIUM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement sear = driver.findElement(By.id("twotabsearchtextbox"));
		sear.sendKeys("ne 11 lite 5g",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
		//driver.findElement(By.id("productTitle")).click();
		String pWin = driver.getWindowHandle();
		Set<String> cWin = driver.getWindowHandles();
		for(String x:cWin) {
			if(!pWin.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		
		
	}
}
