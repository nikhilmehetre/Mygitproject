package com.abc.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		driver.get("http://demo.guru99.com/test/guru99home/");

        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e");
      //  driver.switchTo().frame(0);

        Thread.sleep(2000);
        driver.findElement(By.xpath("html/body/a/img")).click();
        
        //Thread.sleep(5000);
        driver.quit();


	}

}
