package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Samsung {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sprab\\eclipse-workspace\\project\\SELENIUM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement acc = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(source, acc).build().perform();
		
		Thread.sleep(3000);
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement acc1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(3000);
		ac.dragAndDrop(source1, acc1).build().perform();
        
		
		
		WebElement sour = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement acc2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(3000);
		ac.dragAndDrop(sour,acc2).build().perform();
		
       Thread.sleep(5000);
		
		WebElement sour1 = driver.findElement(By.xpath("//a[contains(text(),' 5000')]"));
		WebElement acc23 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(3000);
		ac.dragAndDrop(sour1,acc23).build().perform();
		

		
	}

}
