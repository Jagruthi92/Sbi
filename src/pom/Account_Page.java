package pom;

import junit.framework.Assert;
import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Account_Page extends Base_Page
{
	
	@FindBy(id="CustomerEmail")
	private WebElement email;
	
	@FindBy(id="CustomerPassword")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement login;
	
	@FindBy(xpath="(//a[.='Jackets'])[1]")
	private WebElement jacket;
	
	@FindBy(xpath="(//a[.='Jackets'])[2]")
	private WebElement jacket1;
	
	@FindBy(xpath="//li[.='Invalid login ")
	private WebElement errormsg;
	
	
	
	
	
	public Account_Page (WebDriver driver)     
	{
	 
		super( driver);
	}
	public void setEmail(String s1)
	{
	email.sendKeys(s1);
	}
	public void setPwd(String s2)
	{
	  pwd.sendKeys(s2);
	}
	public void clickLogin()
	{
		login.click();
	}
	public void jacketClick(WebDriver driver)
	{
	  Actions a= new Actions(driver);
	  a.moveToElement(jacket).perform();
	}
	public void jacket1click()
	{
	  jacket1.click();
	}
	public void verifyErrorMsg()
	{
		verifyEleement(errormsg);
	}
	

}
