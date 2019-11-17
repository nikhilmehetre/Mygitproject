package com.abc.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class form_fillling_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		
		//driver.findElement(By.name("txtName")).sendKeys("nikhil");
		driver.findElement(By.xpath("//*[@id='txtName']")).sendKeys("rhythm");
		driver.findElement(By.name("txtEmail")).sendKeys("nikhilbm2000@yahoo.co.in");
		driver.findElement(By.name("txtContact")).sendKeys("123456");
		//driver.findElement(By.id("txtMessage")).sendKeys("life is gr8");
		driver.findElement(By.xpath("//*[@id=\"txtMessage\"]")).sendKeys("you win");
		
		Select select = new Select(driver.findElement(By.id("ddlSubject")));
		//select.selectByVisibleText("Complaints");
		//select.selectByIndex(2);
		select.selectByValue("Course Enquiry");
		
		
		driver.findElement(By.name("btnSubmit")).click();
		
		driver.findElement(By.linkText("Buy Online")).click();
		
	}

}
