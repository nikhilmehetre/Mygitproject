package framework.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage {
	
	@FindBy (id="txtEmail")
	WebElement emailElement;
	
	@FindBy (id="txtContact")
	WebElement phoneElement;
	
	@FindBy (id="txtName")
	WebElement NameElement;

	//By emailparam = By.id("txtEmail");
	//By phoneparam = By.id("txtContact");
	//By nameparam = By.id("txtName");
//	public void setEmail(WebDriver driver, String Email)
	public void setEmail(String Email)
	{
		//driver.findElement(By.id("txtEmail")).sendKeys(Email);
		//driver.findElement(emailparam).sendKeys(Email);
		emailElement.sendKeys(Email);
		
	}
	//public void setPhone(WebDriver driver, String Phone)
	public void setPhone(String Phone)
	{
		//driver.findElement(By.id("txtContact")).sendKeys(Phone);
		//driver.findElement(phoneparam).sendKeys(Phone);
		phoneElement.sendKeys(Phone);
	}
//	public void setName(WebDriver driver, String Name)
	public void setName(String Name)
	{
		//driver.findElement(By.id("txtName")).sendKeys(Name);
//		driver.findElement(nameparam).sendKeys(Name);;
		NameElement.sendKeys(Name);
	}

}
