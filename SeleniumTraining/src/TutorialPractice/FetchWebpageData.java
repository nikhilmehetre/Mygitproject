package TutorialPractice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FetchWebpageData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://www.amazon.in/";
		driver.manage().window().maximize();
		String expectedtitle= "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String ActualTitle="";
		
		driver.get(baseurl);
		
		ActualTitle = driver.getTitle();
		
		if (ActualTitle.contentEquals(expectedtitle)) {
			System.out.println("Passed");
		}else {
			System.out.println("failed"+ActualTitle);
		}
		driver.close();
		}
		
	

}
