package com.abc.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppersstop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shoppersstop.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//driver.
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("The Hangover")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/time")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/a[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titleUserReviewsTeaser\"]/div/span[1]/div[1]/a[1]/span")).getText());
		
		driver.close();
	}

}
