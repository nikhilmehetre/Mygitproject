package TestNGTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG {
	WebDriver driver;
  @Test (priority = 1)
  public void formfilling() {
	  //System.out.println("1");
	 		
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
	
  }
  
  @Test (priority = 2)
  public void HandleAlerts() throws InterruptedException {
	  //System.out.println("2");
	  driver.get("http://techedgeplus.com/");
	  driver.manage().window().maximize();
      driver.findElement(By.xpath("//*[@id='txtLoginid']")).sendKeys("test1");
      driver.findElement(By.xpath("//*[@id='txtpassword']")).sendKeys("test1");

      driver.findElement(By.id("btnLogin")).click();
      Thread.sleep(4000);
      //driver.switchTo().alert().accept(); // this is to press OK
     driver.switchTo().alert().dismiss(); // this is to cancel
      Thread.sleep(4000);
  }
  
  @Test (priority = 3)
  public void thirdtestcase() {
	  System.out.println("3");
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

