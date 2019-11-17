package com.abc.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPathTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		try {
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //implicit wait
			
			//count number of columns in a table
			List col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
			System.out.println("number of columns are:-> "+col.size());
			
			//count number of rows in a table
			List rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td"));
			////*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a--> this is copy xpath but go 1 step up to count all rows so final will xpath will be like above 
			System.out.println("number of rows are:-> "+rows.size());
			
			//to go particular value
		    WebElement baseTable = driver.findElement(By.tagName("table"));
			  
					 //To find 2nd row of table
					 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]"));
			         String rowtext = tableRow.getText();
					 System.out.println("Third row of table : "+rowtext);
					    
					    //to get 4th row's 1st column data
					    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]/td[1]"));
					    String valueIneed = cellIneed.getText();
					    System.out.println("Cell value is : " + valueIneed); 

			
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
