package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericScreenshot implements Auto_const
{
	public static void getPhoto(WebDriver driver,String tcname) throws IOException
	{
		
	
// String photos="./photos/";
  
 Date d= new Date();
  
  String d1= d.toString();
  
  String date= d1.replaceAll(":", "-");
  
  TakesScreenshot ts= (TakesScreenshot) driver;
	
  File src = ts.getScreenshotAs(OutputType.FILE);
  
  File dst= new File(PHOTO_PATH+date+tcname+".jpeg");
  
  FileUtils.copyFile(src, dst);
}

}
