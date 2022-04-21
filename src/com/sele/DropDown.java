
package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sprab\\eclipse-workspace\\project\\SELENIUM\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
   
	WebElement element = driver.findElement(By.xpath("//select[@id='first']"));
	Select s =new Select(element);
	s.selectByIndex(2);
	//s.selectByValue("Apple");
	//s.selectByVisibleText("Yahoo");
	WebElement element1  = driver.findElement(By.xpath("//select[@id='second']"));
	Select s1 =new Select(element1);
	s1.selectByIndex(1);
	s1.selectByIndex(2);
	s1.selectByIndex(0);
	List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
	for (WebElement x : allSelectedOptions) {
		System.out.println(x.getText());
	}
		
	}
	

	
	}


