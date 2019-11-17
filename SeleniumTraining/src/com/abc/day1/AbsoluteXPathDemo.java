package com.abc.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbsoluteXPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		try {
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //implicit wait
			
			String innertext = driver.findElement(By.xpath("//html/body/center/table/tbody/tr[2]/td[1]")).getText();
			System.out.println(innertext);
			//String phoneNumber = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/ul/li[3]")).getText();
			//String phoneNumber = driver.findElement(By.xpath("")).getText();
			//System.out.println(phoneNumber);
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
