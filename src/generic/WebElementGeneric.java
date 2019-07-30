package generic;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class WebElementGeneric 
{
	public void location(WebElement ele)
	{
		ele.getLocation();
	}
	
	public void clearAction(WebElement ele)
	{
	  ele.clear();
	  
	}

	public void clickAction(WebElement ele)
	{
	  ele.click();
	  
	}

	public void getAttr(WebElement ele,String s)
	{
	 String text = ele.getAttribute(s);
	 Reporter.log(text, true);
	  
	}

	public void getCss(WebElement ele,String s)
	{
	 String c = ele.getCssValue(s);
	 Reporter.log(c, true);
	}

	public void getRectangle(WebElement ele)
	{
	  Rectangle r = ele.getRect();
	  System.out.println(r);
	  }

	public void Size(WebElement ele)
	{
	  Dimension size = ele.getSize();
	  System.out.println(size);
	  }

	public void tagName(WebElement ele)
	{
	  String name = ele.getTagName();
	  Reporter.log(name, true);
	  }

	public void text(WebElement ele)
	{
	  String text = ele.getText();
	  Reporter.log(text, true);
	  }

	public void displayed(WebElement ele)
	{
	  boolean b = ele.isDisplayed();
	  System.out.println(b);
	  }

	public void enable(WebElement ele)
	{
	  boolean b = ele.isEnabled();
	  System.out.println(b);
	  }

	public void selected(WebElement ele)
	{
	  boolean b = ele.isSelected();
	  System.out.println(b);
	  }
	
	public void sendData(WebElement ele,String s1)
	{
	  ele.sendKeys(s1);
	  
	  }

	}



