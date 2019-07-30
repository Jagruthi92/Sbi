package generic;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenericWindHandle 
{
public void SwitchTo(WebDriver driver,WebElement w) throws InterruptedException, AWTException
{
	Actions a=new Actions(driver);
    a.contextClick(w).perform();
    
    Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	
    String parent = driver.getWindowHandle();
    Thread.sleep(3000);
    
    Set<String> all = driver.getWindowHandles();
    all.remove(parent);
   
    
    Thread.sleep(3000);
    for(String we:all)
    {
    driver.switchTo().window(we);
    }
}
    
}
