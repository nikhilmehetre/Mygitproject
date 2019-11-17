package TutorialPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		select.selectByVisibleText("Alexa Skills");
		
		/*driver.findElement(By.name("txtName")).sendKeys("Jyoti");
		driver.findElement(By.id("txtEmail")).sendKeys("jyot11@gmail.com");
		//driver.findElement(By.name("txtContact")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"txtName\"]")).sendKeys("1234567890");
		//driver.findElement(By.id("txtMessage")).sendKeys("life is gr8");
		driver.findElement(By.xpath("//*[@id=\"txtMessage\"]")).sendKeys("you win");
		
		Select select = new Select(driver.findElement(By.;
		select.selectByVisibleText("Course Enquiry");
		
		driver.findElement(By.name("btnSubmit")).click();
		*/
		
		
				
		
	}

}
