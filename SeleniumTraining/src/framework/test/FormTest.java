package framework.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import framework.Pages.*;

public class FormTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
			
			FormPage mypage = PageFactory.initElements(driver, FormPage.class);
			mypage.setEmail("nikhilbm2000@yahoo.co.in");
			mypage.setPhone("1234");
			mypage.setName("nikhil");
			
			//FormPage mypage = new FormPage();
			//mypage.setEmail(driver, "nikhilbm2000@yahoo.co.in");
			//mypage.setPhone(driver, "1234");
			//mypage.setName(driver, "nikhil");
			
		
			//driver.close();
	}

}
