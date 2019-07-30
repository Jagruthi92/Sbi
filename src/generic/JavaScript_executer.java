package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScript_executer 
{
	public void executeScript(WebDriver driver,int i,String s)
	  {
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		   
		   js.executeScript("docccument.getElementById(i).value=s");
	  }
	  
	  public void scrollBar(WebDriver driver,int i,int j)
	  {
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		   
		   js.executeScript("window.scrollBy(i,j)");
	  }

}
