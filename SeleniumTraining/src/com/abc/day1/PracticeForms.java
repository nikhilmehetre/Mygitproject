package com.abc.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeForms {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//open the web app
		//driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.navigate().to("https://amazon.in");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		if (title.equalsIgnoreCase("amazon.in"))
			System.out.println("title matches");
		else
			System.out.println("title is->" +title);
		
		String tagname = "";
		tagname = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).getText();
		System.out.println(tagname);
		
		//WebElement tab = driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"))
		Actions action = new Actions(driver);
		action.click();
		
		
		
		//driver.close();
		
		/*
			
			
		
		
		driver.findElement(By.name("firstname")).sendKeys("maahi");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("raahi");
		//driver.findElement(By.name("lastname")).sendKeys("Raahi");
		
		WebElement radio1 = driver.findElement(By.id("sex-0"));
		radio1.click();
		
		// sample for right click on code
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.id("elementId"));
		action.contextClick(element).build().perform(); ///double click
		action.moveToElement(element).build().perform();  //mouse hover
		*/
		
	}

}
