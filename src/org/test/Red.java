package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red {
public static void main(String[] args) {
	System.setProperty("webdrive.chrome.drive","C:\\Users\\admin\\Downloads\\Programs\\eclipse-java-oxygen-3a-win32\\eclipse\\guhanday2sel\\Facebook\\chromedriver\\chromedriver.exe");
   WebDriver a=new ChromeDriver();
   a.get("https://www.redbus.in/");
   WebElement from=a.findElement(By.id(""));
   from.sendKeys("chennai");
   WebElement to=a.findElement(By.id(""));
   to.sendKeys("Thanjavur");
}
}
