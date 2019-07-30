package scripts;

import generic.Generic_Annotation;
import generic.Generic_read_single_data;

import org.testng.annotations.Test;

import pom.Account_Page;
import pom.Cusom_made_shirt_trouser_jacket_page;
import pom.Jackets_Page;
import pom.Luxire_Yorkshire_TweetedLoden_page;
import pom.Your_ShoppingCart_Page;

public class AddToCart extends Generic_Annotation
{
	@Test(priority=-1)
	public void testAddToCart() throws InterruptedException
	{
		Cusom_made_shirt_trouser_jacket_page cp= new Cusom_made_shirt_trouser_jacket_page(driver);
		Thread.sleep(2000);
		String title = Generic_read_single_data.getCellValue("AddToCart", 1, 3);
		Thread.sleep(2000);
		cp.verifyTitle1(title);
		
		Thread.sleep(3000);
		cp.accountClick(driver);
		
		Thread.sleep(2000);
		cp.loginClick();
		
		Thread.sleep(2000);
		String title1 = Generic_read_single_data.getCellValue("AddToCart", 1, 2);
		
		cp.verifyTitle1(title1);
		
		Account_Page ap= new Account_Page(driver);
		Thread.sleep(3000);
		String un = Generic_read_single_data.getCellValue("AddToCart", 1, 0);
		
		ap.setEmail(un);
		
		Thread.sleep(3000);
		String pwd = Generic_read_single_data.getCellValue("AddToCart", 1, 1);
		ap.setPwd(pwd);
		
		
		Thread.sleep(3000);
		ap.clickLogin();
		
		Thread.sleep(3000);
		ap.jacketClick(driver);
		
	     Thread.sleep(3000);
		ap.jacket1click();
		
		Jackets_Page jp= new Jackets_Page(driver);
		
		
		Thread.sleep(3000);
		jp.click();
		
//		String title3 = Generic_read_single_data.getCellValue("AddToCart", 1, 4);
//		jp.verifyTitlejacket(title3);
		
		Luxire_Yorkshire_TweetedLoden_page lp= new Luxire_Yorkshire_TweetedLoden_page(driver);
		Thread.sleep(2000);
		lp.selStyle();
		
		Thread.sleep(2000);
		lp.mouseOverStyle(driver);
		
		Thread.sleep(2000);
		lp.selectClick();
		
		Thread.sleep(2000);
		lp.select();
		
		Thread.sleep(2000);
		lp.cart();
		
		Your_ShoppingCart_Page yp= new Your_ShoppingCart_Page(driver);
		Thread.sleep(2000);
		yp.removeClick();
		
//		Thread.sleep(2000);
//		yp.mouseHover();
//		
//		
//		Thread.sleep(2000);
//		yp.logoutClick();
//		String text1 = Generic_read_single_data.getCellValue("AddToCart", 1, 6);
//		Thread.sleep(3000);
//		yp.checkText(text1);
//		
//		Thread.sleep(3000);
//		
		
		
	}

}
