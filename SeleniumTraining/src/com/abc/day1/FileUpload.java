package com.abc.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/upload");
		
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\Users\\Nikhil\\Desktop\\applications\\india\\CV.txt");
		driver.findElement(By.id("uploadfile_0")).click();
	}

}
