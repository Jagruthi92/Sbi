package pom;

import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class Cusom_made_shirt_trouser_jacket_page extends Base_Page
{
	@FindBy(xpath="//a[.='Account']")
	private WebElement account;
	
	@FindBy(xpath="//a[.='Login']")
	private WebElement login;
	
	
	public Cusom_made_shirt_trouser_jacket_page(WebDriver driver)     
	{
	 
		super( driver);
	}
	
	public void verifyTitle1(String title)
	{
		verifyTitle(title);
	}
	public void accountClick(WebDriver driver)
	{
	  Actions a= new Actions(driver);
	  a.moveToElement(account).perform();
	}
	public void loginClick()
	{
	  login.click();
	}
	
	
	

}
