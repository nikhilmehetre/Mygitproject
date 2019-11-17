package com.abc.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		//page navigation
		driver.navigate().to("http://www.ndtv.com");
		driver.manage().window().maximize();
		//get page info
//		System.out.println(driver.getTitle());
		String actualTitle = null;
		actualTitle = driver.getTitle();
		String expectedTitle = "NDTV: Latest News, India News, Breaking News, Business, Bollywood, Cricket, Videos & Photos";
		
		System.out.println(actualTitle);
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
//		System.out.println(driver.getCurrentUrl());
		driver.close();
			
	}

}
