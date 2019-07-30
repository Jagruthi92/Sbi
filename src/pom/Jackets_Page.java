package pom;

import java.util.List;

import generic.Base_Page;
import generic.GenericwriteText;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Jackets_Page extends Base_Page
{
	@FindBy(xpath="//p/a")
	private List<WebElement> links;
	
	@FindBy(xpath="(//p/a)[61]")
	private WebElement jacclick;
	
	public  Jackets_Page(WebDriver driver)     
	{
	 
		super( driver);
	}
	
	
	
	
	
	public void getLink() 
	{
		
	  int count4 = links.size();
	  System.out.println(count4);
	  try{
	  GenericwriteText gt= new GenericwriteText();
	  
	  gt.write(links, "./EXCEL/excel1.xlsx", "sheet1", "./EXCEL/excel1.xlsx", 2);
	  }
	  catch(Exception e)
	  {
		  Reporter.log("data is not written", true);
	  }
	}
	
	public void click()
	{
	  jacclick.click();
	}
	
	public void verifyTitlejacket(String title)
	{
		verifyTitle(title);
	}
	

}
