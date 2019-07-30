package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.ActionGeneric;
import generic.Base_Page;

public class Luxire_Yorkshire_TweetedLoden_page extends Base_Page
{
	@FindBy(xpath="(//div[@class='select__placeholder'])[1]")
	private WebElement selectStyle;
	
	@FindBy(xpath="//span[.='Inhouse style']")
	private WebElement style;
	
	@FindBy(xpath="(//div[@class='style-select__item-add'])[1]")
	private WebElement select;
	
	
	@FindBy(xpath="//label[.='Slim']")
	private WebElement selectSize;
	
	@FindBy(xpath="//span[@class='loading-icon']")
	private WebElement addCart;
	
	
	public  Luxire_Yorkshire_TweetedLoden_page(WebDriver driver)     
	{
	 
		super( driver);
	}
	
	
	public void selStyle()
	{
		selectStyle.click();
	}
	public void mouseOverStyle(WebDriver driver)
	{
		ActionGeneric ag= new ActionGeneric(driver);
		ag.MouseHover(style);
	}
	
	public void selectClick()
	{
		select.click();
	}
	
	public void select()
	{
		selectSize.click();
	}
	
	public void cart()
	{
		addCart.click();
	}


}
