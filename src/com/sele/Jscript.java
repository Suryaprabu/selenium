package com.sele;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jscript {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sprab\\eclipse-workspace\\project\\SELENIUM\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.close();
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		Actions a =new Actions(driver);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','selenium')",username);
		js.executeScript("arguments[0].setAttribute('value','9894424989')",password);
        Object executeScript1 = js.executeScript("return arguments[0].getAttribute('value')", username);
        System.out.println(executeScript1);
        Thread.sleep(3000);
        WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
        js.executeScript("arguments[0].scrollIntoView(true)",help);
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(false)",help);
}
}