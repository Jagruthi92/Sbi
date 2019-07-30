package generic;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionGeneric 
{
	
	Actions a;
	
	public ActionGeneric (WebDriver driver)
	{
		a=new Actions(driver);
	}
public void MouseHover(WebElement ele)
{
	
	a.moveToElement(ele).perform();
	}

public void dragDrop(WebDriver driver,WebElement ele,WebElement ele1)
{
	
	a.dragAndDrop(ele, ele1).perform();
	
}

public void doubleClicks(WebDriver driver,WebElement ele)
{
	
	a.doubleClick(ele).perform();
}

public void rightClick(WebDriver driver,WebElement ele)
{
	
	a.contextClick(ele).perform();
}
}
