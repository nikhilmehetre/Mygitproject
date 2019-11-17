package com.abc.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com/#");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.linkText("Self-learning Courses"));
		Thread.sleep(3000);
		action.moveToElement(element).build().perform();
		WebElement au = driver.findElement(By.linkText("Automation Testing"));
		Thread.sleep(3000);
		action.moveToElement(au).build().perform();
		Thread.sleep(2000);
		WebElement se = driver.findElement(By.linkText("Selenium Self Learning"));
		se.click();
			
		
	}

}
