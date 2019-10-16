package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\Programs\\eclipse-java-oxygen-3a-win32\\eclipse\\guhanday2sel\\Facebook\\chromedriver\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://www.facebook.com/");
	WebElement username=a.findElement(By.id("email"));
	username.sendKeys("hello");
	WebElement password=a.findElement(By.id("pass"));
	password.sendKeys("1234");
	} 

}
