package com.abc.day1;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

public class imdb_quiz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("navbar-query")).sendKeys("Titanic");
		driver.findElement(By.id("navbar-query")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Titanic")).click();
		Thread.sleep(2000);
		
		String time = driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/time")).getText();
		System.out.println("time of the movie is:->" + time);
		int h = 0;
		int m = 0;
		
		String[] value = time.split(" ",2);
		for (int i = 0; i < value.length; i++) {
			String intValue = value[0].replaceAll("[^0-9]", "");
			h = Integer.parseInt(intValue);
			String intValue2 = value[1].replaceAll("[^0-9]", "");
			m = Integer.parseInt(intValue2);
						
		}
		int dur = ((h*60)+m);
		if (dur < 180) {
			System.out.println("duration is less than 180 minutes\t" +dur);
		}
		else {
			System.out.println("duration is greater than 180 minutes\t->"+dur);
		}
		//System.out.println("total duration of movie in minutes is->"+dur);
		
		
				
		/*
		for (int i = 0; i < 1; i++) {
			String[] items= hour[i].split("h");
			//Integer h= Integer.valueOf(items[0]);
			Integer h= Integer.parseInt(items[0]);
			//Integer m =Integer.valueOf(items[1]);
			//Integer m = Integer.parseInt(items[1]);
		
			for (int j = 1; j < 2; j++) {
				String[] item= hour[j].split("min");
				Integer m= Integer.parseInt(item[0]);
			
			System.out.println("total duration in minutes is" +(h*60+m));
			}
		}*/
				
		//System.out.println("hour is" +hour);
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/time")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/a[1]")).getText());
		String Actualtitle = (driver.findElement(By.linkText("Drama")).getText());
		String expectedTitle= "Drama";
		assertEquals(expectedTitle, Actualtitle);
		//Select select = new Select(driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div")));
		//select.selectByIndex(3);
		//System.out.println();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/a[3]")).getText());
		
		driver.close();
		
		
		
		
		
		
	}

}
