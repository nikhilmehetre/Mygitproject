package com.abc.day1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitFirst {

	@Test
	public void testSetEmailId() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techcanvass.com");
		
		driver.manage().window().maximize();
		
		//page navigation
		driver.navigate().to("https://techcanvass.com/Contact-Techcanvass.aspx");
		
		//Get page title
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		assertEquals("Contact Us - TechCanvass", driver.getTitle());
	}

	

}
