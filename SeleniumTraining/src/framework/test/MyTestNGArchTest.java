package framework.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class MyTestNGArchTest {
	WebDriver driver;
	
  @Test
  public void CheckPageTitle() {
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, "Contact Us - TechCanvass");
	  
  }
  @Test
  public void CheckUrl() {
	  String ActualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(ActualUrl, "https://techcanvass.com/Contact-Techcanvass.aspx");
	  
  }

@BeforeTest
  public void beforeTest() {
	  System.out.println("before");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
  }
  @AfterTest
  public void AfterTest() {
	  System.out.println("after");
		driver.close(); 
  }

}
