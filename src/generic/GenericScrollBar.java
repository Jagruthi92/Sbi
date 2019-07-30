package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericScrollBar 
{
	public void scrollBar(WebDriver driver,WebElement ele) throws InterruptedException
	{
		
		Point loc = ele.getLocation();
		   int x = loc.getX();
		   System.out.println(x);
		   int y = loc.getY();
		   System.out.println(y);
		   
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	Thread.sleep(2000);
    js.executeScript("window.scrollBy("+x+","+y+")");

	}
}
