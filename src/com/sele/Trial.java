package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sprab\\eclipse-workspace\\project\\SELENIUM\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 driver.get("https://www.facebook.com/");
			 String a ="https://www.facebook.com/";
			String currentUrl = driver.getCurrentUrl();
			Boolean b=currentUrl.equals(a);
			System.out.println(b);		
			}
	}

