package com.abc.day1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioCheckButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
        //driver.findElements(By.name("exp")).get(1).click();
        driver.findElements(By.name("exp")).get(2).click();
        
        List<WebElement> checkList = driver.findElements(By.name("profession"));
        int checkSize = checkList.size();
        for (int i = 0; i < checkSize; i++) {
            String value = ((WebElement) checkList.get(i)).getAttribute("value");
            if (value.equalsIgnoreCase("Automation Tester")) {
                ((WebElement) checkList.get(i)).click();
            }
        }

	}

}
