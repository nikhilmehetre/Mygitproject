package com.abc.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.description.modifier.Visibility;

public class ExplicitImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		try {
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //implicit wait
			
			//for explicit wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		//locators	
		driver.findElement(By.name("txtzName")).sendKeys("nikhil");
		driver.findElement(By.name("txtEmail")).sendKeys("nikhilbm2000@yahoo.co.in");
		driver.findElement(By.name("txtContact")).sendKeys("123456");
		
		WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSubmit")));
		submitButton.click();
		
		} 
		catch (Exception e)
			{
		e.printStackTrace();
			}
		finally {
		driver.close();
	}
	}

}
