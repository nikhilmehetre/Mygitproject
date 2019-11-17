package TutorialPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingGUIElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "http://techedgeplus.com//";
		driver.manage().window().maximize();
		//String tagname = "";
		
		driver.get(baseurl);
		driver.findElement(By.id("txtLoginid")).sendKeys("nikhilmehetre@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.id("btnLogin")).click();
		//System.out.println(tagname);
		driver.close();
		System.exit(0);
		
		
		
	}

}
