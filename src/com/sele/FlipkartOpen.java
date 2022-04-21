package com.sele;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class FlipkartOpen {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sprab\\eclipse-workspace\\project\\SELENIUM\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			WebElement dc=driver.findElement(By.xpath("//button[text()='✕']"));
			dc.click();
			
			
			WebElement element= driver.findElement(By.xpath("//div[text()='Fashion']"));
			Actions ad = new Actions(driver);
			ad.moveToElement(element).perform();
			
		
	}

}
