package com.abc.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://techcanvass.com/#");
		//driver.manage().window().maximize();
		driver.get("http://techedgeplus.com/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='txtLoginid']")).sendKeys("test1");
        driver.findElement(By.xpath("//*[@id='txtpassword']")).sendKeys("test1");
        driver.findElement(By.xpath("//*[@id='txtpassword']")).sendKeys("asdf");

        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(4000);
        //driver.switchTo().alert().accept(); // this is to press OK
       driver.switchTo().alert().dismiss(); // this is to cancel
        Thread.sleep(4000);
		driver.close();


	}

}
