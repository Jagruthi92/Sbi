package scripts;

import org.testng.annotations.Test;

import pom.Account_Page;
import pom.Cusom_made_shirt_trouser_jacket_page;
import generic.Generic_Annotation;
import generic.Generic_read_single_data;

public class ValidUnPwd extends Generic_Annotation
{
	
	@Test(priority=-2)
	public void testValidUnPwd() throws InterruptedException
	{
		Cusom_made_shirt_trouser_jacket_page cp= new Cusom_made_shirt_trouser_jacket_page(driver);
		Thread.sleep(3000);
		String title = Generic_read_single_data.getCellValue("ValidUnPwd", 1, 3);
		Thread.sleep(2000);
		cp.verifyTitle1(title);
		
		Thread.sleep(3000);
		cp.accountClick(driver);
		
		Thread.sleep(3000);
		cp.loginClick();
		
		Thread.sleep(3000);
		String title1 = Generic_read_single_data.getCellValue("ValidUnPwd", 1, 2);
		
		cp.verifyTitle1(title1);
		
		Account_Page ap= new Account_Page(driver);
		Thread.sleep(3000);
		String un = Generic_read_single_data.getCellValue("ValidUnPwd", 1, 0);
		
		ap.setEmail(un);
		
		Thread.sleep(3000);
		String pwd = Generic_read_single_data.getCellValue("ValidUnPwd", 1, 1);
		ap.setPwd(pwd);
		
		
		Thread.sleep(3000);
		ap.clickLogin();
		
		
		
		
	}
}