package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Generic_Annotation implements Auto_const
{
	public WebDriver driver;
	static
	{
	   System.setProperty(GECKO_KEY, GECKO_VALUE);
	   System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	@Parameters({"browser"})
	@BeforeMethod
    public void openAppln(String browser)
    {
		if(browser.equals("chrome"))
		{
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://luxire.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else{
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://luxire.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
	 }
	
	@AfterMethod
	
	public void closeAppln(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		
		String tcname = res.getName();
		
		if(status==res.FAILURE)
		{
			GenericScreenshot.getPhoto(driver, tcname);
			Reporter.log(tcname, true);
		}
		driver.quit();
	}
	
    
    
}
