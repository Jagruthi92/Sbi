package pom;

import generic.ActionGeneric;
import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class Your_ShoppingCart_Page extends Base_Page
{
	@FindBy(xpath="//small[.='Remove']")
	private WebElement remove;
	
	@FindBy(xpath="//p[.='Your cart is currently empty.']")
	private WebElement check;
	
	@FindBy(xpath="(//a[.='Account'])[2]")
	private WebElement Account;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
	
	public Your_ShoppingCart_Page (WebDriver driver)     
	{
	 
		super( driver);
	}
	
	public void removeClick()
	{
		remove.click();
	}
	
	public void checkText(String text)
	{
		String text1 = check.getText();
		try{
		Assert.assertEquals(text1, text);
		Reporter.log("cart is empty", true);
		}
		catch(Exception e)
		{
			Reporter.log("cart is not empty", true);
		
		}
		 
		
	}
	public void mouseHover()
	{
		ActionGeneric ag= new ActionGeneric(driver);
		ag.MouseHover(Account);
	}
	
	public void logoutClick()
	{
		logout.click();
	}

	

}
