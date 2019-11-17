package com.abc.day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
public class Practice_sel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		String ActualTitle = null;
		ActualTitle = driver.getTitle();
		System.out.println("Actualtitle");
		
		
		
		
	}

}
